package typings
package bunyanDashConfigLib.bunyanDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamConfiguration extends js.Object {
  var name: java.lang.String
  var params: js.UndefOr[bunyanDashConfigLib.Anon_Host] = js.undefined
}

object StreamConfiguration {
  @scala.inline
  def apply(name: java.lang.String, params: bunyanDashConfigLib.Anon_Host = null): StreamConfiguration = {
    val __obj = js.Dynamic.literal(name = name)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[StreamConfiguration]
  }
}

