package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisFirehoseDestination extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
    */
  var DeliveryStreamARN: AmazonResourceName = js.native
  
  /**
    * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose stream.
    */
  var IAMRoleARN: AmazonResourceName = js.native
}
object KinesisFirehoseDestination {
  
  @scala.inline
  def apply(DeliveryStreamARN: AmazonResourceName, IAMRoleARN: AmazonResourceName): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamARN = DeliveryStreamARN.asInstanceOf[js.Any], IAMRoleARN = IAMRoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  
  @scala.inline
  implicit class KinesisFirehoseDestinationMutableBuilder[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamARN(value: AmazonResourceName): Self = StObject.set(x, "DeliveryStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMRoleARN(value: AmazonResourceName): Self = StObject.set(x, "IAMRoleARN", value.asInstanceOf[js.Any])
  }
}
