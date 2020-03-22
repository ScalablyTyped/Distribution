package typings.blueprintjsCore.collapseMod

import typings.blueprintjsCore.AnonAnimationState
import typings.blueprintjsCore.AnonHeight
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
@js.native
class Collapse ()
  extends AbstractPureComponent2[ICollapseProps, ICollapseState, js.Object] {
  var contents: js.Any = js.native
  var contentsRefHandler: js.Any = js.native
  var onDelayedStateChange: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCollapse(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCollapse(): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
@js.native
object Collapse extends js.Object {
  var defaultProps: ICollapseProps = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): AnonAnimationState | AnonHeight = js.native
}

