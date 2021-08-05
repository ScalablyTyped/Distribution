package typings.blueprintjsCore.mod

import typings.blueprintjsCore.controlsMod.IRadioProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Radio")
@js.native
class Radio protected ()
  extends typings.blueprintjsCore.componentsMod.Radio {
  def this(props: IRadioProps) = this()
  def this(props: IRadioProps, context: js.Any) = this()
}
/* static members */
object Radio {
  
  @JSImport("@blueprintjs/core", "Radio")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Radio.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
