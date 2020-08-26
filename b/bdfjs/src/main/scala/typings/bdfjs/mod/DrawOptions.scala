package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOptions extends js.Object {
  var kerningBias: js.UndefOr[Double] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
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
    def setKerningBias(value: Double): Self = this.set("kerningBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerningBias: Self = this.set("kerningBias", js.undefined)
  }
  
}

