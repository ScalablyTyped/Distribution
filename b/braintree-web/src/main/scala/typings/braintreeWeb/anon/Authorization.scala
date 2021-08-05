package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization extends StObject {
  
  var authorization: String
}
object Authorization {
  
  inline def apply(authorization: String): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  extension [Self <: Authorization](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
  }
}
