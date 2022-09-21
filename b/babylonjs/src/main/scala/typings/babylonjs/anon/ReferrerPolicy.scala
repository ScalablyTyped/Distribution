package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferrerPolicy extends StObject {
  
  var referrerPolicy: String | Null
}
object ReferrerPolicy {
  
  inline def apply(): ReferrerPolicy = {
    val __obj = js.Dynamic.literal(referrerPolicy = null)
    __obj.asInstanceOf[ReferrerPolicy]
  }
  
  extension [Self <: ReferrerPolicy](x: Self) {
    
    inline def setReferrerPolicy(value: String): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyNull: Self = StObject.set(x, "referrerPolicy", null)
  }
}
