package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.axisDTsMod.AxisInternal
import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.PositionChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.SingleDefChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.componentDTsMod.AxisInternalIndex
import typings.vegaLite8ozrbXDH.componentDotdDottsMod.LegendInternalIndex
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.legendDTsMod.LegendInternal
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.modelDTsMod.ModelWithField
import typings.vegaLite8ozrbXDH.projectionDTsMod.Projection
import typings.vegaLite8ozrbXDH.scaleComponentDTsMod.ScaleIndex
import typings.vegaLite8ozrbXDH.scaleDTsMod.Domain
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionParameter
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionType
import typings.vegaLite8ozrbXDH.specBaseDTsMod.LayoutSizeMixins
import typings.vegaLite8ozrbXDH.stackDotDTsMod.StackProperties
import typings.vegaLite8ozrbXDH.unitDotDTsMod.NormalizedUnitSpec
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/unit.d.ts", "UnitModel")
  @js.native
  open class UnitModel protected () extends ModelWithField {
    def this(
      spec: NormalizedUnitSpec,
      parent: Model,
      parentGivenName: String,
      parentGivenSize: LayoutSizeMixins,
      config: Config[SignalRef]
    ) = this()
    
    def axis(channel: PositionChannel): AxisInternal = js.native
    
    val encoding: Encoding[String] = js.native
    
    def hasProjection: Boolean = js.native
    
    /* private */ var initAxes: Any = js.native
    
    /* private */ var initAxis: Any = js.native
    
    /* private */ var initLegends: Any = js.native
    
    /* private */ var initScale: Any = js.native
    
    /* private */ var initScales: Any = js.native
    
    def legend(channel: NonPositionScaleChannel): LegendInternal = js.native
    
    def mark: Mark = js.native
    
    val markDef: MarkDef[Mark, SignalRef] = js.native
    
    /**
      * Return specified Vega-Lite scale domain for a particular channel
      * @param channel
      */
    def scaleDomain(channel: ScaleChannel): Domain = js.native
    
    val selection: js.Array[SelectionParameter[SelectionType]] = js.native
    
    /* protected */ var specifiedAxes: AxisInternalIndex = js.native
    
    /* protected */ var specifiedLegends: LegendInternalIndex = js.native
    
    var specifiedProjection: Projection[ExprRef | SignalRef] = js.native
    
    val specifiedScales: ScaleIndex = js.native
    
    val stack: StackProperties = js.native
    
    def typedFieldDef(channel: SingleDefChannel): TypedFieldDef[String, Any, Boolean | BinParams | binned] = js.native
  }
}
