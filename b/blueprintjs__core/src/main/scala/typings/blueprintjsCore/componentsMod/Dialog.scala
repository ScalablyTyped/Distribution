package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.dialogMod.IDialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Dialog")
@js.native
class Dialog protected ()
  extends typings.blueprintjsCore.dialogMod.Dialog {
  def this(props: IDialogProps) = this()
  def this(props: IDialogProps, context: js.Any) = this()
}
/* static members */
object Dialog {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Dialog")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Dialog.defaultProps")
  @js.native
  def defaultProps: IDialogProps = js.native
  inline def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Dialog.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
