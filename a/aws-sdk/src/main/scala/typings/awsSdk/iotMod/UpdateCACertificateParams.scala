package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCACertificateParams extends StObject {
  
  /**
    * The action that you want to apply to the CA certificate. The only supported value is DEACTIVATE.
    */
  var action: CACertificateUpdateAction
}
object UpdateCACertificateParams {
  
  inline def apply(action: CACertificateUpdateAction): UpdateCACertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCACertificateParams]
  }
  
  extension [Self <: UpdateCACertificateParams](x: Self) {
    
    inline def setAction(value: CACertificateUpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
