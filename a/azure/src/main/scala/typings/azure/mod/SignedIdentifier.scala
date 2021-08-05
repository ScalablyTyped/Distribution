package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedIdentifier extends StObject {
  
  var AccessPolicy: SharedAccessPolicy
  
  var Id: String
}
object SignedIdentifier {
  
  inline def apply(AccessPolicy: SharedAccessPolicy, Id: String): SignedIdentifier = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedIdentifier]
  }
  
  extension [Self <: SignedIdentifier](x: Self) {
    
    inline def setAccessPolicy(value: SharedAccessPolicy): Self = StObject.set(x, "AccessPolicy", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
