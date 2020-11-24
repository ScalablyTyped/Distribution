package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyRotationStatusResponse extends js.Object {
  
  /**
    * A Boolean value that specifies whether key rotation is enabled.
    */
  var KeyRotationEnabled: js.UndefOr[BooleanType] = js.native
}
object GetKeyRotationStatusResponse {
  
  @scala.inline
  def apply(): GetKeyRotationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyRotationStatusResponse]
  }
  
  @scala.inline
  implicit class GetKeyRotationStatusResponseOps[Self <: GetKeyRotationStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setKeyRotationEnabled(value: BooleanType): Self = this.set("KeyRotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyRotationEnabled: Self = this.set("KeyRotationEnabled", js.undefined)
  }
}
