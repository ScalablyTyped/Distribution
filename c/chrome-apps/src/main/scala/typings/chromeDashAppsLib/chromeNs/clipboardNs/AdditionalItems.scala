package typings
package chromeDashAppsLib.chromeNs.clipboardNs

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
  var data: java.lang.String
  /**
    * Type of the additional data item.
    * @see DataItemType
    */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_TEXTHTML, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_TEXTHTML[keyof chrome-apps.Anon_TEXTHTML] */ js.Any
    ]
  ]
}

object AdditionalItems {
  @scala.inline
  def apply(
    data: java.lang.String,
    `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_TEXTHTML, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_TEXTHTML[keyof chrome-apps.Anon_TEXTHTML] */ js.Any
      ]
    ]
  ): AdditionalItems = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[AdditionalItems]
  }
}

