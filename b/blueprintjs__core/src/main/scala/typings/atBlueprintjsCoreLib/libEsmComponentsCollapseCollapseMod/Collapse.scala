package typings
package atBlueprintjsCoreLib.libEsmComponentsCollapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
@js.native
class Collapse ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[ICollapseProps, ICollapseState] {
  var contents: js.Any = js.native
  var contentsRefHandler: js.Any = js.native
  var height: js.Any = js.native
  @JSName("state")
  var state_Collapse: atBlueprintjsCoreLib.Anon_AnimationState = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCollapse(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCollapse(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCollapse(nextProps: ICollapseProps): scala.Unit = js.native
  /* private */ def onDelayedStateChange(): js.Any = js.native
}

@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
@js.native
object Collapse extends js.Object {
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsCollapseCollapseMod.ICollapseProps = js.native
  var displayName: java.lang.String = js.native
}

