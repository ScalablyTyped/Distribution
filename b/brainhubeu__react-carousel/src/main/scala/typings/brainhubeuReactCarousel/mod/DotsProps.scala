package typings.brainhubeuReactCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotsProps extends js.Object {
  var number: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var thumbnails: js.UndefOr[js.Array[ImgProps]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object DotsProps {
  @scala.inline
  def apply(
    number: js.UndefOr[Double] = js.undefined,
    onChange: /* value */ Double => Unit = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    thumbnails: js.Array[ImgProps] = null,
    value: js.UndefOr[Double] = js.undefined
  ): DotsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotsProps]
  }
}

