package typings.chromeApps.chrome.clipboard

import typings.chromeApps.anon.TEXTHTML
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.TEXT_HTML
import typings.chromeApps.chromeAppsStrings.TEXT_PLAIN
import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalItems extends js.Object {
  
  /**
    * Content of the additional data item.
    * Either the plain text string if *type* is 'textPlain' or
    * markup string if *type* is 'textHtml'.
    * The data can not exceed 2MB.
    */
  var data: String = js.native
  
  /**
    * Type of the additional data item.
    * @see DataItemType
    */
  var `type`: ToStringLiteral[
    TEXTHTML, 
    /* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
    Exclude[/* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
  ] = js.native
}
object AdditionalItems {
  
  @scala.inline
  def apply(
    data: String,
    `type`: ToStringLiteral[
      TEXTHTML, 
      /* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
      Exclude[/* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
    ]
  ): AdditionalItems = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalItems]
  }
  
  @scala.inline
  implicit class AdditionalItemsOps[Self <: AdditionalItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: ToStringLiteral[
          TEXTHTML, 
          /* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
          Exclude[/* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
