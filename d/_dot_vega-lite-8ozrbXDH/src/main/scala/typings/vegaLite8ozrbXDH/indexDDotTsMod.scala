package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.Escape
import typings.vegaLite8ozrbXDH.dataflowDTsMod.OutputNode
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.parameterDTsMod.ParameterName
import typings.vegaLite8ozrbXDH.projectDTsMod.SelectionProjection
import typings.vegaLite8ozrbXDH.projectDTsMod.SelectionProjectionComponent
import typings.vegaLite8ozrbXDH.selectionDTsMod.BrushConfig
import typings.vegaLite8ozrbXDH.selectionDTsMod.LegendBinding
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionInit
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionInitInterval
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionParameter
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionResolution
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionType
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.scales
import typings.vegaTypings.bindMod.Binding
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDDotTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/index.d.ts", "MODIFY")
  @js.native
  val MODIFY: /* "_modify" */ String = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/index.d.ts", "SELECTION_DOMAIN")
  @js.native
  val SELECTION_DOMAIN: /* "_selection_domain_" */ String = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/index.d.ts", "STORE")
  @js.native
  val STORE: /* "_store" */ String = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/index.d.ts", "TUPLE")
  @js.native
  val TUPLE: /* "_tuple" */ String = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/index.d.ts", "VL_SELECTION_RESOLVE")
  @js.native
  val VL_SELECTION_RESOLVE: /* "vlSelectionResolve" */ String = js.native
  
  inline def disableDirectManipulation_point(selCmpt: SelectionComponent[SelectionType], selDef: SelectionParameter[point]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disableDirectManipulation")(selCmpt.asInstanceOf[js.Any], selDef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requiresSelectionId(model: Model): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("requiresSelectionId")(model.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/index.d.ts", "selectionCompilers")
  @js.native
  val selectionCompilers: js.Array[SelectionCompiler[SelectionType]] = js.native
  
  inline def unitName(model: Model): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitName")(model.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unitName(model: Model, hasEscape: Escape): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitName")(model.asInstanceOf[js.Any], hasEscape.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait SelectionCompiler[T /* <: SelectionType */] extends StObject {
    
    def defined(selCmpt: SelectionComponent[SelectionType]): Boolean
    
    var marks: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[T], 
          /* marks */ js.Array[Any], 
          js.Array[Any]
        ]
      ] = js.undefined
    
    var modifyExpr: js.UndefOr[
        js.Function3[/* model */ UnitModel, /* selCmpt */ SelectionComponent[T], /* expr */ String, String]
      ] = js.undefined
    
    var parse: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[T], 
          /* def */ SelectionParameter[T], 
          Unit
        ]
      ] = js.undefined
    
    var signals: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[T], 
          /* signals */ js.Array[NewSignal], 
          js.Array[Signal]
        ]
      ] = js.undefined
    
    var topLevelSignals: js.UndefOr[
        js.Function3[
          /* model */ Model, 
          /* selCmpt */ SelectionComponent[T], 
          /* signals */ js.Array[NewSignal], 
          js.Array[NewSignal]
        ]
      ] = js.undefined
  }
  object SelectionCompiler {
    
    inline def apply[T /* <: SelectionType */](defined: SelectionComponent[SelectionType] => Boolean): SelectionCompiler[T] = {
      val __obj = js.Dynamic.literal(defined = js.Any.fromFunction1(defined))
      __obj.asInstanceOf[SelectionCompiler[T]]
    }
    
    extension [Self <: SelectionCompiler[?], T /* <: SelectionType */](x: Self & SelectionCompiler[T]) {
      
      inline def setDefined(value: SelectionComponent[SelectionType] => Boolean): Self = StObject.set(x, "defined", js.Any.fromFunction1(value))
      
      inline def setMarks(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[T], /* marks */ js.Array[Any]) => js.Array[Any]
      ): Self = StObject.set(x, "marks", js.Any.fromFunction3(value))
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setModifyExpr(value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[T], /* expr */ String) => String): Self = StObject.set(x, "modifyExpr", js.Any.fromFunction3(value))
      
      inline def setModifyExprUndefined: Self = StObject.set(x, "modifyExpr", js.undefined)
      
      inline def setParse(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[T], /* def */ SelectionParameter[T]) => Unit
      ): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setSignals(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[T], /* signals */ js.Array[NewSignal]) => js.Array[Signal]
      ): Self = StObject.set(x, "signals", js.Any.fromFunction3(value))
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setTopLevelSignals(
        value: (/* model */ Model, /* selCmpt */ SelectionComponent[T], /* signals */ js.Array[NewSignal]) => js.Array[NewSignal]
      ): Self = StObject.set(x, "topLevelSignals", js.Any.fromFunction3(value))
      
      inline def setTopLevelSignalsUndefined: Self = StObject.set(x, "topLevelSignals", js.undefined)
    }
  }
  
  trait SelectionComponent[T /* <: SelectionType */] extends StObject {
    
    var bind: js.UndefOr[scales | Binding | Dict[Binding] | LegendBinding] = js.undefined
    
    var clear: js.UndefOr[Any] = js.undefined
    
    var events: js.Array[Stream]
    
    var init: js.UndefOr[js.Array[js.Array[SelectionInit | SelectionInitInterval]]] = js.undefined
    
    var mark: js.UndefOr[BrushConfig] = js.undefined
    
    var materialized: OutputNode
    
    var name: ParameterName
    
    var nearest: js.UndefOr[Any] = js.undefined
    
    var project: SelectionProjectionComponent
    
    var resolve: SelectionResolution
    
    var scales: js.UndefOr[js.Array[SelectionProjection]] = js.undefined
    
    var toggle: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[Any] = js.undefined
    
    var `type`: T
    
    var zoom: js.UndefOr[Any] = js.undefined
  }
  object SelectionComponent {
    
    inline def apply[T /* <: SelectionType */](
      events: js.Array[Stream],
      materialized: OutputNode,
      name: ParameterName,
      project: SelectionProjectionComponent,
      resolve: SelectionResolution,
      `type`: T
    ): SelectionComponent[T] = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], materialized = materialized.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionComponent[T]]
    }
    
    extension [Self <: SelectionComponent[?], T /* <: SelectionType */](x: Self & SelectionComponent[T]) {
      
      inline def setBind(value: scales | Binding | Dict[Binding] | LegendBinding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setClear(value: Any): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setEvents(value: js.Array[Stream]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Stream*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInit(value: js.Array[js.Array[SelectionInit | SelectionInitInterval]]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setInitVarargs(value: (js.Array[SelectionInit | SelectionInitInterval])*): Self = StObject.set(x, "init", js.Array(value*))
      
      inline def setMark(value: BrushConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setMaterialized(value: OutputNode): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      inline def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNearest(value: Any): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      inline def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      inline def setProject(value: SelectionProjectionComponent): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setScales(value: js.Array[SelectionProjection]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      inline def setScalesVarargs(value: SelectionProjection*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTranslate(value: Any): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Any): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
