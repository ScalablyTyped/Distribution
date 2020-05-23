package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.AnimationState
import typings.blueprintjsCore.anon.Height
import typings.blueprintjsCore.collapseMod.ICollapseProps
import typings.blueprintjsCore.collapseMod.ICollapseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Collapse")
@js.native
class Collapse ()
  extends typings.blueprintjsCore.componentsMod.Collapse

/* static members */
@JSImport("@blueprintjs/core", "Collapse")
@js.native
object Collapse extends js.Object {
  var defaultProps: ICollapseProps = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): AnimationState | Height = js.native
}

