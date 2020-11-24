package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrevMaxProp extends js.Object {
  
  var prevMaxProp: js.UndefOr[Double] = js.native
  
  var prevMinProp: js.UndefOr[Double] = js.native
  
  var stepMaxPrecision: Double = js.native
  
  var value: String = js.native
}
object PrevMaxProp {
  
  @scala.inline
  def apply(stepMaxPrecision: Double, value: String): PrevMaxProp = {
    val __obj = js.Dynamic.literal(stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevMaxProp]
  }
  
  @scala.inline
  implicit class PrevMaxPropOps[Self <: PrevMaxProp] (val x: Self) extends AnyVal {
    
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
    def setStepMaxPrecision(value: Double): Self = this.set("stepMaxPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevMaxProp(value: Double): Self = this.set("prevMaxProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevMaxProp: Self = this.set("prevMaxProp", js.undefined)
    
    @scala.inline
    def setPrevMinProp(value: Double): Self = this.set("prevMinProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevMinProp: Self = this.set("prevMinProp", js.undefined)
  }
}
