package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltipsStaticConfiguration extends StObject {
  
  var positioners: StringDictionary[ChartTooltipPositioner]
}
object ChartTooltipsStaticConfiguration {
  
  @scala.inline
  def apply(positioners: StringDictionary[ChartTooltipPositioner]): ChartTooltipsStaticConfiguration = {
    val __obj = js.Dynamic.literal(positioners = positioners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipsStaticConfiguration]
  }
  
  @scala.inline
  implicit class ChartTooltipsStaticConfigurationMutableBuilder[Self <: ChartTooltipsStaticConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPositioners(value: StringDictionary[ChartTooltipPositioner]): Self = StObject.set(x, "positioners", value.asInstanceOf[js.Any])
  }
}
