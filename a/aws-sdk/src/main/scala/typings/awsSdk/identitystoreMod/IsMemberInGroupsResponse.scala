package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMemberInGroupsResponse extends StObject {
  
  /**
    * A list containing the results of membership existence checks.
    */
  var Results: GroupMembershipExistenceResults
}
object IsMemberInGroupsResponse {
  
  inline def apply(Results: GroupMembershipExistenceResults): IsMemberInGroupsResponse = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMemberInGroupsResponse]
  }
  
  extension [Self <: IsMemberInGroupsResponse](x: Self) {
    
    inline def setResults(value: GroupMembershipExistenceResults): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: GroupMembershipExistenceResult*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
