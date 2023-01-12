package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationProvider extends StObject {
  
  def getNavigation(notebookUri: Uri): Thenable[NavigationResult]
  
  val providerId: String
}
object NavigationProvider {
  
  inline def apply(getNavigation: Uri => Thenable[NavigationResult], providerId: String): NavigationProvider = {
    val __obj = js.Dynamic.literal(getNavigation = js.Any.fromFunction1(getNavigation), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationProvider] (val x: Self) extends AnyVal {
    
    inline def setGetNavigation(value: Uri => Thenable[NavigationResult]): Self = StObject.set(x, "getNavigation", js.Any.fromFunction1(value))
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
