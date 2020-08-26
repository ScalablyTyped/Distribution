package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.clipboard.AdditionalItems
import typings.chromeApps.chrome.clipboard.ImageType
import typings.chromeApps.chromeAppsStrings.textHtml
import typings.chromeApps.chromeAppsStrings.textPlain
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("chrome.clipboard")
@js.native
object clipboard extends js.Object {
  /**
    * **Dev channel only.**
    * Fired when clipboard data changes.
    * Requires clipboard and clipboardRead permissions for adding listener to
    * chrome.clipboard.onClipboardDataChanged event. After this event fires, the
    * clipboard data is available by calling document.execCommand('paste').
    */
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
  def setImageData(imageData: ArrayBuffer, `type`: ImageType): Unit = js.native
  def setImageData(
    imageData: ArrayBuffer,
    `type`: ImageType,
    additionalItems: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setImageData(imageData: ArrayBuffer, `type`: ImageType, additionalItems: AdditionalItems): Unit = js.native
  def setImageData(
    imageData: ArrayBuffer,
    `type`: ImageType,
    additionalItems: AdditionalItems,
    callback: js.Function0[Unit]
  ): Unit = js.native
  /** @enum */
  @js.native
  object DataItemType extends js.Object {
    var TEXT_HTML: textHtml = js.native
    var TEXT_PLAIN: textPlain = js.native
  }
  
}

