package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotOptions extends js.Object {
  var blackout: js.Array[java.lang.String]
  var capture: cypressLib.cypressLibStrings.runner | cypressLib.cypressLibStrings.viewport | cypressLib.cypressLibStrings.fullPage
  var clip: Dimensions
  var disableTimersAndAnimations: scala.Boolean
  var scale: scala.Boolean
  def afterScreenshot(doc: stdLib.Document): scala.Unit
  def beforeScreenshot(doc: stdLib.Document): scala.Unit
}

