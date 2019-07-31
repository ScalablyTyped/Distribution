package typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod

import typings.atBlueprintjsCore.Anon_AnimationState
import typings.atBlueprintjsCore.libEsmCommonAbstractPureComponentMod.AbstractPureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
@js.native
class Collapse () extends AbstractPureComponent[ICollapseProps, ICollapseState] {
  var contents: js.Any = js.native
  var contentsRefHandler: js.Any = js.native
  var height: js.Any = js.native
  var onDelayedStateChange: js.Any = js.native
  @JSName("state")
  var state_Collapse: Anon_AnimationState = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCollapse(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCollapse(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCollapse(nextProps: ICollapseProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
@js.native
object Collapse extends js.Object {
  var defaultProps: ICollapseProps = js.native
  var displayName: String = js.native
}

