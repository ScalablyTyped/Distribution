package typings.clearbladejsDashNode.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingOptions extends CommonMessagingProperties {
  var qos: js.UndefOr[MessagingQOS] = js.undefined
}

object MessagingOptions {
  @scala.inline
  def apply(hosts: String = null, ports: String = null, qos: MessagingQOS = null): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (qos != null) __obj.updateDynamic("qos")(qos)
    __obj.asInstanceOf[MessagingOptions]
  }
}

