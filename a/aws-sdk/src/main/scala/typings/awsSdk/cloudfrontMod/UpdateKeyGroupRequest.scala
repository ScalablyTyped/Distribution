package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateKeyGroupRequest extends js.Object {
  
  /**
    * The identifier of the key group that you are updating.
    */
  var Id: String = js.native
  
  /**
    * The version of the key group that you are updating. The version is the key group’s ETag value.
    */
  var IfMatch: js.UndefOr[String] = js.native
  
  /**
    * The key group configuration.
    */
  var KeyGroupConfig: typings.awsSdk.cloudfrontMod.KeyGroupConfig = js.native
}
object UpdateKeyGroupRequest {
  
  @scala.inline
  def apply(Id: String, KeyGroupConfig: KeyGroupConfig): UpdateKeyGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], KeyGroupConfig = KeyGroupConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateKeyGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateKeyGroupRequestOps[Self <: UpdateKeyGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGroupConfig(value: KeyGroupConfig): Self = this.set("KeyGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
}
