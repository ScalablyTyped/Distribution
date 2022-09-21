package typings.cordovaPluginSafariviewcontroller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of `SafariViewController.getViewHandlerPackages()` call.
  */
trait SafariViewControllerHandlerPackagesResult extends StObject {
  
  /**
    * Contains the list of all available custom tab handler implementations.
    */
  var customTabsImplementations: js.Array[String]
  
  /**
    * The default custom tab handler implementation (if available).
    */
  var defaultHandler: String | Null
}
object SafariViewControllerHandlerPackagesResult {
  
  inline def apply(customTabsImplementations: js.Array[String]): SafariViewControllerHandlerPackagesResult = {
    val __obj = js.Dynamic.literal(customTabsImplementations = customTabsImplementations.asInstanceOf[js.Any], defaultHandler = null)
    __obj.asInstanceOf[SafariViewControllerHandlerPackagesResult]
  }
  
  extension [Self <: SafariViewControllerHandlerPackagesResult](x: Self) {
    
    inline def setCustomTabsImplementations(value: js.Array[String]): Self = StObject.set(x, "customTabsImplementations", value.asInstanceOf[js.Any])
    
    inline def setCustomTabsImplementationsVarargs(value: String*): Self = StObject.set(x, "customTabsImplementations", js.Array(value*))
    
    inline def setDefaultHandler(value: String): Self = StObject.set(x, "defaultHandler", value.asInstanceOf[js.Any])
    
    inline def setDefaultHandlerNull: Self = StObject.set(x, "defaultHandler", null)
  }
}
