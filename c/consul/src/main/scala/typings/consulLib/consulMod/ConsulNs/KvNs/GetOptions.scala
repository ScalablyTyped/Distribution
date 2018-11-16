package typings
package consulLib.consulMod.ConsulNs.KvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var key: java.lang.String
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var recurse: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("wait")
  var wait_FGetOptions: js.UndefOr[java.lang.String] = js.undefined
}

