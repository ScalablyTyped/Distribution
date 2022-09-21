package typings.vegaLite8ozrbXDH

import typings.std.Partial
import typings.std.Record
import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveDotDTsMod {
  
  /* Inlined std.Partial<std.Record<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channel.d.ts.PositionScaleChannel, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/resolve.d.ts.ResolveMode>> */
  trait AxisResolveMap extends StObject {
    
    var x: js.UndefOr[ResolveMode] = js.undefined
    
    var y: js.UndefOr[ResolveMode] = js.undefined
  }
  object AxisResolveMap {
    
    inline def apply(): AxisResolveMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisResolveMap]
    }
    
    extension [Self <: AxisResolveMap](x: Self) {
      
      inline def setX(value: ResolveMode): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: ResolveMode): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type LegendResolveMap = Partial[Record[NonPositionScaleChannel, ResolveMode]]
  
  trait Resolve extends StObject {
    
    var axis: js.UndefOr[AxisResolveMap] = js.undefined
    
    var legend: js.UndefOr[LegendResolveMap] = js.undefined
    
    var scale: js.UndefOr[ScaleResolveMap] = js.undefined
  }
  object Resolve {
    
    inline def apply(): Resolve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resolve]
    }
    
    extension [Self <: Resolve](x: Self) {
      
      inline def setAxis(value: AxisResolveMap): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setLegend(value: LegendResolveMap): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setScale(value: ScaleResolveMap): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.independent
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.shared
  */
  trait ResolveMode extends StObject
  object ResolveMode {
    
    inline def independent: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.independent = "independent".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.independent]
    
    inline def shared: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.shared = "shared".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.shared]
  }
  
  type ScaleResolveMap = Partial[Record[ScaleChannel, ResolveMode]]
}
