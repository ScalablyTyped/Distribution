package typings.baiduApp.anon

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
    destHeight: js.UndefOr[Double] = js.undefined,
    destWidth: js.UndefOr[Double] = js.undefined,
    fail: /* res */ js.Any => Unit = null,
    fileType: String = null,
    height: js.UndefOr[Double] = js.undefined,
    success: /* res */ js.Any => Unit = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): PartialCanvasToTempFilePa = {
    val __obj = js.Dynamic.literal()
    if (canvasId != null) __obj.updateDynamic("canvasId")(canvasId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(destHeight)) __obj.updateDynamic("destHeight")(destHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destWidth)) __obj.updateDynamic("destWidth")(destWidth.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCanvasToTempFilePa]
  }
}

