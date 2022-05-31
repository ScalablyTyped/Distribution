package typings.commangular

import typings.commangular.commangular.ICommAngularStatic
import typings.commangular.commangular.ICommandCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("commangular")
  @js.native
  val commangular: ICommAngularStatic = js.native
  
  /**
  * Mock dispatch function for testing commands.
  * @param ec an ICommandCall object
  * @param callback The function that will be called upon the completion of the command
  *         function should expecte an ICommandInfo parameter.
  */
  inline def dispatch(ec: ICommandCall, callback: js.Function): Unit = (js.Dynamic.global.applyDynamic("dispatch")(ec.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
