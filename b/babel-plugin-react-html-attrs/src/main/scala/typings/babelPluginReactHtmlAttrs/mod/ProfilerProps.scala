package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.mount
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.update
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var id: String
  var onRender: ProfilerOnRenderCallback
}

object ProfilerProps {
  @scala.inline
  def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[SchedulerInteraction]) => Unit,
    children: js.UndefOr[Null | ReactNode] = js.undefined
  ): ProfilerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7(onRender))
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerProps]
  }
}

