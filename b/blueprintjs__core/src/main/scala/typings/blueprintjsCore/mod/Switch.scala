package typings.blueprintjsCore.mod

import typings.blueprintjsCore.controlsMod.ISwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Switch")
@js.native
class Switch protected ()
  extends typings.blueprintjsCore.componentsMod.Switch {
  def this(props: ISwitchProps) = this()
  def this(props: ISwitchProps, context: js.Any) = this()
}
/* static members */
object Switch {
  
  @JSImport("@blueprintjs/core", "Switch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Switch.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
