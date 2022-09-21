package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.baseDTsMod.MarkCompiler
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/point.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/point.d.ts", "circle")
  @js.native
  val circle: MarkCompiler = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/point.d.ts", "point")
  @js.native
  val point: MarkCompiler = js.native
  
  inline def shapeMixins(model: UnitModel, config: Config[ExprRef | SignalRef]): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeMixins")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  inline def shapeMixins(
    model: UnitModel,
    config: Config[ExprRef | SignalRef],
    fixedShape: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.circle | typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.square
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeMixins")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any], fixedShape.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/point.d.ts", "square")
  @js.native
  val square: MarkCompiler = js.native
}
