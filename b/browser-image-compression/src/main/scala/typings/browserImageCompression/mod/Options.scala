package typings.browserImageCompression.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Default to be the exif orientation from the image file */
  var exifOrientation: js.UndefOr[Double] = js.undefined
  /** Default to be the original mime type from the image file */
  var fileType: js.UndefOr[String] = js.undefined
  /** @default 10 */
  var maxIteration: js.UndefOr[Double] = js.undefined
  /** @default Number.POSITIVE_INFINITY */
  var maxSizeMB: js.UndefOr[Double] = js.undefined
  /** @default undefined */
  var maxWidthOrHeight: js.UndefOr[Double] = js.undefined
  /** A function takes one progress argument (progress from 0 to 100) */
  var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
  /** @default false */
  var useWebWorker: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exifOrientation: js.UndefOr[Double] = js.undefined,
    fileType: String = null,
    maxIteration: js.UndefOr[Double] = js.undefined,
    maxSizeMB: js.UndefOr[Double] = js.undefined,
    maxWidthOrHeight: js.UndefOr[Double] = js.undefined,
    onProgress: /* progress */ Double => Unit = null,
    useWebWorker: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exifOrientation)) __obj.updateDynamic("exifOrientation")(exifOrientation.get.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIteration)) __obj.updateDynamic("maxIteration")(maxIteration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSizeMB)) __obj.updateDynamic("maxSizeMB")(maxSizeMB.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidthOrHeight)) __obj.updateDynamic("maxWidthOrHeight")(maxWidthOrHeight.get.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (!js.isUndefined(useWebWorker)) __obj.updateDynamic("useWebWorker")(useWebWorker.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

