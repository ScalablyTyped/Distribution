package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaFalseOptions extends MetaOptions {
  var meta: js.UndefOr[`false`] = js.native
}

object MetaFalseOptions {
  @scala.inline
  def apply(): MetaFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaFalseOptions]
  }
  @scala.inline
  implicit class MetaFalseOptionsOps[Self <: MetaFalseOptions] (val x: Self) extends AnyVal {
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
    def setMeta(value: `false`): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
  
}

