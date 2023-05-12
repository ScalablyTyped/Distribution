package typings.chartJs.chartJsMod

import typings.chartJs.anon.Logarithmic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ticks {
  
  @JSImport("chart/js", "Ticks")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart/js", "Ticks.formatters")
  @js.native
  def formatters: Logarithmic = js.native
  inline def formatters_=(x: Logarithmic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatters")(x.asInstanceOf[js.Any])
}
