package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.componentDDotTsMod.LayoutSizeType
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.scaleComponentDTsMod.ScaleComponent
import typings.vegaTypings.signalMod.InitSignal
import typings.vegaTypings.signalMod.NewSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assembleDotdDottsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/layoutsize/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleLayoutSignals(model: Model): js.Array[NewSignal] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleLayoutSignals")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[NewSignal]]
  
  inline def sizeExpr(scaleName: String, scaleComponent: ScaleComponent, cardinality: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeExpr")(scaleName.asInstanceOf[js.Any], scaleComponent.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sizeSignals(model: Model, sizeType: LayoutSizeType): js.Array[NewSignal | InitSignal] = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeSignals")(model.asInstanceOf[js.Any], sizeType.asInstanceOf[js.Any])).asInstanceOf[js.Array[NewSignal | InitSignal]]
}
