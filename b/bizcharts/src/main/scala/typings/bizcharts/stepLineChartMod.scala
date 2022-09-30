package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.bizchartsStrings.hv
import typings.bizcharts.bizchartsStrings.hvh
import typings.bizcharts.bizchartsStrings.vh
import typings.bizcharts.bizchartsStrings.vhv
import typings.bizcharts.lineChartMod.LineOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepLineChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/StepLineChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]] = js.native
  
  trait StepLineOptions
    extends StObject
       with LineOptions {
    
    var step: js.UndefOr[hv | vh | vhv | hvh] = js.undefined
  }
  object StepLineOptions {
    
    inline def apply(data: js.Array[Record[String, Any]]): StepLineOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepLineOptions]
    }
    
    extension [Self <: StepLineOptions](x: Self) {
      
      inline def setStep(value: hv | vh | vhv | hvh): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `stepLineChartMod.foo` */
  override def _to: ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]] = default
}
