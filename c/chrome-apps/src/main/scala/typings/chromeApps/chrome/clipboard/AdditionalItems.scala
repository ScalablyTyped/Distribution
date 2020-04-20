package typings.chromeApps.chrome.clipboard

import typings.chromeApps.AnonTEXTHTML
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.TEXT_HTML
import typings.chromeApps.chromeAppsStrings.TEXT_PLAIN
import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalItems extends js.Object {
  /**
    * Content of the additional data item.
    * Either the plain text string if *type* is 'textPlain' or
    * markup string if *type* is 'textHtml'.
    * The data can not exceed 2MB.
    */
  var data: String
  /**
    * Type of the additional data item.
    * @see DataItemType
    */
  var `type`: ToStringLiteral[
    AnonTEXTHTML, 
    TEXT_PLAIN | TEXT_HTML, 
    Exclude[TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
  ]
}

object AdditionalItems {
  @scala.inline
  def apply(
    data: String,
    `type`: ToStringLiteral[
      AnonTEXTHTML, 
      TEXT_PLAIN | TEXT_HTML, 
      Exclude[TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
    ]
  ): AdditionalItems = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalItems]
  }
}

