package typings.blueprintjsCore.mod

import typings.blueprintjsCore.toastMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Toast")
@js.native
open class Toast protected ()
  extends typings.blueprintjsCore.componentsMod.Toast {
  def this(props: ToastProps) = this()
  def this(props: ToastProps, context: Any) = this()
}
/* static members */
object Toast {
  
  @JSImport("@blueprintjs/core", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Toast.defaultProps")
  @js.native
  def defaultProps: ToastProps = js.native
  inline def defaultProps_=(x: ToastProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Toast.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
