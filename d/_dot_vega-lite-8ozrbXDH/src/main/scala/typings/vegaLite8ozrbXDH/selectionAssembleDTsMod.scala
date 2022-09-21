package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.facetDotDTsMod.FacetModel
import typings.vegaLite8ozrbXDH.layerDTsMod.LayerModel
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.scaleComponentDTsMod.ScaleComponent
import typings.vegaLite8ozrbXDH.selectionDTsMod.ParameterExtent
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionInit
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionInitInterval
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgData
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgDomain
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionAssembleDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleFacetSignals(model: FacetModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleFacetSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
  
  inline def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval], isExpr: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: Unit,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(init: SelectionInit): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def assembleInit(init: SelectionInit, isExpr: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(
    init: SelectionInit,
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assembleInit(init: SelectionInit, isExpr: Unit, wrap: js.Function1[/* str */ String | Double, String | Double]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def assembleLayerSelectionMarks(model: LayerModel, marks: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLayerSelectionMarks")(model.asInstanceOf[js.Any], marks.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def assembleSelectionScaleDomain(model: Model, extent: ParameterExtent, scaleCmpt: ScaleComponent, domain: VgDomain): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleSelectionScaleDomain")(model.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], scaleCmpt.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  
  inline def assembleTopLevelSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleTopLevelSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
  
  inline def assembleUnitSelectionData(model: UnitModel, data: js.Array[VgData]): js.Array[VgData] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionData")(model.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgData]]
  
  inline def assembleUnitSelectionMarks(model: UnitModel, marks: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionMarks")(model.asInstanceOf[js.Any], marks.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def assembleUnitSelectionSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
}
