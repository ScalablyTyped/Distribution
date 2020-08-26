package typings.convertUnits.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Singular extends js.Object {
  var plural: String = js.native
  var singular: String = js.native
}

object Singular {
  @scala.inline
  def apply(plural: String, singular: String): Singular = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singular]
  }
  @scala.inline
  implicit class SingularOps[Self <: Singular] (val x: Self) extends AnyVal {
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
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
  }
  
}

