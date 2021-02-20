package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Declarative event action that redirects a network request to an empty document. */
@js.native
trait RedirectToEmptyDocument extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectToEmptyDocument = js.native
}
object RedirectToEmptyDocument {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.RedirectToEmptyDocument): RedirectToEmptyDocument = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectToEmptyDocument]
  }
  
  @scala.inline
  implicit class RedirectToEmptyDocumentMutableBuilder[Self <: RedirectToEmptyDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RedirectToEmptyDocument): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
