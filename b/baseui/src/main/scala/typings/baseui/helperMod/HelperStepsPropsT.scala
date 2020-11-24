package typings.baseui.helperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelperStepsPropsT extends js.Object {
  
  var index: Double = js.native
  
  var length: Double = js.native
  
  def onFinish(): js.Any = js.native
  
  def onNext(): js.Any = js.native
  
  def onPrev(): js.Any = js.native
}
object HelperStepsPropsT {
  
  @scala.inline
  def apply(index: Double, length: Double, onFinish: () => js.Any, onNext: () => js.Any, onPrev: () => js.Any): HelperStepsPropsT = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onFinish = js.Any.fromFunction0(onFinish), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev))
    __obj.asInstanceOf[HelperStepsPropsT]
  }
  
  @scala.inline
  implicit class HelperStepsPropsTOps[Self <: HelperStepsPropsT] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFinish(value: () => js.Any): Self = this.set("onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNext(value: () => js.Any): Self = this.set("onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPrev(value: () => js.Any): Self = this.set("onPrev", js.Any.fromFunction0(value))
  }
}
