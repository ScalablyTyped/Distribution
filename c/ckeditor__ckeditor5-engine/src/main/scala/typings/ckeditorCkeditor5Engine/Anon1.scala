package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var includeSelf: js.UndefOr[Boolean] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(includeSelf: js.UndefOr[Boolean] = js.undefined): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

