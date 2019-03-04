package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a browser Cypress can control
  */
trait Browser extends js.Object {
  var displayName: cypressLib.cypressLibStrings.Electron | cypressLib.cypressLibStrings.Chrome | cypressLib.cypressLibStrings.Canary | cypressLib.cypressLibStrings.Chromium | cypressLib.cypressLibStrings.FireFox
  var isHeaded: scala.Boolean
  var isHeadless: scala.Boolean
  var majorVersion: java.lang.String
  var name: cypressLib.cypressLibStrings.electron | cypressLib.cypressLibStrings.chrome | cypressLib.cypressLibStrings.canary | cypressLib.cypressLibStrings.chromium | cypressLib.cypressLibStrings.firefox
  var path: java.lang.String
  var version: java.lang.String
}

object Browser {
  @scala.inline
  def apply(
    displayName: cypressLib.cypressLibStrings.Electron | cypressLib.cypressLibStrings.Chrome | cypressLib.cypressLibStrings.Canary | cypressLib.cypressLibStrings.Chromium | cypressLib.cypressLibStrings.FireFox,
    isHeaded: scala.Boolean,
    isHeadless: scala.Boolean,
    majorVersion: java.lang.String,
    name: cypressLib.cypressLibStrings.electron | cypressLib.cypressLibStrings.chrome | cypressLib.cypressLibStrings.canary | cypressLib.cypressLibStrings.chromium | cypressLib.cypressLibStrings.firefox,
    path: java.lang.String,
    version: java.lang.String
  ): Browser = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isHeaded = isHeaded, isHeadless = isHeadless, majorVersion = majorVersion, name = name.asInstanceOf[js.Any], path = path, version = version)
  
    __obj.asInstanceOf[Browser]
  }
}

