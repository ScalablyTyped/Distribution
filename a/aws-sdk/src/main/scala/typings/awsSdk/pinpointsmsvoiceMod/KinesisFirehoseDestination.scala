package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisFirehoseDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that can write data to an Amazon Kinesis Data Firehose stream.
    */
  var DeliveryStreamArn: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose destination that you want to use in the event destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.native
}
object KinesisFirehoseDestination {
  
  @scala.inline
  def apply(): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  
  @scala.inline
  implicit class KinesisFirehoseDestinationMutableBuilder[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamArn(value: String): Self = StObject.set(x, "DeliveryStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamArnUndefined: Self = StObject.set(x, "DeliveryStreamArn", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
  }
}
