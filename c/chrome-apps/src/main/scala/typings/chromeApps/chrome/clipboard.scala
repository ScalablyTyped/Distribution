package typings.chromeApps.chrome

import typings.chromeApps.anon.TEXTHTML
import typings.chromeApps.chromeAppsStrings.TEXT_HTML
import typings.chromeApps.chromeAppsStrings.TEXT_PLAIN
import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.clipboard
///////////////
// Clipboard //
///////////////
/**
  * @requires(dev) **Dev** channel only.
  * @requires Permissions: 'clipboard'
  * @description
  * *This API is* **experimental**. *It is* **only** *available to Chrome users on the* **dev** *channel.*
  * The chrome.clipboard API is provided to allow users to access data of the clipboard.
  * This is a temporary solution for chromeos platform apps until open-web alternative is available.
  * It will be deprecated once open-web solution is available.
  * @see[Docs]{@link https://developer.chrome.com/apps/clipboard}
  */
object clipboard {
  
  trait AdditionalItems extends StObject {
    
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
        TEXTHTML, 
        /* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
        Exclude[/* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
      ]
  }
  object AdditionalItems {
    
    inline def apply(
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
    
    extension [Self <: AdditionalItems](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: ToStringLiteral[
              TEXTHTML, 
              /* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
              Exclude[/* keyof chrome-apps.anon.TEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** Image type */
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.png
    - typings.chromeApps.chromeAppsStrings.jpeg
  */
  trait ImageType extends StObject
  object ImageType {
    
    inline def jpeg: typings.chromeApps.chromeAppsStrings.jpeg = "jpeg".asInstanceOf[typings.chromeApps.chromeAppsStrings.jpeg]
    
    inline def png: typings.chromeApps.chromeAppsStrings.png = "png".asInstanceOf[typings.chromeApps.chromeAppsStrings.png]
  }
}
