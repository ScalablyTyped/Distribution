package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyleConfig extends js.Object {
  var disableHinting: js.UndefOr[Boolean] = js.undefined
  var ellipsis: js.UndefOr[String] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var textAlign: js.UndefOr[SkTextAlign] = js.undefined
  var textDirection: js.UndefOr[SkTextDirection] = js.undefined
  var textStyle: TextStyleConfig
}

object ParagraphStyleConfig {
  @scala.inline
  def apply(
    textStyle: TextStyleConfig,
    disableHinting: js.UndefOr[Boolean] = js.undefined,
    ellipsis: String = null,
    maxLines: js.UndefOr[Double] = js.undefined,
    textAlign: SkTextAlign = null,
    textDirection: SkTextDirection = null
  ): ParagraphStyleConfig = {
    val __obj = js.Dynamic.literal(textStyle = textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHinting)) __obj.updateDynamic("disableHinting")(disableHinting.get.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDirection != null) __obj.updateDynamic("textDirection")(textDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphStyleConfig]
  }
}

