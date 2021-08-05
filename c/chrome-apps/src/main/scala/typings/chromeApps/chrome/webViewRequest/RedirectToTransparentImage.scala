package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Declarative event action that redirects a network request to a transparent image. */
trait RedirectToTransparentImage
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectToTransparentImage
}
object RedirectToTransparentImage {
  
  inline def apply(instanceType: String): RedirectToTransparentImage = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RedirectToTransparentImage")
    __obj.asInstanceOf[RedirectToTransparentImage]
  }
  
  extension [Self <: RedirectToTransparentImage](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RedirectToTransparentImage): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
