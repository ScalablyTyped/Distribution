package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultRetentionPolicyResponse extends js.Object {
  
  /**
    * The retention policy description.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The retention policy folder configurations.
    */
  var FolderConfigurations: js.UndefOr[typings.awsSdk.workmailMod.FolderConfigurations] = js.native
  
  /**
    * The retention policy ID.
    */
  var Id: js.UndefOr[ShortString] = js.native
  
  /**
    * The retention policy name.
    */
  var Name: js.UndefOr[ShortString] = js.native
}
object GetDefaultRetentionPolicyResponse {
  
  @scala.inline
  def apply(): GetDefaultRetentionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultRetentionPolicyResponse]
  }
  
  @scala.inline
  implicit class GetDefaultRetentionPolicyResponseOps[Self <: GetDefaultRetentionPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFolderConfigurationsVarargs(value: FolderConfiguration*): Self = this.set("FolderConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setFolderConfigurations(value: FolderConfigurations): Self = this.set("FolderConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderConfigurations: Self = this.set("FolderConfigurations", js.undefined)
    
    @scala.inline
    def setId(value: ShortString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: ShortString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
