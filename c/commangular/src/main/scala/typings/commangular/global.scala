package typings.commangular

import org.scalablytyped.runtime.Shortcut
import typings.commangular.commangular.ICommAngularStatic
import typings.commangular.commangular.ICommandCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object commangular extends Shortcut {
    
    @JSGlobal("commangular")
    @js.native
    val ^ : ICommAngularStatic = js.native
    
    type _To = ICommAngularStatic
    
    /* This means you don't have to write `^`, but can instead just say `commangular.foo` */
    override def _to: ICommAngularStatic = ^
  }
  
  /**
  * Mock dispatch function for testing commands.
  * @param ec an ICommandCall object
  * @param callback The function that will be called upon the completion of the command
  *         function should expecte an ICommandInfo parameter.
  */
  @JSGlobal("dispatch")
  @js.native
  def dispatch(ec: ICommandCall, callback: js.Function): Unit = js.native
  
  /**
    * Extending the angular rootScope to include the dispatch function in all scopes.
    */
  object angular
}
