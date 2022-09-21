package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePersonasToEntitiesResponse extends StObject {
  
  /**
    * Lists the users or groups in your Amazon Web Services SSO identity source that failed to properly configure with your Amazon Kendra experience.
    */
  var FailedEntityList: js.UndefOr[typings.awsSdk.kendraMod.FailedEntityList] = js.undefined
}
object AssociatePersonasToEntitiesResponse {
  
  inline def apply(): AssociatePersonasToEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatePersonasToEntitiesResponse]
  }
  
  extension [Self <: AssociatePersonasToEntitiesResponse](x: Self) {
    
    inline def setFailedEntityList(value: FailedEntityList): Self = StObject.set(x, "FailedEntityList", value.asInstanceOf[js.Any])
    
    inline def setFailedEntityListUndefined: Self = StObject.set(x, "FailedEntityList", js.undefined)
    
    inline def setFailedEntityListVarargs(value: FailedEntity*): Self = StObject.set(x, "FailedEntityList", js.Array(value*))
  }
}
