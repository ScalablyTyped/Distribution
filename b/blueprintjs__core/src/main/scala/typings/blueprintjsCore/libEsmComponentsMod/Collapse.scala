package typings.blueprintjsCore.libEsmComponentsMod

import typings.blueprintjsCore.anon.AnimationState
import typings.blueprintjsCore.anon.Height
import typings.blueprintjsCore.anon.PartialCollapseProps
import typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.CollapseProps
import typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.ICollapseState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Collapse")
@js.native
open class Collapse protected ()
  extends typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.Collapse {
  def this(props: CollapseProps) = this()
  def this(props: CollapseProps, context: Any) = this()
}
/* static members */
object Collapse {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Collapse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Collapse.defaultProps")
  @js.native
  def defaultProps: PartialCollapseProps = js.native
  inline def defaultProps_=(x: PartialCollapseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Collapse.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(props: CollapseProps, state: ICollapseState): AnimationState | Height | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AnimationState | Height | Null]
}
