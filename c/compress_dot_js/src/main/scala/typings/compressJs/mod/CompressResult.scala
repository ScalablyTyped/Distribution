package typings.compressJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressResult extends js.Object {
  var alt: String = js.native
  var data: String = js.native
  var elapsedTimeInSeconds: Double = js.native
  var endHeightInPx: Double = js.native
  var endSizeInMb: Double = js.native
  var endWidthInPx: Double = js.native
  var ext: String = js.native
  var initialHeightInPx: Double = js.native
  var initialSizeInMb: Double = js.native
  var initialWidthInPx: Double = js.native
  var iterations: Double = js.native
  var prefix: String = js.native
  var quality: Double = js.native
  var sizeReducedInPercent: Double = js.native
}

object CompressResult {
  @scala.inline
  def apply(
    alt: String,
    data: String,
    elapsedTimeInSeconds: Double,
    endHeightInPx: Double,
    endSizeInMb: Double,
    endWidthInPx: Double,
    ext: String,
    initialHeightInPx: Double,
    initialSizeInMb: Double,
    initialWidthInPx: Double,
    iterations: Double,
    prefix: String,
    quality: Double,
    sizeReducedInPercent: Double
  ): CompressResult = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elapsedTimeInSeconds = elapsedTimeInSeconds.asInstanceOf[js.Any], endHeightInPx = endHeightInPx.asInstanceOf[js.Any], endSizeInMb = endSizeInMb.asInstanceOf[js.Any], endWidthInPx = endWidthInPx.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], initialHeightInPx = initialHeightInPx.asInstanceOf[js.Any], initialSizeInMb = initialSizeInMb.asInstanceOf[js.Any], initialWidthInPx = initialWidthInPx.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sizeReducedInPercent = sizeReducedInPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressResult]
  }
  @scala.inline
  implicit class CompressResultOps[Self <: CompressResult] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setElapsedTimeInSeconds(value: Double): Self = this.set("elapsedTimeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndHeightInPx(value: Double): Self = this.set("endHeightInPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndSizeInMb(value: Double): Self = this.set("endSizeInMb", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndWidthInPx(value: Double): Self = this.set("endWidthInPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialHeightInPx(value: Double): Self = this.set("initialHeightInPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialSizeInMb(value: Double): Self = this.set("initialSizeInMb", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialWidthInPx(value: Double): Self = this.set("initialWidthInPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeReducedInPercent(value: Double): Self = this.set("sizeReducedInPercent", value.asInstanceOf[js.Any])
  }
  
}

