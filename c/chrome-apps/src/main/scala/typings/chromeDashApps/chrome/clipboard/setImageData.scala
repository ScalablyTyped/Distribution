package typings.chromeDashApps.chrome.clipboard

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.clipboard.setImageData")
@js.native
object setImageData extends js.Object {
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
  def apply(imageData: ArrayBuffer, `type`: ImageType): Unit = js.native
  def apply(imageData: ArrayBuffer, `type`: ImageType, additionalItems: AdditionalItems): Unit = js.native
  def apply(
    imageData: ArrayBuffer,
    `type`: ImageType,
    additionalItems: AdditionalItems,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

