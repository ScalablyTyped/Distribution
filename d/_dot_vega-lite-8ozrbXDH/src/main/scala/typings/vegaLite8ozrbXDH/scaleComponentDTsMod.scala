package typings.vegaLite8ozrbXDH

import typings.std.Partial
import typings.std.Record
import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.scaleDTsMod.Scale
import typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
import typings.vegaLite8ozrbXDH.selectionDTsMod.ParameterExtent
import typings.vegaLite8ozrbXDH.splitDTsMod.Explicit
import typings.vegaLite8ozrbXDH.splitDTsMod.Split
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgNonUnionDomain
import typings.vegaTypings.scaleMod.RangeBand
import typings.vegaTypings.scaleMod.RangeRawArray
import typings.vegaTypings.scaleMod.RangeScheme
import typings.vegaTypings.scaleMod.ScaleBins
import typings.vegaTypings.scaleMod.ScaleData
import typings.vegaTypings.scaleMod.ScaleInterpolate
import typings.vegaTypings.scaleMod.TimeInterval
import typings.vegaTypings.scaleMod.TimeIntervalStep
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleComponentDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/component.d.ts", "ScaleComponent")
  @js.native
  open class ScaleComponent protected () extends Split[ScaleComponentProps] {
    def this(name: String, typeWithExplicit: Explicit[ScaleType]) = this()
    
    /**
      * Whether the scale definitely includes zero in the domain
      */
    def domainDefinitelyIncludesZero(): Boolean = js.native
    
    var merged: Boolean = js.native
  }
  
  type Range = js.UndefOr[RangeScheme | RangeBand | ScaleData]
  
  type ScaleComponentIndex = Partial[Record[ScaleChannel, ScaleComponent]]
  
  /* Inlined std.Omit<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/vega.schema.d.ts.VgScale, 'domain' | 'domainRaw' | 'reverse'> & {  domains :std.Array<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/vega.schema.d.ts.VgNonUnionDomain>,   selectionExtent :.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/selection.d.ts.ParameterExtent | undefined,   reverse :boolean | vega.vega.SignalRef | undefined} */
  trait ScaleComponentProps extends StObject {
    
    var align: js.UndefOr[Double | SignalRef] = js.undefined
    
    var base: js.UndefOr[Double | SignalRef] = js.undefined
    
    var bins: js.UndefOr[ScaleBins] = js.undefined
    
    var clamp: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var constant: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domainImplicit: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var domainMax: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domainMid: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domainMin: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domains: js.Array[VgNonUnionDomain]
    
    var exponent: js.UndefOr[Double | SignalRef] = js.undefined
    
    var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
    
    var name: String
    
    var nice: js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef] = js.undefined
    
    var padding: js.UndefOr[Double | SignalRef] = js.undefined
    
    var paddingInner: js.UndefOr[Double | SignalRef] = js.undefined
    
    var paddingOuter: js.UndefOr[Double | SignalRef] = js.undefined
    
    var range: js.UndefOr[RangeScheme | RangeBand | ScaleData] = js.undefined
    
    var reverse: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var round: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var selectionExtent: js.UndefOr[ParameterExtent] = js.undefined
    
    var `type`: js.UndefOr[typings.vegaTypings.scaleMod.ScaleType] = js.undefined
    
    var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
  }
  object ScaleComponentProps {
    
    inline def apply(domains: js.Array[VgNonUnionDomain], name: String): ScaleComponentProps = {
      val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleComponentProps]
    }
    
    extension [Self <: ScaleComponentProps](x: Self) {
      
      inline def setAlign(value: Double | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBase(value: Double | SignalRef): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      inline def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value*))
      
      inline def setClamp(value: Boolean | SignalRef): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setConstant(value: Double | SignalRef): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      inline def setDomainImplicit(value: Boolean | SignalRef): Self = StObject.set(x, "domainImplicit", value.asInstanceOf[js.Any])
      
      inline def setDomainImplicitUndefined: Self = StObject.set(x, "domainImplicit", js.undefined)
      
      inline def setDomainMax(value: Double | SignalRef): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
      
      inline def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
      
      inline def setDomainMid(value: Double | SignalRef): Self = StObject.set(x, "domainMid", value.asInstanceOf[js.Any])
      
      inline def setDomainMidUndefined: Self = StObject.set(x, "domainMid", js.undefined)
      
      inline def setDomainMin(value: Double | SignalRef): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
      
      inline def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
      
      inline def setDomains(value: js.Array[VgNonUnionDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsVarargs(value: VgNonUnionDomain*): Self = StObject.set(x, "domains", js.Array(value*))
      
      inline def setExponent(value: Double | SignalRef): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      inline def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNice(value: Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      inline def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
      
      inline def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
      
      inline def setPaddingOuter(value: Double | SignalRef): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
      
      inline def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRange(value: RangeScheme | RangeBand | ScaleData): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setReverse(value: Boolean | SignalRef): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSelectionExtent(value: ParameterExtent): Self = StObject.set(x, "selectionExtent", value.asInstanceOf[js.Any])
      
      inline def setSelectionExtentUndefined: Self = StObject.set(x, "selectionExtent", js.undefined)
      
      inline def setType(value: typings.vegaTypings.scaleMod.ScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  type ScaleIndex = Partial[Record[ScaleChannel, Scale[SignalRef]]]
}
