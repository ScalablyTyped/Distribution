package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootName extends js.Object {
  var rootName: js.UndefOr[String] = js.native
}

object RootName {
  @scala.inline
  def apply(): RootName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootName]
  }
  @scala.inline
  implicit class RootNameOps[Self <: RootName] (val x: Self) extends AnyVal {
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
    def setRootName(value: String): Self = this.set("rootName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootName: Self = this.set("rootName", js.undefined)
  }
  
}

