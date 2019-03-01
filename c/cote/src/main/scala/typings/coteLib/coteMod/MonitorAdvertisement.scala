package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorAdvertisement extends Advertisement {
  /**
    * Port for Monitor to listen on. By default will start searching from 8000.
    */
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object MonitorAdvertisement {
  @scala.inline
  def apply(
    name: java.lang.String,
    key: java.lang.String = null,
    namespace: java.lang.String = null,
    port: scala.Double | java.lang.String = null
  ): MonitorAdvertisement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorAdvertisement]
  }
}

