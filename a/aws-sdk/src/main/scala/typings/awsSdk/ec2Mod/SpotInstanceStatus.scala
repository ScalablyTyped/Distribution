package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceStatus extends js.Object {
  
  /**
    * The status code. For a list of status codes, see Spot status codes in the Amazon EC2 User Guide for Linux Instances.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The description for the status code.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The date and time of the most recent status update, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var UpdateTime: js.UndefOr[DateTime] = js.native
}
object SpotInstanceStatus {
  
  @scala.inline
  def apply(): SpotInstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceStatus]
  }
  
  @scala.inline
  implicit class SpotInstanceStatusOps[Self <: SpotInstanceStatus] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUpdateTime(value: DateTime): Self = this.set("UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("UpdateTime", js.undefined)
  }
}
