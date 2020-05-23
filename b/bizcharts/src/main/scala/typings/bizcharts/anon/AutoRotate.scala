package typings.bizcharts.anon

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoRotate extends js.Object {
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[text] = js.undefined
}

object AutoRotate {
  @scala.inline
  def apply(
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    position: String | Double = null,
    style: text = null
  ): AutoRotate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRotate]
  }
}

