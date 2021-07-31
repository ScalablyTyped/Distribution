package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization extends StObject {
  
  var authorization: String
}
object Authorization {
  
  @scala.inline
  def apply(authorization: String): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  @scala.inline
  implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
  }
}
