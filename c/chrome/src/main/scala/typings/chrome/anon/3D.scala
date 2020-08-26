package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3D` extends js.Object {
  var `3D`: js.UndefOr[Features] = js.native
  var plugins: js.UndefOr[Npapi] = js.native
}

object `3D` {
  @scala.inline
  def apply(): `3D` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3D`]
  }
  @scala.inline
  implicit class `3DOps`[Self <: `3D`] (val x: Self) extends AnyVal {
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
    def set3D(value: Features): Self = this.set("3D", value.asInstanceOf[js.Any])
    @scala.inline
    def delete3D: Self = this.set("3D", js.undefined)
    @scala.inline
    def setPlugins(value: Npapi): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
  
}

