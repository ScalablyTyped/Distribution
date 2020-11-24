package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHapgResponse extends js.Object {
  
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HapgArn] = js.native
}
object CreateHapgResponse {
  
  @scala.inline
  def apply(): CreateHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHapgResponse]
  }
  
  @scala.inline
  implicit class CreateHapgResponseOps[Self <: CreateHapgResponse] (val x: Self) extends AnyVal {
    
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
    def setHapgArn(value: HapgArn): Self = this.set("HapgArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHapgArn: Self = this.set("HapgArn", js.undefined)
  }
}
