package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.componentDTsMod.AxisComponentIndex
import typings.vegaLite8ozrbXDH.layerDTsMod.LayerModel
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/axis/parse.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseLayerAxes(model: LayerModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLayerAxes")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseUnitAxes(model: UnitModel): AxisComponentIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitAxes")(model.asInstanceOf[js.Any]).asInstanceOf[AxisComponentIndex]
}
