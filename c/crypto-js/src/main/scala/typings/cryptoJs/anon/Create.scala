package typings.cryptoJs.anon

import typings.cryptoJs.mod.LibWordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  def create(v: js.Any): LibWordArray = js.native
  def random(v: Double): LibWordArray = js.native
}

object Create {
  @scala.inline
  def apply(create: js.Any => LibWordArray, random: Double => LibWordArray): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), random = js.Any.fromFunction1(random))
    __obj.asInstanceOf[Create]
  }
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
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
    def setCreate(value: js.Any => LibWordArray): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setRandom(value: Double => LibWordArray): Self = this.set("random", js.Any.fromFunction1(value))
  }
  
}

