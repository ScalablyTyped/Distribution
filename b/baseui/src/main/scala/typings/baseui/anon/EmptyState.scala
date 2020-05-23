package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyState extends js.Object {
  var EmptyState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var List: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var ListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var Option: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object EmptyState {
  @scala.inline
  def apply(
    EmptyState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    List: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    ListItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    Option: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): EmptyState = {
    val __obj = js.Dynamic.literal()
    if (EmptyState != null) __obj.updateDynamic("EmptyState")(EmptyState.asInstanceOf[js.Any])
    if (List != null) __obj.updateDynamic("List")(List.asInstanceOf[js.Any])
    if (ListItem != null) __obj.updateDynamic("ListItem")(ListItem.asInstanceOf[js.Any])
    if (Option != null) __obj.updateDynamic("Option")(Option.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyState]
  }
}

