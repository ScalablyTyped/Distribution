package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdditionalItems extends js.Object {
  /** @enum */
  val DataItemType: Anon_TEXTHTML = js.native
  /**
    * **Dev channel only.**
    * Fired when clipboard data changes.
    * Requires clipboard and clipboardRead permissions for adding listener to
    * chrome.clipboard.onClipboardDataChanged event. After this event fires, the
    * clipboard data is available by calling document.execCommand('paste').
    */
  val onClipboardDataChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
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
  def setImageData(imageData: stdLib.ArrayBuffer, `type`: chromeDashAppsLib.chromeNs.clipboardNs.ImageType): scala.Unit = js.native
  def setImageData(
    imageData: stdLib.ArrayBuffer,
    `type`: chromeDashAppsLib.chromeNs.clipboardNs.ImageType,
    additionalItems: chromeDashAppsLib.chromeNs.clipboardNs.AdditionalItems
  ): scala.Unit = js.native
  def setImageData(
    imageData: stdLib.ArrayBuffer,
    `type`: chromeDashAppsLib.chromeNs.clipboardNs.ImageType,
    additionalItems: chromeDashAppsLib.chromeNs.clipboardNs.AdditionalItems,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

