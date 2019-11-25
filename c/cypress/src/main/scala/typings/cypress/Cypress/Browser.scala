package typings.cypress.Cypress

import typings.cypress.cypressStrings.Canary
import typings.cypress.cypressStrings.Chrome
import typings.cypress.cypressStrings.Chromium
import typings.cypress.cypressStrings.Electron
import typings.cypress.cypressStrings.FireFox
import typings.cypress.cypressStrings.canary_
import typings.cypress.cypressStrings.chrome_
import typings.cypress.cypressStrings.chromium_
import typings.cypress.cypressStrings.electron_
import typings.cypress.cypressStrings.firefox_
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
  var name: electron_ | chrome_ | canary_ | chromium_ | firefox_
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
    name: electron_ | chrome_ | canary_ | chromium_ | firefox_,
    path: String,
    version: String
  ): Browser = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isHeaded = isHeaded.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Browser]
  }
}

