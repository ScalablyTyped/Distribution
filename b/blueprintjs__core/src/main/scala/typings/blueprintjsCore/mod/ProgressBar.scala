package typings.blueprintjsCore.mod

import typings.blueprintjsCore.progressBarMod.ProgressBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "ProgressBar")
@js.native
open class ProgressBar protected ()
  extends typings.blueprintjsCore.componentsMod.ProgressBar {
  def this(props: ProgressBarProps) = this()
  def this(props: ProgressBarProps, context: Any) = this()
}
/* static members */
object ProgressBar {
  
  @JSImport("@blueprintjs/core", "ProgressBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "ProgressBar.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
