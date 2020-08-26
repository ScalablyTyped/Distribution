package typings.baseui.dndListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOverrides extends js.Object {
  var CloseHandle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.native
  var DragHandle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.native
  var Item: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.native
  var Label: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.native
  var List: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.native
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.native
}

object ListOverrides {
  @scala.inline
  def apply(): ListOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOverrides]
  }
  @scala.inline
  implicit class ListOverridesOps[Self <: ListOverrides] (val x: Self) extends AnyVal {
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
    def setCloseHandle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
    ): Self = this.set("CloseHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseHandle: Self = this.set("CloseHandle", js.undefined)
    @scala.inline
    def setDragHandle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
    ): Self = this.set("DragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHandle: Self = this.set("DragHandle", js.undefined)
    @scala.inline
    def setItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
    ): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
    @scala.inline
    def setLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
    ): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    @scala.inline
    def setList(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
    ): Self = this.set("List", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("List", js.undefined)
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
  }
  
}

