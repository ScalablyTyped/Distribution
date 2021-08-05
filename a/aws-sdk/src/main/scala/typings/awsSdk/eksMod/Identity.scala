package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  /**
    * The OpenID Connect identity provider information for the cluster.
    */
  var oidc: js.UndefOr[OIDC] = js.undefined
}
object Identity {
  
  inline def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  extension [Self <: Identity](x: Self) {
    
    inline def setOidc(value: OIDC): Self = StObject.set(x, "oidc", value.asInstanceOf[js.Any])
    
    inline def setOidcUndefined: Self = StObject.set(x, "oidc", js.undefined)
  }
}
