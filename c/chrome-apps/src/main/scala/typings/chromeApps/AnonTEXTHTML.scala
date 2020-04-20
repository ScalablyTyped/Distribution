package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTEXTHTML extends js.Object {
  var TEXT_HTML: textHtml
  var TEXT_PLAIN: textPlain
}

object AnonTEXTHTML {
  @scala.inline
  def apply(TEXT_HTML: textHtml, TEXT_PLAIN: textPlain): AnonTEXTHTML = {
    val __obj = js.Dynamic.literal(TEXT_HTML = TEXT_HTML.asInstanceOf[js.Any], TEXT_PLAIN = TEXT_PLAIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTEXTHTML]
  }
}

