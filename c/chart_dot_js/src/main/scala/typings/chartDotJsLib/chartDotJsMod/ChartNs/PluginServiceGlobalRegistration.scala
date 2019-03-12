package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceGlobalRegistration extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object PluginServiceGlobalRegistration {
  @scala.inline
  def apply(id: java.lang.String = null): PluginServiceGlobalRegistration = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[PluginServiceGlobalRegistration]
  }
}

