package typings.axiosCancel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosCancelOptions extends js.Object {
  /**
    * Enables logging
    * default: false
    */
  var debug: Boolean
}

object AxiosCancelOptions {
  @scala.inline
  def apply(debug: Boolean): AxiosCancelOptions = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosCancelOptions]
  }
}

