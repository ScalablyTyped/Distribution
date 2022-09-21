package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.dialogMod.DialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Dialog")
@js.native
open class Dialog protected ()
  extends typings.blueprintjsCore.dialogMod.Dialog {
  def this(props: DialogProps) = this()
}
/* static members */
object Dialog {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Dialog")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Dialog.defaultProps")
  @js.native
  def defaultProps: DialogProps = js.native
  inline def defaultProps_=(x: DialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Dialog.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
