package typings.chartJs.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Filler {
  
  @JSImport("chart.js/dist", "Filler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def afterDatasetsUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDatasetsUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeDatasetDraw(chart: Any, args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDatasetDraw")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeDatasetsDraw(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDatasetsDraw")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeDraw(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDraw")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object defaults {
    
    @JSImport("chart.js/dist", "Filler.defaults.drawTime")
    @js.native
    val drawTime: String = js.native
    
    @JSImport("chart.js/dist", "Filler.defaults.propagate")
    @js.native
    val propagate: Boolean = js.native
  }
  
  @JSImport("chart.js/dist", "Filler.id")
  @js.native
  val id: String = js.native
}
