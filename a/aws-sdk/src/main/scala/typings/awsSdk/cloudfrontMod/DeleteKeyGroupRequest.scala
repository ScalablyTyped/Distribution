package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteKeyGroupRequest extends js.Object {
  
  /**
    * The identifier of the key group that you are deleting. To get the identifier, use ListKeyGroups.
    */
  var Id: String = js.native
  
  /**
    * The version of the key group that you are deleting. The version is the key group’s ETag value. To get the ETag, use GetKeyGroup or GetKeyGroupConfig.
    */
  var IfMatch: js.UndefOr[String] = js.native
}
object DeleteKeyGroupRequest {
  
  @scala.inline
  def apply(Id: String): DeleteKeyGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteKeyGroupRequestOps[Self <: DeleteKeyGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
}
