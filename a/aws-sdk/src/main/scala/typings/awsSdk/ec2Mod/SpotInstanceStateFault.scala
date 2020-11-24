package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceStateFault extends js.Object {
  
  /**
    * The reason code for the Spot Instance state change.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The message for the Spot Instance state change.
    */
  var Message: js.UndefOr[String] = js.native
}
object SpotInstanceStateFault {
  
  @scala.inline
  def apply(): SpotInstanceStateFault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceStateFault]
  }
  
  @scala.inline
  implicit class SpotInstanceStateFaultOps[Self <: SpotInstanceStateFault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
