package typings.chromeApps.anon

import typings.chromeApps.chrome.clipboard.AdditionalItems
import typings.chromeApps.chrome.clipboard.ImageType
import typings.chromeApps.chrome.events.Event
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofclipboard extends StObject {
  
  /** @enum */
  val DataItemType: TEXTHTML = js.native
  
  /**
    * **Dev channel only.**
    * Fired when clipboard data changes.
    * Requires clipboard and clipboardRead permissions for adding listener to
    * chrome.clipboard.onClipboardDataChanged event. After this event fires, the
    * clipboard data is available by calling document.execCommand('paste').
    */
  val onClipboardDataChanged: Event[js.Function0[Unit]] = js.native
  
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
}
