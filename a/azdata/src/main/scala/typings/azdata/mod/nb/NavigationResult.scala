package typings.azdata.mod.nb

import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationResult extends StObject {
  
  var hasNavigation: Boolean
  
  var next: js.UndefOr[Uri] = js.undefined
  
  var previous: js.UndefOr[Uri] = js.undefined
}
object NavigationResult {
  
  inline def apply(hasNavigation: Boolean): NavigationResult = {
    val __obj = js.Dynamic.literal(hasNavigation = hasNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationResult] (val x: Self) extends AnyVal {
    
    inline def setHasNavigation(value: Boolean): Self = StObject.set(x, "hasNavigation", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Uri): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: Uri): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
