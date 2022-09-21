package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PartialMultistepDialogPro
import typings.blueprintjsCore.multistepDialogMod.MultistepDialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "MultistepDialog")
@js.native
open class MultistepDialog protected ()
  extends typings.blueprintjsCore.multistepDialogMod.MultistepDialog {
  def this(props: MultistepDialogProps) = this()
  def this(props: MultistepDialogProps, context: Any) = this()
}
/* static members */
object MultistepDialog {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultistepDialog")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultistepDialog.defaultProps")
  @js.native
  def defaultProps: PartialMultistepDialogPro = js.native
  inline def defaultProps_=(x: PartialMultistepDialogPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultistepDialog.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
