package typings.blueprintjsCore.mod

import typings.blueprintjsCore.buttonGroupMod.IButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "ButtonGroup")
@js.native
class ButtonGroup protected ()
  extends typings.blueprintjsCore.componentsMod.ButtonGroup {
  def this(props: IButtonGroupProps) = this()
  def this(props: IButtonGroupProps, context: js.Any) = this()
}
/* static members */
object ButtonGroup {
  
  @JSImport("@blueprintjs/core", "ButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "ButtonGroup.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
