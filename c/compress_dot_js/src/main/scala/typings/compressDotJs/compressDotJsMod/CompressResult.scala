package typings.compressDotJs.compressDotJsMod

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
    val __obj = js.Dynamic.literal(alt = alt, data = data, elapsedTimeInSeconds = elapsedTimeInSeconds, endHeightInPx = endHeightInPx, endSizeInMb = endSizeInMb, endWidthInPx = endWidthInPx, ext = ext, initialHeightInPx = initialHeightInPx, initialSizeInMb = initialSizeInMb, initialWidthInPx = initialWidthInPx, iterations = iterations, prefix = prefix, quality = quality, sizeReducedInPercent = sizeReducedInPercent)
  
    __obj.asInstanceOf[CompressResult]
  }
}

