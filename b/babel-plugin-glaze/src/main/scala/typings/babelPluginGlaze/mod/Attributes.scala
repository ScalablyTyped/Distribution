package typings.babelPluginGlaze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var sx: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedStyle */ js.Any
  ] = js.native
}

object Attributes {
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
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
    def setSx(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedStyle */ js.Any
    ): Self = this.set("sx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSx: Self = this.set("sx", js.undefined)
  }
  
}

