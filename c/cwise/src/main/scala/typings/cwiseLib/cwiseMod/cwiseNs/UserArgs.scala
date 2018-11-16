package typings
package cwiseLib.cwiseMod.cwiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserArgs extends js.Object {
  var args: js.Array[cwiseDashCompilerLib.cwiseDashCompilerMod.cwiseUnderscoreCompilerNs.ArgType]
  var blockSize: js.UndefOr[scala.Double] = js.undefined
  var funcName: js.UndefOr[java.lang.String] = js.undefined
  var post: js.UndefOr[js.Function2[/* a */ scala.Double, /* repeated */js.Any, scala.Unit]] = js.undefined
  var pre: js.UndefOr[js.Function2[/* a */ scala.Double, /* repeated */js.Any, scala.Unit]] = js.undefined
  var printCode: js.UndefOr[scala.Boolean] = js.undefined
  def body(a: scala.Double, args: js.Any*): scala.Unit
}

