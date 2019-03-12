package typings
package cwiseLib.cwiseMod.cwiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  var args: js.Array[cwiseDashCompilerLib.cwiseDashCompilerMod.cwiseUnderscoreCompilerNs.ArgType]
  var blockSize: js.UndefOr[scala.Double] = js.undefined
  var funcName: js.UndefOr[java.lang.String] = js.undefined
  var post: js.UndefOr[js.Function2[/* a */ scala.Double, /* repeated */ js.Any, scala.Unit]] = js.undefined
  var pre: js.UndefOr[js.Function2[/* a */ scala.Double, /* repeated */ js.Any, scala.Unit]] = js.undefined
  var printCode: js.UndefOr[scala.Boolean] = js.undefined
  def body(a: scala.Double, args: js.Any*): scala.Unit
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[cwiseDashCompilerLib.cwiseDashCompilerMod.cwiseUnderscoreCompilerNs.ArgType],
    body: (scala.Double, /* repeated */ js.Any) => scala.Unit,
    blockSize: scala.Int | scala.Double = null,
    funcName: java.lang.String = null,
    post: (/* a */ scala.Double, /* repeated */ js.Any) => scala.Unit = null,
    pre: (/* a */ scala.Double, /* repeated */ js.Any) => scala.Unit = null,
    printCode: js.UndefOr[scala.Boolean] = js.undefined
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args, body = js.Any.fromFunction2(body))
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (funcName != null) __obj.updateDynamic("funcName")(funcName)
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction2(post))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction2(pre))
    if (!js.isUndefined(printCode)) __obj.updateDynamic("printCode")(printCode)
    __obj.asInstanceOf[UserArgs]
  }
}

