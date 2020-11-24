package typings.commangular.commangular

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResultCommand extends ICommand {
  
  /**
    * Is executed when the executed method ends with an error. Can receive the error throw by the execute method.
    * @param error The error that occured during execution
    */
  def onError(error: Error): Unit = js.native
  
  /**
    * Is executed after the execute method and the interception chain and can receive
    * the result from the execute method of the same command.
    *
    * @param result Value/object returned by the execution.
    */
  def onResult(result: js.Any): Unit = js.native
}
object IResultCommand {
  
  @scala.inline
  def apply(execute: () => js.Any, onError: Error => Unit, onResult: js.Any => Unit): IResultCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), onError = js.Any.fromFunction1(onError), onResult = js.Any.fromFunction1(onResult))
    __obj.asInstanceOf[IResultCommand]
  }
  
  @scala.inline
  implicit class IResultCommandOps[Self <: IResultCommand] (val x: Self) extends AnyVal {
    
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
    def setOnError(value: Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResult(value: js.Any => Unit): Self = this.set("onResult", js.Any.fromFunction1(value))
  }
}
