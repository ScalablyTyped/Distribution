package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePublishingDestinationResponse extends StObject {
  
  /**
    * The ID of the publishing destination.
    */
  var DestinationId: String = js.native
  
  /**
    * A DestinationProperties object that includes the DestinationArn and KmsKeyArn of the publishing destination.
    */
  var DestinationProperties: typings.awsSdk.guarddutyMod.DestinationProperties = js.native
  
  /**
    * The type of publishing destination. Currently, only Amazon S3 buckets are supported.
    */
  var DestinationType: typings.awsSdk.guarddutyMod.DestinationType = js.native
  
  /**
    * The time, in epoch millisecond format, at which GuardDuty was first unable to publish findings to the destination.
    */
  var PublishingFailureStartTimestamp: Long = js.native
  
  /**
    * The status of the publishing destination.
    */
  var Status: PublishingStatus = js.native
}
object DescribePublishingDestinationResponse {
  
  @scala.inline
  def apply(
    DestinationId: String,
    DestinationProperties: DestinationProperties,
    DestinationType: DestinationType,
    PublishingFailureStartTimestamp: Long,
    Status: PublishingStatus
  ): DescribePublishingDestinationResponse = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DestinationProperties = DestinationProperties.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], PublishingFailureStartTimestamp = PublishingFailureStartTimestamp.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePublishingDestinationResponse]
  }
  
  @scala.inline
  implicit class DescribePublishingDestinationResponseMutableBuilder[Self <: DescribePublishingDestinationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationProperties(value: DestinationProperties): Self = StObject.set(x, "DestinationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishingFailureStartTimestamp(value: Long): Self = StObject.set(x, "PublishingFailureStartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PublishingStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
