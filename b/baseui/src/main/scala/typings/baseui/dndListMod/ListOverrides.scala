package typings.baseui.dndListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOverrides extends js.Object {
  var CloseHandle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.undefined
  var DragHandle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.undefined
  var Item: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.undefined
  var Label: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.undefined
  var List: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.undefined
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
  ] = js.undefined
}

object ListOverrides {
  @scala.inline
  def apply(
    CloseHandle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any = null,
    DragHandle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any = null,
    Item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any = null,
    Label: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any = null,
    List: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any = null,
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any = null
  ): ListOverrides = {
    val __obj = js.Dynamic.literal()
    if (CloseHandle != null) __obj.updateDynamic("CloseHandle")(CloseHandle.asInstanceOf[js.Any])
    if (DragHandle != null) __obj.updateDynamic("DragHandle")(DragHandle.asInstanceOf[js.Any])
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (List != null) __obj.updateDynamic("List")(List.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOverrides]
  }
}

