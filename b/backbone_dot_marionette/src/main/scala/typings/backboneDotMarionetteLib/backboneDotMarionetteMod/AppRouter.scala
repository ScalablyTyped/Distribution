package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "AppRouter")
@js.native
class AppRouter ()
  extends backboneLib.backboneMod.Router {
  def this(options: AppRouterOptions) = this()
  /**
    * An object that contains the methods specified in appRoutes.
    */
  var controller: js.Any = js.native
  /**
    * Add an app route at runtime.
    */
  def appRoute(route: java.lang.String, methodName: java.lang.String): scala.Unit = js.native
  /**
    * Fires whenever the user navigates to a new route in your application
    * that matches a route.
    */
  def onRoute(name: java.lang.String, path: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  /**
    * Specify a controller with the multiple routes at runtime. This will
    * preserve the existing controller as well.
    */
  def processAppRoutes(controller: js.Any, appRoutes: AppRoutes): scala.Unit = js.native
}

