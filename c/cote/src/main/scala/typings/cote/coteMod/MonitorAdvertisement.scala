package typings.cote.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorAdvertisement extends Advertisement {
  /**
    * Port for Monitor to listen on. By default will start searching from 8000.
    */
  var port: js.UndefOr[Double | String] = js.undefined
}

object MonitorAdvertisement {
  @scala.inline
  def apply(name: String, key: String = null, namespace: String = null, port: Double | String = null): MonitorAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorAdvertisement]
  }
}

