package typings.baseui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProviderOverrides extends js.Object {
  var AppContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var LayersContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object BaseProviderOverrides {
  @scala.inline
  def apply(): BaseProviderOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProviderOverrides]
  }
  @scala.inline
  implicit class BaseProviderOverridesOps[Self <: BaseProviderOverrides] (val x: Self) extends AnyVal {
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
    def setAppContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("AppContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppContainer: Self = this.set("AppContainer", js.undefined)
    @scala.inline
    def setLayersContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("LayersContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayersContainer: Self = this.set("LayersContainer", js.undefined)
  }
  
}

