package typings
package axiosDashCancelLib.axiosDashCancelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosCancelOptions extends js.Object {
  /**
    * Enables logging
    * default: false
    */
  var debug: scala.Boolean
}

object AxiosCancelOptions {
  @scala.inline
  def apply(debug: scala.Boolean): AxiosCancelOptions = {
    val __obj = js.Dynamic.literal(debug = debug)
  
    __obj.asInstanceOf[AxiosCancelOptions]
  }
}

