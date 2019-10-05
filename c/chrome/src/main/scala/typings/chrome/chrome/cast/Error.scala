package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Error")
@js.native
class Error protected () extends js.Object {
  /**
    * @param {!chrome.cast.ErrorCode} code
    * @param {string=} opt_description
    * @param {Object=} opt_details
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Error
    */
  def this(code: ErrorCode) = this()
  def this(code: ErrorCode, description: String) = this()
  def this(code: ErrorCode, description: String, details: js.Object) = this()
  var code: ErrorCode = js.native
  var description: js.UndefOr[String] = js.native
  var details: js.UndefOr[String] = js.native
}

