package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartistEasingStatic extends js.Object {
  
  var easeInBack: IChartistEasingDefinition = js.native
  
  var easeInCirc: IChartistEasingDefinition = js.native
  
  var easeInCubic: IChartistEasingDefinition = js.native
  
  var easeInExpo: IChartistEasingDefinition = js.native
  
  var easeInOutBack: IChartistEasingDefinition = js.native
  
  var easeInOutCirc: IChartistEasingDefinition = js.native
  
  var easeInOutCubic: IChartistEasingDefinition = js.native
  
  var easeInOutExpo: IChartistEasingDefinition = js.native
  
  var easeInOutQuad: IChartistEasingDefinition = js.native
  
  var easeInOutQuart: IChartistEasingDefinition = js.native
  
  var easeInOutQuint: IChartistEasingDefinition = js.native
  
  var easeInOutSine: IChartistEasingDefinition = js.native
  
  var easeInQuad: IChartistEasingDefinition = js.native
  
  var easeInQuart: IChartistEasingDefinition = js.native
  
  var easeInQuint: IChartistEasingDefinition = js.native
  
  var easeInSine: IChartistEasingDefinition = js.native
  
  var easeOutBack: IChartistEasingDefinition = js.native
  
  var easeOutCirc: IChartistEasingDefinition = js.native
  
  var easeOutCubic: IChartistEasingDefinition = js.native
  
  var easeOutExpo: IChartistEasingDefinition = js.native
  
  var easeOutQuad: IChartistEasingDefinition = js.native
  
  var easeOutQuart: IChartistEasingDefinition = js.native
  
  var easeOutQuint: IChartistEasingDefinition = js.native
  
  var easeOutSine: IChartistEasingDefinition = js.native
}
object ChartistEasingStatic {
  
  @scala.inline
  def apply(
    easeInBack: IChartistEasingDefinition,
    easeInCirc: IChartistEasingDefinition,
    easeInCubic: IChartistEasingDefinition,
    easeInExpo: IChartistEasingDefinition,
    easeInOutBack: IChartistEasingDefinition,
    easeInOutCirc: IChartistEasingDefinition,
    easeInOutCubic: IChartistEasingDefinition,
    easeInOutExpo: IChartistEasingDefinition,
    easeInOutQuad: IChartistEasingDefinition,
    easeInOutQuart: IChartistEasingDefinition,
    easeInOutQuint: IChartistEasingDefinition,
    easeInOutSine: IChartistEasingDefinition,
    easeInQuad: IChartistEasingDefinition,
    easeInQuart: IChartistEasingDefinition,
    easeInQuint: IChartistEasingDefinition,
    easeInSine: IChartistEasingDefinition,
    easeOutBack: IChartistEasingDefinition,
    easeOutCirc: IChartistEasingDefinition,
    easeOutCubic: IChartistEasingDefinition,
    easeOutExpo: IChartistEasingDefinition,
    easeOutQuad: IChartistEasingDefinition,
    easeOutQuart: IChartistEasingDefinition,
    easeOutQuint: IChartistEasingDefinition,
    easeOutSine: IChartistEasingDefinition
  ): ChartistEasingStatic = {
    val __obj = js.Dynamic.literal(easeInBack = easeInBack.asInstanceOf[js.Any], easeInCirc = easeInCirc.asInstanceOf[js.Any], easeInCubic = easeInCubic.asInstanceOf[js.Any], easeInExpo = easeInExpo.asInstanceOf[js.Any], easeInOutBack = easeInOutBack.asInstanceOf[js.Any], easeInOutCirc = easeInOutCirc.asInstanceOf[js.Any], easeInOutCubic = easeInOutCubic.asInstanceOf[js.Any], easeInOutExpo = easeInOutExpo.asInstanceOf[js.Any], easeInOutQuad = easeInOutQuad.asInstanceOf[js.Any], easeInOutQuart = easeInOutQuart.asInstanceOf[js.Any], easeInOutQuint = easeInOutQuint.asInstanceOf[js.Any], easeInOutSine = easeInOutSine.asInstanceOf[js.Any], easeInQuad = easeInQuad.asInstanceOf[js.Any], easeInQuart = easeInQuart.asInstanceOf[js.Any], easeInQuint = easeInQuint.asInstanceOf[js.Any], easeInSine = easeInSine.asInstanceOf[js.Any], easeOutBack = easeOutBack.asInstanceOf[js.Any], easeOutCirc = easeOutCirc.asInstanceOf[js.Any], easeOutCubic = easeOutCubic.asInstanceOf[js.Any], easeOutExpo = easeOutExpo.asInstanceOf[js.Any], easeOutQuad = easeOutQuad.asInstanceOf[js.Any], easeOutQuart = easeOutQuart.asInstanceOf[js.Any], easeOutQuint = easeOutQuint.asInstanceOf[js.Any], easeOutSine = easeOutSine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartistEasingStatic]
  }
  
  @scala.inline
  implicit class ChartistEasingStaticOps[Self <: ChartistEasingStatic] (val x: Self) extends AnyVal {
    
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
    def setEaseInBack(value: IChartistEasingDefinition): Self = this.set("easeInBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInCirc(value: IChartistEasingDefinition): Self = this.set("easeInCirc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInCubic(value: IChartistEasingDefinition): Self = this.set("easeInCubic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInExpo(value: IChartistEasingDefinition): Self = this.set("easeInExpo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutBack(value: IChartistEasingDefinition): Self = this.set("easeInOutBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutCirc(value: IChartistEasingDefinition): Self = this.set("easeInOutCirc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutCubic(value: IChartistEasingDefinition): Self = this.set("easeInOutCubic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutExpo(value: IChartistEasingDefinition): Self = this.set("easeInOutExpo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutQuad(value: IChartistEasingDefinition): Self = this.set("easeInOutQuad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutQuart(value: IChartistEasingDefinition): Self = this.set("easeInOutQuart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutQuint(value: IChartistEasingDefinition): Self = this.set("easeInOutQuint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOutSine(value: IChartistEasingDefinition): Self = this.set("easeInOutSine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInQuad(value: IChartistEasingDefinition): Self = this.set("easeInQuad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInQuart(value: IChartistEasingDefinition): Self = this.set("easeInQuart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInQuint(value: IChartistEasingDefinition): Self = this.set("easeInQuint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInSine(value: IChartistEasingDefinition): Self = this.set("easeInSine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutBack(value: IChartistEasingDefinition): Self = this.set("easeOutBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutCirc(value: IChartistEasingDefinition): Self = this.set("easeOutCirc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutCubic(value: IChartistEasingDefinition): Self = this.set("easeOutCubic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutExpo(value: IChartistEasingDefinition): Self = this.set("easeOutExpo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutQuad(value: IChartistEasingDefinition): Self = this.set("easeOutQuad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutQuart(value: IChartistEasingDefinition): Self = this.set("easeOutQuart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutQuint(value: IChartistEasingDefinition): Self = this.set("easeOutQuint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutSine(value: IChartistEasingDefinition): Self = this.set("easeOutSine", value.asInstanceOf[js.Any])
  }
}
