package typings.chartJs.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Decimation {
  
  @JSImport("chart.js/dist", "Decimation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def beforeElementsUpdate(chart: Any, args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeElementsUpdate")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object defaults {
    
    @JSImport("chart.js/dist", "Decimation.defaults.algorithm")
    @js.native
    val algorithm: String = js.native
    
    @JSImport("chart.js/dist", "Decimation.defaults.enabled")
    @js.native
    val enabled: Boolean = js.native
  }
  
  inline def destroy(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("chart.js/dist", "Decimation.id")
  @js.native
  val id: String = js.native
}
