package typings
package debessmannLib.debessmannMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var dm: debessmannLib.debessmannMod.DM
}

object Window {
  @scala.inline
  def apply(dm: debessmannLib.debessmannMod.DM): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dm")(dm)
    __obj.asInstanceOf[Window]
  }
}

