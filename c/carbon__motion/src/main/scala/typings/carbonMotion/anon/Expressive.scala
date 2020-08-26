package typings.carbonMotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expressive extends js.Object {
  var expressive: String = js.native
  var productive: String = js.native
}

object Expressive {
  @scala.inline
  def apply(expressive: String, productive: String): Expressive = {
    val __obj = js.Dynamic.literal(expressive = expressive.asInstanceOf[js.Any], productive = productive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expressive]
  }
  @scala.inline
  implicit class ExpressiveOps[Self <: Expressive] (val x: Self) extends AnyVal {
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
    def setExpressive(value: String): Self = this.set("expressive", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductive(value: String): Self = this.set("productive", value.asInstanceOf[js.Any])
  }
  
}

