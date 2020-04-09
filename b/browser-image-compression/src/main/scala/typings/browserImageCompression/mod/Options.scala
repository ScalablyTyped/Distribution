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
    exifOrientation: Int | Double = null,
    fileType: String = null,
    maxIteration: Int | Double = null,
    maxSizeMB: Int | Double = null,
    maxWidthOrHeight: Int | Double = null,
    onProgress: /* progress */ Double => Unit = null,
    useWebWorker: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exifOrientation != null) __obj.updateDynamic("exifOrientation")(exifOrientation.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (maxIteration != null) __obj.updateDynamic("maxIteration")(maxIteration.asInstanceOf[js.Any])
    if (maxSizeMB != null) __obj.updateDynamic("maxSizeMB")(maxSizeMB.asInstanceOf[js.Any])
    if (maxWidthOrHeight != null) __obj.updateDynamic("maxWidthOrHeight")(maxWidthOrHeight.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (!js.isUndefined(useWebWorker)) __obj.updateDynamic("useWebWorker")(useWebWorker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

