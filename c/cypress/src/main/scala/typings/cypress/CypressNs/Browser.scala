package typings.cypress.CypressNs

import typings.cypress.cypressStrings.Canary
import typings.cypress.cypressStrings.Chrome
import typings.cypress.cypressStrings.Chromium
import typings.cypress.cypressStrings.Electron
import typings.cypress.cypressStrings.FireFox
import typings.cypress.cypressStrings.canary
import typings.cypress.cypressStrings.chrome
import typings.cypress.cypressStrings.chromium
import typings.cypress.cypressStrings.electron
import typings.cypress.cypressStrings.firefox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a browser Cypress can control
  */
trait Browser extends js.Object {
  var displayName: Electron | Chrome | Canary | Chromium | FireFox
  var isHeaded: Boolean
  var isHeadless: Boolean
  var majorVersion: String
  var name: electron | chrome | canary | chromium | firefox
  var path: String
  var version: String
}

object Browser {
  @scala.inline
  def apply(
    displayName: Electron | Chrome | Canary | Chromium | FireFox,
    isHeaded: Boolean,
    isHeadless: Boolean,
    majorVersion: String,
    name: electron | chrome | canary | chromium | firefox,
    path: String,
    version: String
  ): Browser = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isHeaded = isHeaded, isHeadless = isHeadless, majorVersion = majorVersion, name = name.asInstanceOf[js.Any], path = path, version = version)
  
    __obj.asInstanceOf[Browser]
  }
}

