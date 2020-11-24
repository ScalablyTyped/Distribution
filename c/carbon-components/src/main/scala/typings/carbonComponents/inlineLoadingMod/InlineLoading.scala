package typings.carbonComponents.inlineLoadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait InlineLoading extends js.Object {
  
  def setState(state: js.Any): this.type = js.native
}
object InlineLoading {
  
  @scala.inline
  def apply(setState: js.Any => InlineLoading): InlineLoading = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[InlineLoading]
  }
  
  @scala.inline
  implicit class InlineLoadingOps[Self <: InlineLoading] (val x: Self) extends AnyVal {
    
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
    def setSetState(value: js.Any => InlineLoading): Self = this.set("setState", js.Any.fromFunction1(value))
  }
}
