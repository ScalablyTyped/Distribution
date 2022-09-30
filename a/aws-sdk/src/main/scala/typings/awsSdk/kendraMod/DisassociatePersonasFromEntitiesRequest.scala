package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociatePersonasFromEntitiesRequest extends StObject {
  
  /**
    * The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs could be user emails.
    */
  var EntityIds: EntityIdsList
  
  /**
    * The identifier of your Amazon Kendra experience.
    */
  var Id: ExperienceId
  
  /**
    * The identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
}
object DisassociatePersonasFromEntitiesRequest {
  
  inline def apply(EntityIds: EntityIdsList, Id: ExperienceId, IndexId: IndexId): DisassociatePersonasFromEntitiesRequest = {
    val __obj = js.Dynamic.literal(EntityIds = EntityIds.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePersonasFromEntitiesRequest]
  }
  
  extension [Self <: DisassociatePersonasFromEntitiesRequest](x: Self) {
    
    inline def setEntityIds(value: EntityIdsList): Self = StObject.set(x, "EntityIds", value.asInstanceOf[js.Any])
    
    inline def setEntityIdsVarargs(value: EntityId*): Self = StObject.set(x, "EntityIds", js.Array(value*))
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
