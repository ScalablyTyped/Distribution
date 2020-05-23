package typings.babelPluginGlaze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var sx: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedStyle */ js.Any
  ] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    sx: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedStyle */ js.Any = null
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (sx != null) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

