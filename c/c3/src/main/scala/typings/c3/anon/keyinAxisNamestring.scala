package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in c3.c3.AxisName ]:? string} */
@js.native
trait keyinAxisNamestring extends js.Object {
  var x: js.UndefOr[String] = js.native
  var y: js.UndefOr[String] = js.native
  var y2: js.UndefOr[String] = js.native
}

object keyinAxisNamestring {
  @scala.inline
  def apply(): keyinAxisNamestring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinAxisNamestring]
  }
  @scala.inline
  implicit class keyinAxisNamestringOps[Self <: keyinAxisNamestring] (val x: Self) extends AnyVal {
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
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setY2(value: String): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

