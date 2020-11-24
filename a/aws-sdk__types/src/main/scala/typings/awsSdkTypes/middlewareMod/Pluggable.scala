package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pluggable[Input /* <: js.Object */, Output /* <: js.Object */] extends js.Object {
  
  /**
    * A function that mutate the passed in middleware stack. Functions implementing
    * this interface can add, remove, modify existing middleware stack from clients
    * or commands
    */
  def applyToStack(stack: MiddlewareStack[Input, Output]): Unit = js.native
}
object Pluggable {
  
  @scala.inline
  def apply[Input /* <: js.Object */, Output /* <: js.Object */](applyToStack: MiddlewareStack[Input, Output] => Unit): Pluggable[Input, Output] = {
    val __obj = js.Dynamic.literal(applyToStack = js.Any.fromFunction1(applyToStack))
    __obj.asInstanceOf[Pluggable[Input, Output]]
  }
  
  @scala.inline
  implicit class PluggableOps[Self <: Pluggable[_, _], Input /* <: js.Object */, Output /* <: js.Object */] (val x: Self with (Pluggable[Input, Output])) extends AnyVal {
    
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
    def setApplyToStack(value: MiddlewareStack[Input, Output] => Unit): Self = this.set("applyToStack", js.Any.fromFunction1(value))
  }
}
