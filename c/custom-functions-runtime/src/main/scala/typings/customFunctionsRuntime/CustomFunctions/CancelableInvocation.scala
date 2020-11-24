package typings.customFunctionsRuntime.CustomFunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the invocation of a cancelable custom function.
  * A cancelable custom function can provide a handler for the onCanceled event.
  *
  * To indicate that a function is cancelable, in the metadata JSON file, the function options should specify:
  * `{ "cancelable": true }`
  *
  * If the metadata JSON file is being generated from JSDoc comments, include the tag `@cancelable`.
  */
@js.native
trait CancelableInvocation extends Invocation {
  
  /**
    * Event handler called when the custom function is canceled.
    * [Api set: CustomFunctionsRuntime 1.1]
    */
  def onCanceled(): Unit = js.native
}
object CancelableInvocation {
  
  @scala.inline
  def apply(onCanceled: () => Unit): CancelableInvocation = {
    val __obj = js.Dynamic.literal(onCanceled = js.Any.fromFunction0(onCanceled))
    __obj.asInstanceOf[CancelableInvocation]
  }
  
  @scala.inline
  implicit class CancelableInvocationOps[Self <: CancelableInvocation] (val x: Self) extends AnyVal {
    
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
    def setOnCanceled(value: () => Unit): Self = this.set("onCanceled", js.Any.fromFunction0(value))
  }
}
