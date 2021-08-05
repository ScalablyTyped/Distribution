package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseDestination extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
    */
  var DeliveryStreamARN: AmazonResourceName
  
  /**
    * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose stream.
    */
  var IAMRoleARN: AmazonResourceName
}
object KinesisFirehoseDestination {
  
  inline def apply(DeliveryStreamARN: AmazonResourceName, IAMRoleARN: AmazonResourceName): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamARN = DeliveryStreamARN.asInstanceOf[js.Any], IAMRoleARN = IAMRoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  
  extension [Self <: KinesisFirehoseDestination](x: Self) {
    
    inline def setDeliveryStreamARN(value: AmazonResourceName): Self = StObject.set(x, "DeliveryStreamARN", value.asInstanceOf[js.Any])
    
    inline def setIAMRoleARN(value: AmazonResourceName): Self = StObject.set(x, "IAMRoleARN", value.asInstanceOf[js.Any])
  }
}
