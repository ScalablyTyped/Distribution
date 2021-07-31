package typings.azure.mod

import typings.azure.anon.Expiry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedAccessPolicy extends StObject {
  
  var AccessPolicy: Expiry
  
  var Id: js.UndefOr[String] = js.undefined
}
object SharedAccessPolicy {
  
  @scala.inline
  def apply(AccessPolicy: Expiry): SharedAccessPolicy = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAccessPolicy]
  }
  
  @scala.inline
  implicit class SharedAccessPolicyMutableBuilder[Self <: SharedAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicy(value: Expiry): Self = StObject.set(x, "AccessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
