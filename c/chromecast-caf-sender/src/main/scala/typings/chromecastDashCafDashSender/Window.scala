package typings.chromecastDashCafDashSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Global object
////////////////////
trait Window extends js.Object {
  var cast: Typeofcast
  def __onGCastApiAvailable(available: Boolean): Unit
}

object Window {
  @scala.inline
  def apply(__onGCastApiAvailable: Boolean => Unit, cast: Typeofcast): Window = {
    val __obj = js.Dynamic.literal(__onGCastApiAvailable = js.Any.fromFunction1(__onGCastApiAvailable), cast = cast)
  
    __obj.asInstanceOf[Window]
  }
}

