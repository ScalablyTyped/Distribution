package typings.axePuppeteer.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageOptions extends js.Object {
  var opts: js.UndefOr[js.Any] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object IPageOptions {
  @scala.inline
  def apply(opts: js.Any = null, source: String = null): IPageOptions = {
    val __obj = js.Dynamic.literal()
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageOptions]
  }
}

