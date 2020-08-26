package typings.cathoQuantum.socialsMod

import typings.cathoQuantum.anon.Name
import typings.cathoQuantum.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialsProps extends js.Object {
  var items: NonEmptyArray[Name] = js.native
  var size: js.UndefOr[String] = js.native
  var theme: js.UndefOr[`1`] = js.native
  var withBox: js.UndefOr[Boolean] = js.native
}

object SocialsProps {
  @scala.inline
  def apply(items: NonEmptyArray[Name]): SocialsProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialsProps]
  }
  @scala.inline
  implicit class SocialsPropsOps[Self <: SocialsProps] (val x: Self) extends AnyVal {
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
    def setItems(value: NonEmptyArray[Name]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTheme(value: `1`): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWithBox(value: Boolean): Self = this.set("withBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithBox: Self = this.set("withBox", js.undefined)
  }
  
}

