package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Declarative event action that cancels a network request. */
trait CancelRequest
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.CancelRequest
}
object CancelRequest {
  
  inline def apply(instanceType: String): CancelRequest = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "CancelRequest")
    __obj.asInstanceOf[CancelRequest]
  }
  
  extension [Self <: CancelRequest](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.CancelRequest): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
