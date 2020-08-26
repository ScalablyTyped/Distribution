package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectionsEventArgs extends js.Object {
  /** The calculated route (or routes, if the route mode is transit). */
  var route: js.Array[IRoute] = js.native
  /** The route summary (or summaries) of the route(s) defined in the route property. */
  var routeSummary: js.Array[IRouteSummary] = js.native
}

object IDirectionsEventArgs {
  @scala.inline
  def apply(route: js.Array[IRoute], routeSummary: js.Array[IRouteSummary]): IDirectionsEventArgs = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], routeSummary = routeSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsEventArgs]
  }
  @scala.inline
  implicit class IDirectionsEventArgsOps[Self <: IDirectionsEventArgs] (val x: Self) extends AnyVal {
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
    def setRouteVarargs(value: IRoute*): Self = this.set("route", js.Array(value :_*))
    @scala.inline
    def setRoute(value: js.Array[IRoute]): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteSummaryVarargs(value: IRouteSummary*): Self = this.set("routeSummary", js.Array(value :_*))
    @scala.inline
    def setRouteSummary(value: js.Array[IRouteSummary]): Self = this.set("routeSummary", value.asInstanceOf[js.Any])
  }
  
}

