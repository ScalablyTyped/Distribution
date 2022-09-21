package typings.blueprintjsCore.mod

import typings.blueprintjsCore.buttonGroupMod.ButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "ButtonGroup")
@js.native
open class ButtonGroup protected ()
  extends typings.blueprintjsCore.componentsMod.ButtonGroup {
  def this(props: ButtonGroupProps) = this()
  def this(props: ButtonGroupProps, context: Any) = this()
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
