package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMessagingProperties extends js.Object {
  var hosts: js.UndefOr[java.lang.String] = js.undefined
  var ports: js.UndefOr[java.lang.String] = js.undefined
}

object CommonMessagingProperties {
  @scala.inline
  def apply(hosts: java.lang.String = null, ports: java.lang.String = null): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    __obj.asInstanceOf[CommonMessagingProperties]
  }
}

