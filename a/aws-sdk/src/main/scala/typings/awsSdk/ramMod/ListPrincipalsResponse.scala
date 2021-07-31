package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrincipalsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalList] = js.undefined
}
object ListPrincipalsResponse {
  
  @scala.inline
  def apply(): ListPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalsResponse]
  }
  
  @scala.inline
  implicit class ListPrincipalsResponseMutableBuilder[Self <: ListPrincipalsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPrincipals(value: PrincipalList): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "principals", js.Array(value :_*))
  }
}
