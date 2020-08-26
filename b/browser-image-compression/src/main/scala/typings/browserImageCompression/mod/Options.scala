package typings.browserImageCompression.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Default to be the exif orientation from the image file */
  var exifOrientation: js.UndefOr[Double] = js.native
  /** Default to be the original mime type from the image file */
  var fileType: js.UndefOr[String] = js.native
  /** @default 10 */
  var maxIteration: js.UndefOr[Double] = js.native
  /** @default Number.POSITIVE_INFINITY */
  var maxSizeMB: js.UndefOr[Double] = js.native
  /** @default undefined */
  var maxWidthOrHeight: js.UndefOr[Double] = js.native
  /** A function takes one progress argument (progress from 0 to 100) */
  var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
  /** @default false */
  var useWebWorker: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExifOrientation(value: Double): Self = this.set("exifOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExifOrientation: Self = this.set("exifOrientation", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setMaxIteration(value: Double): Self = this.set("maxIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIteration: Self = this.set("maxIteration", js.undefined)
    @scala.inline
    def setMaxSizeMB(value: Double): Self = this.set("maxSizeMB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSizeMB: Self = this.set("maxSizeMB", js.undefined)
    @scala.inline
    def setMaxWidthOrHeight(value: Double): Self = this.set("maxWidthOrHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidthOrHeight: Self = this.set("maxWidthOrHeight", js.undefined)
    @scala.inline
    def setOnProgress(value: /* progress */ Double => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setUseWebWorker(value: Boolean): Self = this.set("useWebWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWebWorker: Self = this.set("useWebWorker", js.undefined)
  }
  
}

