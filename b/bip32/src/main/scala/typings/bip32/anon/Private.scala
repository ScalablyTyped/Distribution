package typings.bip32.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Private extends js.Object {
  var `private`: Double
  var public: Double
}

object Private {
  @scala.inline
  def apply(`private`: Double, public: Double): Private = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
}

