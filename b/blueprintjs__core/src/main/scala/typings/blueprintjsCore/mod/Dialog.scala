package typings.blueprintjsCore.mod

import typings.blueprintjsCore.dialogMod.DialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Dialog")
@js.native
open class Dialog protected ()
  extends typings.blueprintjsCore.componentsMod.Dialog {
  def this(props: DialogProps) = this()
}
/* static members */
object Dialog {
  
  @JSImport("@blueprintjs/core", "Dialog")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Dialog.defaultProps")
  @js.native
  def defaultProps: DialogProps = js.native
  inline def defaultProps_=(x: DialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Dialog.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
