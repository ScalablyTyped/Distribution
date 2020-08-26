package typings.bip32.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Private extends js.Object {
  var `private`: Double = js.native
  var public: Double = js.native
}

object Private {
  @scala.inline
  def apply(`private`: Double, public: Double): Private = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
  @scala.inline
  implicit class PrivateOps[Self <: Private] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrivate(value: Double): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: Double): Self = this.set("public", value.asInstanceOf[js.Any])
  }
  
}

