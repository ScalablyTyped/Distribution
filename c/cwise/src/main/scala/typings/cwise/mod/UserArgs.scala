package typings.cwise.mod

import typings.cwiseCompiler.mod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  var args: js.Array[ArgType]
  var blockSize: js.UndefOr[Double] = js.undefined
  var funcName: js.UndefOr[String] = js.undefined
  var post: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.undefined
  var pre: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.undefined
  var printCode: js.UndefOr[Boolean] = js.undefined
  def body(a: Double, args: js.Any*): Unit
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[ArgType],
    body: (Double, /* repeated */ js.Any) => Unit,
    blockSize: js.UndefOr[Double] = js.undefined,
    funcName: String = null,
    post: (/* a */ Double, /* repeated */ js.Any) => Unit = null,
    pre: (/* a */ Double, /* repeated */ js.Any) => Unit = null,
    printCode: js.UndefOr[Boolean] = js.undefined
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = js.Any.fromFunction2(body))
    if (!js.isUndefined(blockSize)) __obj.updateDynamic("blockSize")(blockSize.get.asInstanceOf[js.Any])
    if (funcName != null) __obj.updateDynamic("funcName")(funcName.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction2(post))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction2(pre))
    if (!js.isUndefined(printCode)) __obj.updateDynamic("printCode")(printCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
}

