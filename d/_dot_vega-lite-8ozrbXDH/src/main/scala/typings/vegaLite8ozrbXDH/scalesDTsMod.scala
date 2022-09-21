package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.indexDDotTsMod.SelectionCompiler
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalesDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/scales.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/scales.d.ts", JSImport.Default)
  @js.native
  val default: SelectionCompiler[interval] = js.native
  
  inline def domain(model: UnitModel, channel: ScaleChannel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("domain")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
}
