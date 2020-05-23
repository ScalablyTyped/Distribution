package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotDetails extends js.Object {
  var blackout: js.Array[String]
  var dimensions: Dimensions
  var duration: Double
  var multipart: Boolean
  var name: String
  var path: String
  var pixelRatio: Double
  var scaled: Boolean
  var size: Double
  var specName: String
  var takenAt: String
  var testFailure: Boolean
}

object ScreenshotDetails {
  @scala.inline
  def apply(
    blackout: js.Array[String],
    dimensions: Dimensions,
    duration: Double,
    multipart: Boolean,
    name: String,
    path: String,
    pixelRatio: Double,
    scaled: Boolean,
    size: Double,
    specName: String,
    takenAt: String,
    testFailure: Boolean
  ): ScreenshotDetails = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], multipart = multipart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], scaled = scaled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], specName = specName.asInstanceOf[js.Any], takenAt = takenAt.asInstanceOf[js.Any], testFailure = testFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotDetails]
  }
}

