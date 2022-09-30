package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateEntitiesToExperienceResponse extends StObject {
  
  /**
    * Lists the users or groups in your IAM Identity Center identity source that failed to properly configure with your Amazon Kendra experience.
    */
  var FailedEntityList: js.UndefOr[AssociateEntitiesToExperienceFailedEntityList] = js.undefined
}
object AssociateEntitiesToExperienceResponse {
  
  inline def apply(): AssociateEntitiesToExperienceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateEntitiesToExperienceResponse]
  }
  
  extension [Self <: AssociateEntitiesToExperienceResponse](x: Self) {
    
    inline def setFailedEntityList(value: AssociateEntitiesToExperienceFailedEntityList): Self = StObject.set(x, "FailedEntityList", value.asInstanceOf[js.Any])
    
    inline def setFailedEntityListUndefined: Self = StObject.set(x, "FailedEntityList", js.undefined)
    
    inline def setFailedEntityListVarargs(value: FailedEntity*): Self = StObject.set(x, "FailedEntityList", js.Array(value*))
  }
}
