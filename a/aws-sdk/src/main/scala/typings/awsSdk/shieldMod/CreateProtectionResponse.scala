package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProtectionResponse extends js.Object {
  
  /**
    * The unique identifier (ID) for the Protection object that is created.
    */
  var ProtectionId: js.UndefOr[typings.awsSdk.shieldMod.ProtectionId] = js.native
}
object CreateProtectionResponse {
  
  @scala.inline
  def apply(): CreateProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProtectionResponse]
  }
  
  @scala.inline
  implicit class CreateProtectionResponseOps[Self <: CreateProtectionResponse] (val x: Self) extends AnyVal {
    
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
    def setProtectionId(value: ProtectionId): Self = this.set("ProtectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionId: Self = this.set("ProtectionId", js.undefined)
  }
}
