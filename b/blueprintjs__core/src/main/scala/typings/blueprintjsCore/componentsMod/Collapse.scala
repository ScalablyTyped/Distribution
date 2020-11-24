package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.AnimationState
import typings.blueprintjsCore.anon.Height
import typings.blueprintjsCore.collapseMod.ICollapseProps
import typings.blueprintjsCore.collapseMod.ICollapseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Collapse")
@js.native
class Collapse ()
  extends typings.blueprintjsCore.collapseMod.Collapse
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components", "Collapse")
@js.native
object Collapse extends js.Object {
  
  var defaultProps: ICollapseProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): AnimationState | Height | Null = js.native
}
