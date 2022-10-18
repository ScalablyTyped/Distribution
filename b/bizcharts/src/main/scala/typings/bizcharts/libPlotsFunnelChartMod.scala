package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsFunnelChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/FunnelChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[FunnelOptions & RefAttributes[Any]] = js.native
  
  trait FunnelOptions
    extends StObject
       with typings.antvG2plot.libPlotsFunnelTypesMod.FunnelOptions
       with BasePlotOptions {
    
    /** g2Plot@1.0的api，即将废弃，请使用isTransposed替代 */
    var transpose: js.UndefOr[Boolean] = js.undefined
  }
  object FunnelOptions {
    
    inline def apply(data: js.Array[Record[String, Any]]): FunnelOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelOptions]
    }
    
    extension [Self <: FunnelOptions](x: Self) {
      
      inline def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
      
      inline def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[FunnelOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsFunnelChartMod.foo` */
  override def _to: ForwardRefExoticComponent[FunnelOptions & RefAttributes[Any]] = default
}
