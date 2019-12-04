package typings.baseui.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabOverrides[T] extends js.Object {
  var Tab: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
}

object TabOverrides {
  @scala.inline
  def apply[T](
    Tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null
  ): TabOverrides[T] = {
    val __obj = js.Dynamic.literal()
    if (Tab != null) __obj.updateDynamic("Tab")(Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOverrides[T]]
  }
}

