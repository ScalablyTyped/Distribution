package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Declarative event action that redirects a network request to an empty document. */
trait RedirectToEmptyDocument
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectToEmptyDocument
}
object RedirectToEmptyDocument {
  
  inline def apply(instanceType: String): RedirectToEmptyDocument = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RedirectToEmptyDocument")
    __obj.asInstanceOf[RedirectToEmptyDocument]
  }
  
  extension [Self <: RedirectToEmptyDocument](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RedirectToEmptyDocument): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
