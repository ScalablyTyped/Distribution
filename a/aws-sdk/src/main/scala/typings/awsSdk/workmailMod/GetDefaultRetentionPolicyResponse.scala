package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultRetentionPolicyResponse extends StObject {
  
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
  implicit class GetDefaultRetentionPolicyResponseMutableBuilder[Self <: GetDefaultRetentionPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFolderConfigurations(value: FolderConfigurations): Self = StObject.set(x, "FolderConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderConfigurationsUndefined: Self = StObject.set(x, "FolderConfigurations", js.undefined)
    
    @scala.inline
    def setFolderConfigurationsVarargs(value: FolderConfiguration*): Self = StObject.set(x, "FolderConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ShortString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ShortString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
