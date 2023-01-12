package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRouterOptions extends StObject {
  
  /**
    * Define the app routes and the method names on the controller that
    * will be called when accessing the routes.
    */
  var appRoutes: js.UndefOr[AppRoutes] = js.undefined
  
  /**
    * An object that contains the methods specified in appRoutes.
    */
  var controller: js.UndefOr[Any] = js.undefined
  
  /**
    * Define the app routes and the method names on the router that will be
    * called when accessing the routes.
    */
  var routes: js.UndefOr[AppRoutes] = js.undefined
}
object AppRouterOptions {
  
  inline def apply(): AppRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRouterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppRouterOptions] (val x: Self) extends AnyVal {
    
    inline def setAppRoutes(value: AppRoutes): Self = StObject.set(x, "appRoutes", value.asInstanceOf[js.Any])
    
    inline def setAppRoutesUndefined: Self = StObject.set(x, "appRoutes", js.undefined)
    
    inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setRoutes(value: AppRoutes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
  }
}
