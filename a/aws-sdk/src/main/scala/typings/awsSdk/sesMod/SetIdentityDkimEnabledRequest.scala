package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIdentityDkimEnabledRequest extends StObject {
  
  /**
    * Sets whether DKIM signing is enabled for an identity. Set to true to enable DKIM signing for this identity; false to disable it. 
    */
  var DkimEnabled: Enabled
  
  /**
    * The identity for which DKIM signing should be enabled or disabled.
    */
  var Identity: typings.awsSdk.sesMod.Identity
}
object SetIdentityDkimEnabledRequest {
  
  inline def apply(DkimEnabled: Enabled, Identity: Identity): SetIdentityDkimEnabledRequest = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityDkimEnabledRequest]
  }
  
  extension [Self <: SetIdentityDkimEnabledRequest](x: Self) {
    
    inline def setDkimEnabled(value: Enabled): Self = StObject.set(x, "DkimEnabled", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
  }
}
