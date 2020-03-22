package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<baidu-app.swan.CanvasToTempFilePathOptions> */
trait PartialCanvasToTempFilePa extends js.Object {
  var canvasId: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var destHeight: js.UndefOr[Double] = js.undefined
  var destWidth: js.UndefOr[Double] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var fileType: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object PartialCanvasToTempFilePa {
  @scala.inline
  def apply(
    canvasId: String = null,
    complete: /* res */ js.Any => Unit = null,
    destHeight: Int | Double = null,
    destWidth: Int | Double = null,
    fail: /* res */ js.Any => Unit = null,
    fileType: String = null,
    height: Int | Double = null,
    success: /* res */ js.Any => Unit = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PartialCanvasToTempFilePa = {
    val __obj = js.Dynamic.literal()
    if (canvasId != null) __obj.updateDynamic("canvasId")(canvasId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (destHeight != null) __obj.updateDynamic("destHeight")(destHeight.asInstanceOf[js.Any])
    if (destWidth != null) __obj.updateDynamic("destWidth")(destWidth.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCanvasToTempFilePa]
  }
}

