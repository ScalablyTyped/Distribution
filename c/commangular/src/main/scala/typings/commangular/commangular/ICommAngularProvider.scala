package typings.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the command configuration of your application is done in an angular config block and
  * with the $commangularProvider. The provider is responsible to build the command strutures and
  * map them to the desired event names. You can create multiple configs blocks in angular, so you
  * can have multiple command config blocks to separate functional parts of your application.
  * see http://commangular.org/docs/#using-the-provider
  */
@js.native
trait ICommAngularProvider extends js.Object {
  
  /**
    * A command flow is a decision point inside the command group.You can have any number
    * of flows inside a command group and nesting them how you perfer.
    * see http://commangular.org/docs/#building-command-flows
    */
  def asFlow(): ICommAngularDescriptor = js.native
  
  /**
    * Used along with mapTo function. Maps commands to be executed parallel
    * see http://commangular.org/docs/#building-parallel-commands
    */
  def asParallel(): ICommAngularDescriptor = js.native
  
  /**
    * Used along with mapTo function. Creates a sequence of commands that
    * execute after one and other
    * see http://commangular.org/docs/#building-command-sequences
    */
  def asSequence(): ICommAngularDescriptor = js.native
  
  def findCommand(eventName: String): ICommAngularDescriptor = js.native
  
  /**
    * This function lets you map a even name to a command sequence
    * @param eventName An event that will be watched by commangular
    */
  def mapTo(eventName: String): ICommAngularDescriptor = js.native
}
object ICommAngularProvider {
  
  @scala.inline
  def apply(
    asFlow: () => ICommAngularDescriptor,
    asParallel: () => ICommAngularDescriptor,
    asSequence: () => ICommAngularDescriptor,
    findCommand: String => ICommAngularDescriptor,
    mapTo: String => ICommAngularDescriptor
  ): ICommAngularProvider = {
    val __obj = js.Dynamic.literal(asFlow = js.Any.fromFunction0(asFlow), asParallel = js.Any.fromFunction0(asParallel), asSequence = js.Any.fromFunction0(asSequence), findCommand = js.Any.fromFunction1(findCommand), mapTo = js.Any.fromFunction1(mapTo))
    __obj.asInstanceOf[ICommAngularProvider]
  }
  
  @scala.inline
  implicit class ICommAngularProviderOps[Self <: ICommAngularProvider] (val x: Self) extends AnyVal {
    
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
    def setAsFlow(value: () => ICommAngularDescriptor): Self = this.set("asFlow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsParallel(value: () => ICommAngularDescriptor): Self = this.set("asParallel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsSequence(value: () => ICommAngularDescriptor): Self = this.set("asSequence", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindCommand(value: String => ICommAngularDescriptor): Self = this.set("findCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMapTo(value: String => ICommAngularDescriptor): Self = this.set("mapTo", js.Any.fromFunction1(value))
  }
}
