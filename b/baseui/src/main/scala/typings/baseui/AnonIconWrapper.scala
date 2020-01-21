package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconWrapper extends js.Object {
  var IconWrapper: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object AnonIconWrapper {
  @scala.inline
  def apply(
    IconWrapper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): AnonIconWrapper = {
    val __obj = js.Dynamic.literal()
    if (IconWrapper != null) __obj.updateDynamic("IconWrapper")(IconWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIconWrapper]
  }
}

