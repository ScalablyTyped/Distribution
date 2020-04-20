package typings.cypress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single screenshot.
  */
trait ScreenshotInformation extends js.Object {
  var height: pixels
  var name: String
  /**
    * Absolute path to the saved image
    */
  var path: String
  var screenshotId: String
  var takenAt: dateTimeISO
  var testId: typings.cypress.mod.testId
  var width: pixels
}

object ScreenshotInformation {
  @scala.inline
  def apply(
    height: pixels,
    name: String,
    path: String,
    screenshotId: String,
    takenAt: dateTimeISO,
    testId: testId,
    width: pixels
  ): ScreenshotInformation = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], screenshotId = screenshotId.asInstanceOf[js.Any], takenAt = takenAt.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotInformation]
  }
}

