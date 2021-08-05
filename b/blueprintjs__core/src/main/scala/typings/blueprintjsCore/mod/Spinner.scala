package typings.blueprintjsCore.mod

import typings.blueprintjsCore.spinnerMod.ISpinnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Spinner")
@js.native
class Spinner protected ()
  extends typings.blueprintjsCore.componentsMod.Spinner {
  def this(props: ISpinnerProps) = this()
  def this(props: ISpinnerProps, context: js.Any) = this()
}
/* static members */
object Spinner {
  
  @JSImport("@blueprintjs/core", "Spinner")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Spinner.SIZE_LARGE")
  @js.native
  val SIZE_LARGE: /* 100 */ Double = js.native
  
  @JSImport("@blueprintjs/core", "Spinner.SIZE_SMALL")
  @js.native
  val SIZE_SMALL: /* 20 */ Double = js.native
  
  @JSImport("@blueprintjs/core", "Spinner.SIZE_STANDARD")
  @js.native
  val SIZE_STANDARD: /* 50 */ Double = js.native
  
  @JSImport("@blueprintjs/core", "Spinner.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
