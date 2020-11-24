package typings.backboneMarionette.mod

import typings.backbone.mod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone.marionette", "AppRouter")
@js.native
class AppRouter () extends Router {
  def this(options: AppRouterOptions) = this()
  
  /**
    * Add an app route at runtime.
    */
  def appRoute(route: String, methodName: String): Unit = js.native
  
  /**
    * An object that contains the methods specified in appRoutes.
    */
  var controller: js.Any = js.native
  
  /**
    * Fires whenever the user navigates to a new route in your application
    * that matches a route.
    */
  def onRoute(name: String, path: String, args: js.Array[_]): Unit = js.native
  
  /**
    * Specify a controller with the multiple routes at runtime. This will
    * preserve the existing controller as well.
    */
  def processAppRoutes(controller: js.Any, appRoutes: AppRoutes): Unit = js.native
}
