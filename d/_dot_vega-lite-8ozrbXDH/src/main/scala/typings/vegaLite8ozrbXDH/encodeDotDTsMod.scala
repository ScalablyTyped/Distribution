package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ColorDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.DatumDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.PrimitiveValue
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ShapeDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.Value
import typings.vegaLite8ozrbXDH.componentDotdDottsMod.LegendComponent
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaTypings.encodeMod.EncodeEntry
import typings.vegaTypings.encodeMod.Gradient
import typings.vegaTypings.encodeMod.SymbolEncodeEntry
import typings.vegaTypings.legendMod.LegendType
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def entries(entriesSpec: Any, hasLegendCmpt: LegendEncodeParams): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("entries")(entriesSpec.asInstanceOf[js.Any], hasLegendCmpt.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFirstConditionValue[V /* <: (Value[ExprRef | SignalRef]) | Gradient */](): V = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstConditionValue")().asInstanceOf[V]
  inline def getFirstConditionValue[V /* <: (Value[ExprRef | SignalRef]) | Gradient */](channelDef: ColorDef[String] | ShapeDef[String]): V = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstConditionValue")(channelDef.asInstanceOf[js.Any]).asInstanceOf[V]
  
  inline def gradient(gradientSpec: Any, hasModelLegendTypeLegendCmpt: LegendEncodeParams): SymbolEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("gradient")(gradientSpec.asInstanceOf[js.Any], hasModelLegendTypeLegendCmpt.asInstanceOf[js.Any])).asInstanceOf[SymbolEncodeEntry]
  
  inline def labels(specifiedlabelsSpec: Any, hasFieldOrDatumDefModelChannelLegendCmpt: LegendEncodeParams): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("labels")(specifiedlabelsSpec.asInstanceOf[js.Any], hasFieldOrDatumDefModelChannelLegendCmpt.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* Inlined {[ part in keyof vega.vega.LegendEncode ]:? (spec : vega.vega.EncodeEntry, params : .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts.LegendEncodeParams): vega.vega.EncodeEntry} */
  object legendEncodeRules {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", "legendEncodeRules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", "legendEncodeRules.entries")
    @js.native
    def entries: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    inline def entries_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entries")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", "legendEncodeRules.gradient")
    @js.native
    def gradient: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    inline def gradient_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradient")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", "legendEncodeRules.labels")
    @js.native
    def labels: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    inline def labels_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", "legendEncodeRules.legend")
    @js.native
    def legend: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    inline def legend_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legend")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", "legendEncodeRules.symbols")
    @js.native
    def symbols: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    inline def symbols_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/encode.d.ts", "legendEncodeRules.title")
    @js.native
    def title: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    inline def title_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def symbols(symbolsSpec: Any, hasFieldOrDatumDefModelChannelLegendCmptLegendType: LegendEncodeParams): SymbolEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("symbols")(symbolsSpec.asInstanceOf[js.Any], hasFieldOrDatumDefModelChannelLegendCmptLegendType.asInstanceOf[js.Any])).asInstanceOf[SymbolEncodeEntry]
  
  trait LegendEncodeParams extends StObject {
    
    var channel: NonPositionScaleChannel
    
    var fieldOrDatumDef: (TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    
    var legendCmpt: LegendComponent
    
    var legendType: LegendType
    
    var model: UnitModel
  }
  object LegendEncodeParams {
    
    inline def apply(
      channel: NonPositionScaleChannel,
      fieldOrDatumDef: (TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
      legendCmpt: LegendComponent,
      legendType: LegendType,
      model: UnitModel
    ): LegendEncodeParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], legendCmpt = legendCmpt.asInstanceOf[js.Any], legendType = legendType.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendEncodeParams]
    }
    
    extension [Self <: LegendEncodeParams](x: Self) {
      
      inline def setChannel(value: NonPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setFieldOrDatumDef(
        value: (TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
      ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
      
      inline def setLegendCmpt(value: LegendComponent): Self = StObject.set(x, "legendCmpt", value.asInstanceOf[js.Any])
      
      inline def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
      
      inline def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
}
