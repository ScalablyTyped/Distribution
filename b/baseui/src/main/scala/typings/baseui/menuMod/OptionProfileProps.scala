package typings.baseui.menuMod

import typings.baseui.anon.Body
import typings.baseui.anon.ListItemProfile
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionProfileProps extends BaseMenuPropsT {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, ReactNode]] = js.native
  var item: js.Any = js.native
  var overrides: js.UndefOr[ListItemProfile] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  def getProfileItemImg(item: js.Any): String | ComponentType[_] = js.native
  def getProfileItemImgText(item: js.Any): String = js.native
  def getProfileItemLabels(item: js.Any): Body = js.native
}

object OptionProfileProps {
  @scala.inline
  def apply(
    getProfileItemImg: js.Any => String | ComponentType[_],
    getProfileItemImgText: js.Any => String,
    getProfileItemLabels: js.Any => Body,
    item: js.Any
  ): OptionProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProfileProps]
  }
  @scala.inline
  implicit class OptionProfilePropsOps[Self <: OptionProfileProps] (val x: Self) extends AnyVal {
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
    def setGetProfileItemImg(value: js.Any => String | ComponentType[_]): Self = this.set("getProfileItemImg", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProfileItemImgText(value: js.Any => String): Self = this.set("getProfileItemImgText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProfileItemLabels(value: js.Any => Body): Self = this.set("getProfileItemLabels", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = this.set("$isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isHighlighted: Self = this.set("$isHighlighted", js.undefined)
    @scala.inline
    def setGetChildMenu(value: /* item */ js.Any => ReactNode): Self = this.set("getChildMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetChildMenu: Self = this.set("getChildMenu", js.undefined)
    @scala.inline
    def setOverrides(value: ListItemProfile): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setResetMenu(value: () => Unit): Self = this.set("resetMenu", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetMenu: Self = this.set("resetMenu", js.undefined)
  }
  
}

