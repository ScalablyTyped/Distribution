package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTooltipsStaticConfiguration extends js.Object {
  
  var positioners: StringDictionary[ChartTooltipPositioner] = js.native
}
object ChartTooltipsStaticConfiguration {
  
  @scala.inline
  def apply(positioners: StringDictionary[ChartTooltipPositioner]): ChartTooltipsStaticConfiguration = {
    val __obj = js.Dynamic.literal(positioners = positioners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipsStaticConfiguration]
  }
  
  @scala.inline
  implicit class ChartTooltipsStaticConfigurationOps[Self <: ChartTooltipsStaticConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPositioners(value: StringDictionary[ChartTooltipPositioner]): Self = this.set("positioners", value.asInstanceOf[js.Any])
  }
}
