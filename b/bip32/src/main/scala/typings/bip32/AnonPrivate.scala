package typings.bip32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivate extends js.Object {
  var `private`: Double
  var public: Double
}

object AnonPrivate {
  @scala.inline
  def apply(`private`: Double, public: Double): AnonPrivate = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivate]
  }
}

