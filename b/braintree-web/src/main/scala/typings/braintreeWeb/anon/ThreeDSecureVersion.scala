package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeDSecureVersion extends StObject {
  
  var threeDSecureVersion: String
}
object ThreeDSecureVersion {
  
  inline def apply(threeDSecureVersion: String): ThreeDSecureVersion = {
    val __obj = js.Dynamic.literal(threeDSecureVersion = threeDSecureVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDSecureVersion]
  }
  
  extension [Self <: ThreeDSecureVersion](x: Self) {
    
    inline def setThreeDSecureVersion(value: String): Self = StObject.set(x, "threeDSecureVersion", value.asInstanceOf[js.Any])
  }
}
