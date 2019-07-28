package typings.cypress.cypressMod

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
  var testId: typings.cypress.cypressMod.testId
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
    val __obj = js.Dynamic.literal(height = height, name = name, path = path, screenshotId = screenshotId, takenAt = takenAt, testId = testId, width = width)
  
    __obj.asInstanceOf[ScreenshotInformation]
  }
}

