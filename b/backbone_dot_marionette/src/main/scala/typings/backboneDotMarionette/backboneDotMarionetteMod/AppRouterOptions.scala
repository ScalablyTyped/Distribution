package typings.backboneDotMarionette.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRouterOptions extends js.Object {
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
  def apply(appRoutes: AppRoutes = null, controller: js.Any = null, routes: AppRoutes = null): AppRouterOptions = {
    val __obj = js.Dynamic.literal()
    if (appRoutes != null) __obj.updateDynamic("appRoutes")(appRoutes)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[AppRouterOptions]
  }
}

