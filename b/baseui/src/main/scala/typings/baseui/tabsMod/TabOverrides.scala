package typings.baseui.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabOverrides[T] extends js.Object {
  var Tab: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
}

object TabOverrides {
  @scala.inline
  def apply[T](): TabOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabOverrides[T]]
  }
  @scala.inline
  implicit class TabOverridesOps[Self <: TabOverrides[_], T] (val x: Self with TabOverrides[T]) extends AnyVal {
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
    def setTab(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("Tab", js.undefined)
  }
  
}

