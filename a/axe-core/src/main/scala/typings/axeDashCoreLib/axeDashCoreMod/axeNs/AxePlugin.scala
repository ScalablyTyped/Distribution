package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AxePlugin extends js.Object {
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, scala.Unit]] = js.undefined
  var commands: js.Array[axeDashCoreLib.Anon_Callback]
  var id: java.lang.String
  def run(args: js.Any*): js.Any
}

