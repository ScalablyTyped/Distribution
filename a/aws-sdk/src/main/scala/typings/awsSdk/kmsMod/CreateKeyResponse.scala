package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyResponse extends js.Object {
  
  /**
    * Metadata associated with the CMK.
    */
  var KeyMetadata: js.UndefOr[typings.awsSdk.kmsMod.KeyMetadata] = js.native
}
object CreateKeyResponse {
  
  @scala.inline
  def apply(): CreateKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyResponse]
  }
  
  @scala.inline
  implicit class CreateKeyResponseOps[Self <: CreateKeyResponse] (val x: Self) extends AnyVal {
    
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
    def setKeyMetadata(value: KeyMetadata): Self = this.set("KeyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMetadata: Self = this.set("KeyMetadata", js.undefined)
  }
}
