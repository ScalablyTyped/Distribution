package typings.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object type expected to be passed into the callback function
  * of the dispatch() function
  */
@js.native
trait ICommandInfo extends js.Object {
  
  /**
    * Indicates if the command execution was cancelled.
    */
  def canceled(): Boolean = js.native
  
  /**
    * Indicates if the command was executed????
    */
  def commandExecuted(): Boolean = js.native
  
  /**
    * The data that was passed into the command
    * @param key The property name that is in the object that was passed
    */
  def dataPassed(key: String): js.Any = js.native
  
  /**
    * The data that was returned by the command
    * @param key The result key that was defined in the command. If no result
    *         was defined use 'lastResult' as the key
    */
  def resultKey(key: String): js.Any = js.native
}
object ICommandInfo {
  
  @scala.inline
  def apply(
    canceled: () => Boolean,
    commandExecuted: () => Boolean,
    dataPassed: String => js.Any,
    resultKey: String => js.Any
  ): ICommandInfo = {
    val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction0(canceled), commandExecuted = js.Any.fromFunction0(commandExecuted), dataPassed = js.Any.fromFunction1(dataPassed), resultKey = js.Any.fromFunction1(resultKey))
    __obj.asInstanceOf[ICommandInfo]
  }
  
  @scala.inline
  implicit class ICommandInfoOps[Self <: ICommandInfo] (val x: Self) extends AnyVal {
    
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
    def setCanceled(value: () => Boolean): Self = this.set("canceled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommandExecuted(value: () => Boolean): Self = this.set("commandExecuted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataPassed(value: String => js.Any): Self = this.set("dataPassed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResultKey(value: String => js.Any): Self = this.set("resultKey", js.Any.fromFunction1(value))
  }
}
