package typings
package atBlueprintjsCoreLib.libEsmComponentsPortalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
@js.native
class Portal ()
  extends reactLib.reactMod.Component[IPortalProps, IPortalState, js.Any] {
  @JSName("context")
  var context_Portal: IPortalContext = js.native
  var portalElement: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPortal(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPortal(prevProps: IPortalProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortal(): scala.Unit = js.native
  /* private */ def createContainerElement(): js.Any = js.native
  /* private */ def unstableRenderNoPortal(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
@js.native
object Portal extends js.Object {
  var contextTypes: propDashTypesLib.propDashTypesMod.ValidationMap[atBlueprintjsCoreLib.libEsmComponentsPortalPortalMod.IPortalContext] = js.native
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsPortalPortalMod.IPortalProps = js.native
  var displayName: java.lang.String = js.native
}

