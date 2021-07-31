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
  var controller: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Define the app routes and the method names on the router that will be
    * called when accessing the routes.
    */
  var routes: js.UndefOr[AppRoutes] = js.undefined
}
object AppRouterOptions {
  
  @scala.inline
  def apply(): AppRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRouterOptions]
  }
  
  @scala.inline
  implicit class AppRouterOptionsMutableBuilder[Self <: AppRouterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppRoutes(value: AppRoutes): Self = StObject.set(x, "appRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRoutesUndefined: Self = StObject.set(x, "appRoutes", js.undefined)
    
    @scala.inline
    def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setRoutes(value: AppRoutes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
  }
}
