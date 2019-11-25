package typings.clearbladejsDashNode.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMessagingProperties extends js.Object {
  var hosts: js.UndefOr[String] = js.undefined
  var ports: js.UndefOr[String] = js.undefined
}

object CommonMessagingProperties {
  @scala.inline
  def apply(hosts: String = null, ports: String = null): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMessagingProperties]
  }
}

