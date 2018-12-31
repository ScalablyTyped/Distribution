package typings
package commangularLib.commangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// Commangular Static
// see http://commangular.org/docs/#commangular-namespace
///////////////////////////////////////////////////////////////////////////
@js.native
trait ICommAngularStatic extends js.Object {
  /**
  		 * This function allows you to hijack the execution before or after and
  		 * execute some cross cutting functionality.
  		 * see http://commangular.org/docs/#command-aspects
  		 * @param aspectDescriptor The interceptor descriptor has two parts 'Where' and 'What'.
  		 * 		Where do you want to intercept? you've 5 options :
  		 * 		- @Before : The interceptor will be executed before the command. You will be able to
  		 * 				cancel the command or modify the data that will be injected in the command or do
  		 * 				some other operation you need before the command execution.
  		 * 		- @After : The interceptor will be executed just after the command and before any other next
  		 * 				command. You can get the lastResult from the command, cancel execution etc etc.
  		 * 		- @AfterExecution : This intercetor is executed just after the command execute method and
  		 * 				it can get the result from the command and update it before the onResult method is executed.
  		 * 		- @AfterThrowing : This interceptor will be executed if the command or any interceptor of
  		 * 				the command throws an exception. You can get the error throwed injected to do what you need.
  		 * 		- @Around : The interceptor is executed around a command.That means that a especial
  		 * 				object 'processor' will be injected in the interceptor and you can invoke the command
  		 * 				or the next interceptor. It will be better explained below.
  		 * @param aspectFunction It's the command class execute function that will be run for the given aspect.
  		 * @param order You can chain any number of interceptors to the same command, so if you need to executed
  		 * 		the interceptor in a specific order you can indicate it here. An order of 0 is assigned by default.
  		 */
  def aspect(aspectDescriptor: java.lang.String, aspectFunction: ICommand, order: scala.Double): scala.Unit = js.native
  /**
  		 * TBD
  		 */
  def build(): scala.Unit = js.native
  def command(commandName: java.lang.String, commandFunction: angularLib.angularMod.Global.Function): scala.Unit = js.native
  def command(
    commandName: java.lang.String,
    commandFunction: angularLib.angularMod.Global.Function,
    commandConfig: ICommandConfig
  ): scala.Unit = js.native
  /**
    * Use this function to create and register a command with Commangular
    *
    * @param commandName It's the name of the command you are creating. It's useful to reference the command from the command provider.
    * @param commandFunction It's the command class that will be executed when commangular runs this command.
  		 * 				It has to be something that implements ICommand. Same as angular syntax
    * @param commandConfig It's and object with paramaters to configure the command execution.
    */
  def create(commandName: java.lang.String, commandFunction: angularLib.angularMod.Global.Function): scala.Unit = js.native
  def create(
    commandName: java.lang.String,
    commandFunction: angularLib.angularMod.Global.Function,
    commandConfig: ICommandConfig
  ): scala.Unit = js.native
  /**
  		 * Can be used to enable/disable debug
  		 */
  def debug(enableDebug: scala.Boolean): scala.Unit = js.native
  /**
  		 * Mock dispatch function for testing commands.
  		 */
  def dispatch(ec: ICommandCall, callback: angularLib.angularMod.Global.Function): scala.Unit = js.native
  /**
  		 * Event aspects work the same way command aspects do, but they intercept all the command groups instead,
  		 * so you can run some function before the command group starts it's execution , after or when any
  		 * command or interceptor in the group throw an exception.
  		 * see http://commangular.org/docs/#event-aspects
  		 * @param aspectDescriptor The interceptor descriptor has two parts 'Where' and 'What'.
  		 * 		Where do you want to intercept? you've 3 options :
  		 * 		- @Before : The interceptor will be executed before the command. You will be able to
  		 * 				cancel the command or modify the data that will be injected in the command or do
  		 * 				some other operation you need before the command execution.
  		 * 		- @After : The interceptor will be executed just after the command and before any other next
  		 * 				command. You can get the lastResult from the command, cancel execution etc etc.
  		 * 		- @AfterThrowing : This interceptor will be executed if the command or any interceptor of
  		 * 				the command throws an exception. You can get the error throwed injected to do what you need.
  		 * @param aspectFunction It's the command class execute function that will be run for the given aspect.
  		 * @param order You can chain any number of interceptors to the same command, so if you need to executed
  		 * 		the interceptor in a specific order you can indicate it here. An order of 0 is assigned by default.
  		 */
  def eventAspect(aspectDescriptor: java.lang.String, aspectFunction: ICommand, order: scala.Double): scala.Unit = js.native
  /**
  		 * Clears all commands and aspects registered with commangular.
  		 */
  def reset(): scala.Unit = js.native
  /**
  		 * TBD
  		 */
  def resolver(commandName: java.lang.String, resolverFunction: angularLib.angularMod.Global.Function): scala.Unit = js.native
}

