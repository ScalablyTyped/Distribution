package typings
package bonjourLib.bonjourMod.bonjourNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var port: scala.Double
  var protocol: js.UndefOr[bonjourLib.bonjourLibStrings.udp | bonjourLib.bonjourLibStrings.tcp] = js.undefined
  var subtypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var txt: js.UndefOr[js.Object] = js.undefined
  var `type`: java.lang.String
}

object ServiceOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    port: scala.Double,
    `type`: java.lang.String,
    host: java.lang.String = null,
    protocol: bonjourLib.bonjourLibStrings.udp | bonjourLib.bonjourLibStrings.tcp = null,
    subtypes: js.Array[java.lang.String] = null,
    txt: js.Object = null
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("port")(port)
    if (host != null) __obj.updateDynamic("host")(host)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes)
    if (txt != null) __obj.updateDynamic("txt")(txt)
    __obj.asInstanceOf[ServiceOptions]
  }
}

