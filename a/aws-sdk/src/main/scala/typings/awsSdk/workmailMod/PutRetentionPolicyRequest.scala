package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRetentionPolicyRequest extends StObject {
  
  /**
    * The retention policy description.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * The retention policy folder configurations.
    */
  var FolderConfigurations: typings.awsSdk.workmailMod.FolderConfigurations
  
  /**
    * The retention policy ID.
    */
  var Id: js.UndefOr[ShortString] = js.undefined
  
  /**
    * The retention policy name.
    */
  var Name: ShortString
  
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object PutRetentionPolicyRequest {
  
  @scala.inline
  def apply(FolderConfigurations: FolderConfigurations, Name: ShortString, OrganizationId: OrganizationId): PutRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(FolderConfigurations = FolderConfigurations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionPolicyRequest]
  }
  
  @scala.inline
  implicit class PutRetentionPolicyRequestMutableBuilder[Self <: PutRetentionPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFolderConfigurations(value: FolderConfigurations): Self = StObject.set(x, "FolderConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderConfigurationsVarargs(value: FolderConfiguration*): Self = StObject.set(x, "FolderConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ShortString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ShortString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
