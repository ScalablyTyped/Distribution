package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRouterOptions extends js.Object {
  /**
    * Define the app routes and the method names on the controller that
    * will be called when accessing the routes.
    */
  var appRoutes: js.UndefOr[AppRoutes] = js.native
  /**
    * An object that contains the methods specified in appRoutes.
    */
  var controller: js.UndefOr[js.Any] = js.native
  /**
    * Define the app routes and the method names on the router that will be
    * called when accessing the routes.
    */
  var routes: js.UndefOr[AppRoutes] = js.native
}

object AppRouterOptions {
  @scala.inline
  def apply(): AppRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRouterOptions]
  }
  @scala.inline
  implicit class AppRouterOptionsOps[Self <: AppRouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppRoutes(value: AppRoutes): Self = this.set("appRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppRoutes: Self = this.set("appRoutes", js.undefined)
    @scala.inline
    def setController(value: js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setRoutes(value: AppRoutes): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
  
}

