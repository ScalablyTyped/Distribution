package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeliveryStreamOutput extends js.Object {
  
  /**
    * The ARN of the delivery stream.
    */
  var DeliveryStreamARN: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamARN] = js.native
}
object CreateDeliveryStreamOutput {
  
  @scala.inline
  def apply(): CreateDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeliveryStreamOutput]
  }
  
  @scala.inline
  implicit class CreateDeliveryStreamOutputOps[Self <: CreateDeliveryStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeliveryStreamARN(value: DeliveryStreamARN): Self = this.set("DeliveryStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryStreamARN: Self = this.set("DeliveryStreamARN", js.undefined)
  }
}
