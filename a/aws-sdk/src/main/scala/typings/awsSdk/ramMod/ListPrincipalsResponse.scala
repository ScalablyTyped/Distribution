package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrincipalsResponse extends StObject {
  
  /**
    * If present, this value indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null. This indicates that this is the last page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain the details about the principals.
    */
  var principals: js.UndefOr[PrincipalList] = js.undefined
}
object ListPrincipalsResponse {
  
  inline def apply(): ListPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalsResponse]
  }
  
  extension [Self <: ListPrincipalsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipals(value: PrincipalList): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "principals", js.Array(value*))
  }
}
