package typings
package consulLib.consulMod.ConsulNs.KvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var acquire: js.UndefOr[java.lang.String] = js.undefined
  var cas: js.UndefOr[java.lang.String] = js.undefined
  var flags: js.UndefOr[scala.Double] = js.undefined
  var key: java.lang.String
  var release: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String | nodeLib.Buffer
}

