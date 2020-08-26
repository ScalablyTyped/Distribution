package typings.baseui.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelOverrides[T] extends js.Object {
  var Content: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var Header: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var PanelContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var ToggleIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
}

object PanelOverrides {
  @scala.inline
  def apply[T](): PanelOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelOverrides[T]]
  }
  @scala.inline
  implicit class PanelOverridesOps[Self <: PanelOverrides[_], T] (val x: Self with PanelOverrides[T]) extends AnyVal {
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
    def setContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setHeader(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("Header", js.undefined)
    @scala.inline
    def setPanelContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("PanelContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelContainer: Self = this.set("PanelContainer", js.undefined)
    @scala.inline
    def setToggleIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("ToggleIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleIcon: Self = this.set("ToggleIcon", js.undefined)
  }
  
}

