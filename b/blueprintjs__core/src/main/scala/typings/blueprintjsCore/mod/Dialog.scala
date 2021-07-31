package typings.blueprintjsCore.mod

import typings.blueprintjsCore.dialogMod.IDialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Dialog")
@js.native
class Dialog protected ()
  extends typings.blueprintjsCore.componentsMod.Dialog {
  def this(props: IDialogProps) = this()
  def this(props: IDialogProps, context: js.Any) = this()
}
/* static members */
object Dialog {
  
  @JSImport("@blueprintjs/core", "Dialog")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Dialog.defaultProps")
  @js.native
  def defaultProps: IDialogProps = js.native
  @scala.inline
  def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Dialog.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
