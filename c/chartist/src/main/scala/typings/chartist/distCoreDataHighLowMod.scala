package typings.chartist

import typings.chartist.anon.High
import typings.chartist.distCoreTypesMod.AxisName
import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.NormalizedSeries
import typings.chartist.distCoreTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDataHighLowMod {
  
  @JSImport("chartist/dist/core/data/highLow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions]): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[High]
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions], dimension: AxisName): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[High]
}
