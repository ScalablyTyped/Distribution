package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestAuthorizationResponse extends StObject {
  
  /**
    * The authentication results.
    */
  var authResults: js.UndefOr[AuthResults] = js.native
}
object TestAuthorizationResponse {
  
  @scala.inline
  def apply(): TestAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestAuthorizationResponse]
  }
  
  @scala.inline
  implicit class TestAuthorizationResponseMutableBuilder[Self <: TestAuthorizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthResults(value: AuthResults): Self = StObject.set(x, "authResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthResultsUndefined: Self = StObject.set(x, "authResults", js.undefined)
    
    @scala.inline
    def setAuthResultsVarargs(value: AuthResult*): Self = StObject.set(x, "authResults", js.Array(value :_*))
  }
}
