package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIndexRequest extends StObject {
  
  /**
    * Sets the number of addtional storage and query capacity units that should be used by the index. You can change the capacity of the index up to 5 times per day. If you are using extra storage units, you can't reduce the storage capacity below that required to meet the storage needs for your index.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.native
  
  /**
    * A new description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  
  /**
    * The document metadata to update. 
    */
  var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList] = js.native
  
  /**
    * The identifier of the index to update.
    */
  var Id: IndexId = js.native
  
  /**
    * The name of the index to update.
    */
  var Name: js.UndefOr[IndexName] = js.native
  
  /**
    * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
  
  /**
    * The user user token context policy.
    */
  var UserContextPolicy: js.UndefOr[typings.awsSdk.kendraMod.UserContextPolicy] = js.native
  
  /**
    * The user token configuration.
    */
  var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.native
}
object UpdateIndexRequest {
  
  @scala.inline
  def apply(Id: IndexId): UpdateIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexRequest]
  }
  
  @scala.inline
  implicit class UpdateIndexRequestMutableBuilder[Self <: UpdateIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDocumentMetadataConfigurationUpdates(value: DocumentMetadataConfigurationList): Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMetadataConfigurationUpdatesUndefined: Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", js.undefined)
    
    @scala.inline
    def setDocumentMetadataConfigurationUpdatesVarargs(value: DocumentMetadataConfiguration*): Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setUserContextPolicy(value: UserContextPolicy): Self = StObject.set(x, "UserContextPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserContextPolicyUndefined: Self = StObject.set(x, "UserContextPolicy", js.undefined)
    
    @scala.inline
    def setUserTokenConfigurations(value: UserTokenConfigurationList): Self = StObject.set(x, "UserTokenConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTokenConfigurationsUndefined: Self = StObject.set(x, "UserTokenConfigurations", js.undefined)
    
    @scala.inline
    def setUserTokenConfigurationsVarargs(value: UserTokenConfiguration*): Self = StObject.set(x, "UserTokenConfigurations", js.Array(value :_*))
  }
}
