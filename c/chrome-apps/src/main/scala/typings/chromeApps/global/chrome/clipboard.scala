package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.clipboard.AdditionalItems
import typings.chromeApps.chrome.clipboard.ImageType
import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.clipboard
///////////////
// Clipboard //
///////////////
/**
  * @requires **Dev** channel only.
  * @requires Permissions: 'clipboard'
  * @description
  * *This API is* **experimental**. *It is* **only** *available to Chrome users on the* **dev** *channel.*
  * The chrome.clipboard API is provided to allow users to access data of the clipboard.
  * This is a temporary solution for chromeos platform apps until open-web alternative is available.
  * It will be deprecated once open-web solution is available.
  * @see https://developer.chrome.com/apps/clipboard
  */
object clipboard {
  
  @JSGlobal("chrome.clipboard")
  @js.native
  val ^ : js.Any = js.native
  
  object DataItemType {
    
    @JSGlobal("chrome.clipboard.DataItemType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.clipboard.DataItemType.TEXT_HTML")
    @js.native
    def TEXT_HTML: textHtml = js.native
    inline def TEXT_HTML_=(x: textHtml): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_HTML")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.clipboard.DataItemType.TEXT_PLAIN")
    @js.native
    def TEXT_PLAIN: textPlain = js.native
    inline def TEXT_PLAIN_=(x: textPlain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_PLAIN")(x.asInstanceOf[js.Any])
  }
  
  /**
    * **Dev channel only.**
    * Fired when clipboard data changes.
    * Requires clipboard and clipboardRead permissions for adding listener to
    * chrome.clipboard.onClipboardDataChanged event. After this event fires, the
    * clipboard data is available by calling document.execCommand('paste').
    */
  @JSGlobal("chrome.clipboard.onClipboardDataChanged")
  @js.native
  val onClipboardDataChanged: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
  
  /**
    * **Dev channel only.**
    * Sets image data to clipboard
    * @param imageData The encoded image data. *Since Chrome 71. Warning: this is the current Dev channel.*
    * @param type The type of image being passed. *Since Chrome 71. Warning: this is the current Dev channel.*
    * @param [additionalItems] Additional data items for describing image data.
    *      The callback is called with chrome.runtime.lastError set to error code if there is an error.
    *      Requires clipboard and clipboardWrite permissions.
    *      *Since Chrome 71. Warning: this is the current Dev channel.*
    * @param [callback]
    */
  inline def setImageData(imageData: js.typedarray.ArrayBuffer, `type`: ImageType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setImageData")(imageData.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setImageData(
    imageData: js.typedarray.ArrayBuffer,
    `type`: ImageType,
    additionalItems: Unit,
    callback: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setImageData")(imageData.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], additionalItems.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setImageData(imageData: js.typedarray.ArrayBuffer, `type`: ImageType, additionalItems: AdditionalItems): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setImageData")(imageData.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], additionalItems.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setImageData(
    imageData: js.typedarray.ArrayBuffer,
    `type`: ImageType,
    additionalItems: AdditionalItems,
    callback: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setImageData")(imageData.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], additionalItems.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
