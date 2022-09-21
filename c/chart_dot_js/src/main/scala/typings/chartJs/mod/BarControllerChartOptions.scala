package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarControllerChartOptions extends StObject {
  
  /**
    * Should null or undefined values be omitted from drawing
    */
  var skipNull: js.UndefOr[Boolean] = js.undefined
}
object BarControllerChartOptions {
  
  inline def apply(): BarControllerChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarControllerChartOptions]
  }
  
  extension [Self <: BarControllerChartOptions](x: Self) {
    
    inline def setSkipNull(value: Boolean): Self = StObject.set(x, "skipNull", value.asInstanceOf[js.Any])
    
    inline def setSkipNullUndefined: Self = StObject.set(x, "skipNull", js.undefined)
  }
}
