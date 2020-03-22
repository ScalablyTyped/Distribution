package typings.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  LT  :string,   LTS  :string,   L  :string,   LL  :string,   LLL  :string,   LLLL  :string}> */
trait PartialLTstringLTSstringL extends js.Object {
  var L: js.UndefOr[String] = js.undefined
  var LL: js.UndefOr[String] = js.undefined
  var LLL: js.UndefOr[String] = js.undefined
  var LLLL: js.UndefOr[String] = js.undefined
  var LT: js.UndefOr[String] = js.undefined
  var LTS: js.UndefOr[String] = js.undefined
}

object PartialLTstringLTSstringL {
  @scala.inline
  def apply(
    L: String = null,
    LL: String = null,
    LLL: String = null,
    LLLL: String = null,
    LT: String = null,
    LTS: String = null
  ): PartialLTstringLTSstringL = {
    val __obj = js.Dynamic.literal()
    if (L != null) __obj.updateDynamic("L")(L.asInstanceOf[js.Any])
    if (LL != null) __obj.updateDynamic("LL")(LL.asInstanceOf[js.Any])
    if (LLL != null) __obj.updateDynamic("LLL")(LLL.asInstanceOf[js.Any])
    if (LLLL != null) __obj.updateDynamic("LLLL")(LLLL.asInstanceOf[js.Any])
    if (LT != null) __obj.updateDynamic("LT")(LT.asInstanceOf[js.Any])
    if (LTS != null) __obj.updateDynamic("LTS")(LTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLTstringLTSstringL]
  }
}

