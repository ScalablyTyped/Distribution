package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends StObject {
  
  /**
    * The OpenID Connect identity provider information for the cluster.
    */
  var oidc: js.UndefOr[OIDC] = js.native
}
object Identity {
  
  @scala.inline
  def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOidc(value: OIDC): Self = StObject.set(x, "oidc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcUndefined: Self = StObject.set(x, "oidc", js.undefined)
  }
}
