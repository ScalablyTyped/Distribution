package typings.atBlueprintjsCore.libEsmComponentsPortalPortalMod

import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
@js.native
class Portal ()
  extends Component[IPortalProps, IPortalState, js.Any] {
  @JSName("context")
  var context_Portal: IPortalContext = js.native
  var createContainerElement: js.Any = js.native
  var portalElement: js.Any = js.native
  var unstableRenderNoPortal: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPortal(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPortal(prevProps: IPortalProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortal(): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
@js.native
object Portal extends js.Object {
  var contextTypes: ValidationMap[IPortalContext] = js.native
  var defaultProps: IPortalProps = js.native
  var displayName: String = js.native
}

