package typings
package commangularLib.commangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * All the command configuration of your application is done in an angular config block and
	 * with the $commangularProvider. The provider is responsible to build the command strutures and
	 * map them to the desired event names. You can create multiple configs blocks in angular, so you
	 * can have multiple command config blocks to separate functional parts of your application.
	 * see http://commangular.org/docs/#using-the-provider
	 */
trait ICommAngularProvider extends js.Object {
  /**
  		  * A command flow is a decision point inside the command group.You can have any number
  		  * of flows inside a command group and nesting them how you perfer.
  		  * see http://commangular.org/docs/#building-command-flows
  		  */
  def asFlow(): ICommAngularDescriptor
  /**
  		 * Used along with mapTo function. Maps commands to be executed parallel
  		 * see http://commangular.org/docs/#building-parallel-commands
  		 */
  def asParallel(): ICommAngularDescriptor
  /**
  		 * Used along with mapTo function. Creates a sequence of commands that
  		 * execute after one and other
  		 * see http://commangular.org/docs/#building-command-sequences
  		 */
  def asSequence(): ICommAngularDescriptor
  def findCommand(eventName: java.lang.String): ICommAngularDescriptor
  /**
  		 * This function lets you map a even name to a command sequence
  		 * @param eventName An event that will be watched by commangular
  		 */
  def mapTo(eventName: java.lang.String): ICommAngularDescriptor
}

object ICommAngularProvider {
  @scala.inline
  def apply(
    asFlow: js.Function0[ICommAngularDescriptor],
    asParallel: js.Function0[ICommAngularDescriptor],
    asSequence: js.Function0[ICommAngularDescriptor],
    findCommand: js.Function1[java.lang.String, ICommAngularDescriptor],
    mapTo: js.Function1[java.lang.String, ICommAngularDescriptor]
  ): ICommAngularProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asFlow")(asFlow)
    __obj.updateDynamic("asParallel")(asParallel)
    __obj.updateDynamic("asSequence")(asSequence)
    __obj.updateDynamic("findCommand")(findCommand)
    __obj.updateDynamic("mapTo")(mapTo)
    __obj.asInstanceOf[ICommAngularProvider]
  }
}

