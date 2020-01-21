package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeSelfBooleanOptional extends js.Object {
  var includeSelf: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeSelfBooleanOptional {
  @scala.inline
  def apply(includeSelf: js.UndefOr[Boolean] = js.undefined): AnonIncludeSelfBooleanOptional = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeSelfBooleanOptional]
  }
}

