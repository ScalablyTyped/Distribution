package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistEasingDefinition extends js.Object {
  
  var `0`: Double = js.native
  
  var `1`: Double = js.native
  
  var `2`: Double = js.native
  
  var `3`: Double = js.native
}
object IChartistEasingDefinition {
  
  @scala.inline
  def apply(`0`: Double, `1`: Double, `2`: Double, `3`: Double): IChartistEasingDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistEasingDefinition]
  }
  
  @scala.inline
  implicit class IChartistEasingDefinitionOps[Self <: IChartistEasingDefinition] (val x: Self) extends AnyVal {
    
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
    def set0(value: Double): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1(value: Double): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: Double): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: Double): Self = this.set("3", value.asInstanceOf[js.Any])
  }
}
