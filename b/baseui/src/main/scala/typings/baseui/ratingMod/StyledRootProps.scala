package typings.baseui.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledRootProps extends js.Object {
  @JSName("$theme")
  var $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
}

object StyledRootProps {
  @scala.inline
  def apply(
    $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ): StyledRootProps = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledRootProps]
  }
  @scala.inline
  implicit class StyledRootPropsOps[Self <: StyledRootProps] (val x: Self) extends AnyVal {
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
    def set$theme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
    ): Self = this.set("$theme", value.asInstanceOf[js.Any])
  }
  
}

