package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketNotificationConfigurationDetail extends StObject {
  
  /**
    * The ARN of the Lambda function, Amazon SQS queue, or Amazon SNS topic that generates the notification.
    */
  var Destination: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of events that trigger a notification.
    */
  var Events: js.UndefOr[AwsS3BucketNotificationConfigurationEvents] = js.undefined
  
  /**
    * The filters that determine which S3 buckets generate notifications.
    */
  var Filter: js.UndefOr[AwsS3BucketNotificationConfigurationFilter] = js.undefined
  
  /**
    * Indicates the type of notification. Notifications can be generated using Lambda functions, Amazon SQS queues, or Amazon SNS topics, with corresponding valid values as follows:    LambdaConfiguration     QueueConfiguration     TopicConfiguration   
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketNotificationConfigurationDetail {
  
  inline def apply(): AwsS3BucketNotificationConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketNotificationConfigurationDetail]
  }
  
  extension [Self <: AwsS3BucketNotificationConfigurationDetail](x: Self) {
    
    inline def setDestination(value: NonEmptyString): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEvents(value: AwsS3BucketNotificationConfigurationEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setFilter(value: AwsS3BucketNotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
