package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoveListener extends js.Object {
  def removeListener(): scala.Unit
}

object Anon_RemoveListener {
  @scala.inline
  def apply(removeListener: js.Function0[scala.Unit]): Anon_RemoveListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[Anon_RemoveListener]
  }
}

