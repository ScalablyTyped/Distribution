package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIndexRequest extends StObject {
  
  /**
    * Sets the number of addtional storage and query capacity units that should be used by the index. You can change the capacity of the index up to 5 times per day. If you are using extra storage units, you can't reduce the storage capacity below that required to meet the storage needs for your index.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined
  
  /**
    * A new description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * The document metadata to update. 
    */
  var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList] = js.undefined
  
  /**
    * The identifier of the index to update.
    */
  var Id: IndexId
  
  /**
    * The name of the index to update.
    */
  var Name: js.UndefOr[IndexName] = js.undefined
  
  /**
    * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.undefined
  
  /**
    * The user user token context policy.
    */
  var UserContextPolicy: js.UndefOr[typings.awsSdk.kendraMod.UserContextPolicy] = js.undefined
  
  /**
    * The user token configuration.
    */
  var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.undefined
}
object UpdateIndexRequest {
  
  inline def apply(Id: IndexId): UpdateIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexRequest]
  }
  
  extension [Self <: UpdateIndexRequest](x: Self) {
    
    inline def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDocumentMetadataConfigurationUpdates(value: DocumentMetadataConfigurationList): Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataConfigurationUpdatesUndefined: Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", js.undefined)
    
    inline def setDocumentMetadataConfigurationUpdatesVarargs(value: DocumentMetadataConfiguration*): Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", js.Array(value :_*))
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUserContextPolicy(value: UserContextPolicy): Self = StObject.set(x, "UserContextPolicy", value.asInstanceOf[js.Any])
    
    inline def setUserContextPolicyUndefined: Self = StObject.set(x, "UserContextPolicy", js.undefined)
    
    inline def setUserTokenConfigurations(value: UserTokenConfigurationList): Self = StObject.set(x, "UserTokenConfigurations", value.asInstanceOf[js.Any])
    
    inline def setUserTokenConfigurationsUndefined: Self = StObject.set(x, "UserTokenConfigurations", js.undefined)
    
    inline def setUserTokenConfigurationsVarargs(value: UserTokenConfiguration*): Self = StObject.set(x, "UserTokenConfigurations", js.Array(value :_*))
  }
}
