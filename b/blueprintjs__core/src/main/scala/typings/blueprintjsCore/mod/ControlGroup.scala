package typings.blueprintjsCore.mod

import typings.blueprintjsCore.controlGroupMod.IControlGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "ControlGroup")
@js.native
class ControlGroup protected ()
  extends typings.blueprintjsCore.componentsMod.ControlGroup {
  def this(props: IControlGroupProps) = this()
  def this(props: IControlGroupProps, context: js.Any) = this()
}
/* static members */
object ControlGroup {
  
  @JSImport("@blueprintjs/core", "ControlGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "ControlGroup.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
