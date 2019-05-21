package typings
package cypressLib.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single screenshot.
  */
trait ScreenshotInformation extends js.Object {
  var height: pixels
  var name: java.lang.String
  /**
    * Absolute path to the saved image
    */
  var path: java.lang.String
  var screenshotId: java.lang.String
  var takenAt: dateTimeISO
  var testId: cypressLib.cypressMod.testId
  var width: pixels
}

object ScreenshotInformation {
  @scala.inline
  def apply(
    height: pixels,
    name: java.lang.String,
    path: java.lang.String,
    screenshotId: java.lang.String,
    takenAt: dateTimeISO,
    testId: testId,
    width: pixels
  ): ScreenshotInformation = {
    val __obj = js.Dynamic.literal(height = height, name = name, path = path, screenshotId = screenshotId, takenAt = takenAt, testId = testId, width = width)
  
    __obj.asInstanceOf[ScreenshotInformation]
  }
}

