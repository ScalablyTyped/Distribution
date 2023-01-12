package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.`SIGNED-JWT`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JwksEndpoint
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * JWKS endpoint used for authentication by the Data Holder with the Data Recipient
    */
  var jwksEndpoint: String
  
  /**
    * The type of authentication and authorisation mechanism in use
    */
  var registerUType: `SIGNED-JWT`
}
object JwksEndpoint {
  
  inline def apply(jwksEndpoint: String): JwksEndpoint = {
    val __obj = js.Dynamic.literal(jwksEndpoint = jwksEndpoint.asInstanceOf[js.Any], registerUType = "SIGNED-JWT")
    __obj.asInstanceOf[JwksEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JwksEndpoint] (val x: Self) extends AnyVal {
    
    inline def setJwksEndpoint(value: String): Self = StObject.set(x, "jwksEndpoint", value.asInstanceOf[js.Any])
    
    inline def setRegisterUType(value: `SIGNED-JWT`): Self = StObject.set(x, "registerUType", value.asInstanceOf[js.Any])
  }
}
