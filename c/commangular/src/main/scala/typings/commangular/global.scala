package typings.commangular

import org.scalablytyped.runtime.TopLevel
import typings.commangular.commangular.ICommAngularStatic
import typings.commangular.commangular.ICommandCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
  * Mock dispatch function for testing commands.
  * @param ec an ICommandCall object
  * @param callback The function that will be called upon the completion of the command
  *         function should expecte an ICommandInfo parameter.
  */
  def dispatch(ec: ICommandCall, callback: js.Function): Unit = js.native
  
  /**
    * Extending the angular rootScope to include the dispatch function in all scopes.
    */
  @js.native
  object angular extends js.Object
  
  @js.native
  object commangular extends TopLevel[ICommAngularStatic]
}
