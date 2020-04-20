package typings.compressJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressResult extends js.Object {
  var alt: String
  var data: String
  var elapsedTimeInSeconds: Double
  var endHeightInPx: Double
  var endSizeInMb: Double
  var endWidthInPx: Double
  var ext: String
  var initialHeightInPx: Double
  var initialSizeInMb: Double
  var initialWidthInPx: Double
  var iterations: Double
  var prefix: String
  var quality: Double
  var sizeReducedInPercent: Double
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
}

