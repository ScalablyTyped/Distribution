package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static member */
object platform {
  
  @JSImport("chart.js", "platform")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js", "platform.disableCSSInjection")
  @js.native
  def disableCSSInjection: Boolean = js.native
  @scala.inline
  def disableCSSInjection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCSSInjection")(x.asInstanceOf[js.Any])
}
