package typings.blueprintjsCore.mod

import typings.blueprintjsCore.spinnerMod.SpinnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Spinner")
@js.native
open class Spinner protected ()
  extends typings.blueprintjsCore.componentsMod.Spinner {
  def this(props: SpinnerProps) = this()
  def this(props: SpinnerProps, context: Any) = this()
}
/* static members */
object Spinner {
  
  @JSImport("@blueprintjs/core", "Spinner")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Spinner.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
