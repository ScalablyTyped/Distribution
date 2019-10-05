package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.SenderApplication")
@js.native
class SenderApplication protected () extends js.Object {
  /**
    * @param {!chrome.cast.SenderPlatform} platform
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.SenderApplication
    */
  def this(platform: SenderPlatform) = this()
  var packageId: js.UndefOr[String] = js.native
  var platform: SenderPlatform = js.native
  var url: js.UndefOr[String] = js.native
}

