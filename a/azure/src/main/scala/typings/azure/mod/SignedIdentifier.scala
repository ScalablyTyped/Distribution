package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedIdentifier extends StObject {
  
  var AccessPolicy: SharedAccessPolicy
  
  var Id: String
}
object SignedIdentifier {
  
  @scala.inline
  def apply(AccessPolicy: SharedAccessPolicy, Id: String): SignedIdentifier = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedIdentifier]
  }
  
  @scala.inline
  implicit class SignedIdentifierMutableBuilder[Self <: SignedIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicy(value: SharedAccessPolicy): Self = StObject.set(x, "AccessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
