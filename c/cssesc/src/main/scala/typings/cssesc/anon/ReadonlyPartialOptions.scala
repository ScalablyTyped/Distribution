package typings.cssesc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<cssesc.cssesc.Options>> */
trait ReadonlyPartialOptions extends js.Object {
  val escapeEverything: js.UndefOr[Boolean] = js.undefined
  val isIdentifier: js.UndefOr[Boolean] = js.undefined
  val quotes: js.UndefOr[String] = js.undefined
  val wrap: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyPartialOptions {
  @scala.inline
  def apply(
    escapeEverything: js.UndefOr[Boolean] = js.undefined,
    isIdentifier: js.UndefOr[Boolean] = js.undefined,
    quotes: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyPartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(escapeEverything)) __obj.updateDynamic("escapeEverything")(escapeEverything.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdentifier)) __obj.updateDynamic("isIdentifier")(isIdentifier.get.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPartialOptions]
  }
}

