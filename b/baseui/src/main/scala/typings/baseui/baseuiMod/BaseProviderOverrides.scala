package typings.baseui.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderOverrides extends js.Object {
  var AppContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var LayersContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object BaseProviderOverrides {
  @scala.inline
  def apply(
    AppContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    LayersContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): BaseProviderOverrides = {
    val __obj = js.Dynamic.literal()
    if (AppContainer != null) __obj.updateDynamic("AppContainer")(AppContainer.asInstanceOf[js.Any])
    if (LayersContainer != null) __obj.updateDynamic("LayersContainer")(LayersContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderOverrides]
  }
}

