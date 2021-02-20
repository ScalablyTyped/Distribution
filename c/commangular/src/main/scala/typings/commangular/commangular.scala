package typings.commangular

import typings.angular.mod.IPromise
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commangular {
  
  @js.native
  trait ICommAngularDescriptor extends StObject {
    
    /**
      * Add commands to a descriptor.
      * @param command The name that was used to create the command.
      */
    def add(command: String): ICommAngularDescriptor = js.native
    /**
      * Add descriptor to a descriptor.
      * @param descriptor Another descriptor attached to a sequnce of commands.
      */
    def add(descriptor: ICommAngularDescriptor): ICommAngularDescriptor = js.native
    
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
    
    /**
      * This is to be used with flowing commands to attach an expression that
      * evaluates using Angular $parse.
      * see http://commangular.org/docs/#building-command-flows
      * @param expression A string form expression that can make use of services to validate conditions.
      * @param services A comma seperated list of services that are used in the above expression
      */
    def link(expression: String): ICommAngularDescriptor = js.native
    def link(expression: String, services: String): ICommAngularDescriptor = js.native
    
    /**
      * Works with the <code>link</code> function to attach a command to the flow if the
      * expression becomes truthy.
      * see http://commangular.org/docs/#building-command-flows
      * @param command The name that was used to create the command.
      */
    def to(command: String): ICommAngularDescriptor = js.native
  }
  
  /**
    * All the command configuration of your application is done in an angular config block and
    * with the $commangularProvider. The provider is responsible to build the command strutures and
    * map them to the desired event names. You can create multiple configs blocks in angular, so you
    * can have multiple command config blocks to separate functional parts of your application.
    * see http://commangular.org/docs/#using-the-provider
    */
  @js.native
  trait ICommAngularProvider extends StObject {
    
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
    implicit class ICommAngularProviderMutableBuilder[Self <: ICommAngularProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsFlow(value: () => ICommAngularDescriptor): Self = StObject.set(x, "asFlow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsParallel(value: () => ICommAngularDescriptor): Self = StObject.set(x, "asParallel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsSequence(value: () => ICommAngularDescriptor): Self = StObject.set(x, "asSequence", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindCommand(value: String => ICommAngularDescriptor): Self = StObject.set(x, "findCommand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapTo(value: String => ICommAngularDescriptor): Self = StObject.set(x, "mapTo", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The service that enables the execution of commands
    * see http://commangular.org/docs/#dispatching-events
    */
  @js.native
  trait ICommAngularService extends StObject {
    
    /**
      * This function executes the given command sequence.
      * see http://commangular.org/docs/#dispatching-events
      * @param eventName Name of the even that will trigger a command sequence
      * @param data Data of any type that will be passed to the command.
      */
    def dispatch(eventName: String): IPromise[_] = js.native
    def dispatch(eventName: String, data: js.Any): IPromise[_] = js.native
  }
  
  ///////////////////////////////////////////////////////////////////////////
  // Commangular Static
  // see http://commangular.org/docs/#commangular-namespace
  ///////////////////////////////////////////////////////////////////////////
  @js.native
  trait ICommAngularStatic extends StObject {
    
    /**
      * This function allows you to hijack the execution before or after and
      * execute some cross cutting functionality.
      * see http://commangular.org/docs/#command-aspects
      * @param aspectDescriptor The interceptor descriptor has two parts 'Where' and 'What'.
      *         Where do you want to intercept? you've 5 options :
      *         - @Before : The interceptor will be executed before the command. You will be able to
      *                 cancel the command or modify the data that will be injected in the command or do
      *                 some other operation you need before the command execution.
      *         - @After : The interceptor will be executed just after the command and before any other next
      *                 command. You can get the lastResult from the command, cancel execution etc etc.
      *         - @AfterExecution : This intercetor is executed just after the command execute method and
      *                 it can get the result from the command and update it before the onResult method is executed.
      *         - @AfterThrowing : This interceptor will be executed if the command or any interceptor of
      *                 the command throws an exception. You can get the error throwed injected to do what you need.
      *         - @Around : The interceptor is executed around a command.That means that a especial
      *                 object 'processor' will be injected in the interceptor and you can invoke the command
      *                 or the next interceptor. It will be better explained below.
      * @param aspectFunction It's the command class execute function that will be run for the given aspect.
      * @param order You can chain any number of interceptors to the same command, so if you need to executed
      *         the interceptor in a specific order you can indicate it here. An order of 0 is assigned by default.
      */
    def aspect(aspectDescriptor: String, aspectFunction: ICommand, order: Double): Unit = js.native
    
    /**
      * TBD
      */
    def build(): Unit = js.native
    
    def command(commandName: String, commandFunction: js.Function): Unit = js.native
    def command(commandName: String, commandFunction: js.Function, commandConfig: ICommandConfig): Unit = js.native
    
    /**
      * Use this function to create and register a command with Commangular
      *
      * @param commandName It's the name of the command you are creating. It's useful to reference the command from the command provider.
      * @param commandFunction It's the command class that will be executed when commangular runs this command.
      *                 It has to be something that implements ICommand. Same as angular syntax
      * @param commandConfig It's and object with paramaters to configure the command execution.
      */
    def create(commandName: String, commandFunction: js.Function): Unit = js.native
    def create(commandName: String, commandFunction: js.Function, commandConfig: ICommandConfig): Unit = js.native
    
    /**
      * Can be used to enable/disable debug
      */
    def debug(enableDebug: Boolean): Unit = js.native
    
    /**
      * Mock dispatch function for testing commands.
      */
    def dispatch(ec: ICommandCall, callback: js.Function): Unit = js.native
    
    /**
      * Event aspects work the same way command aspects do, but they intercept all the command groups instead,
      * so you can run some function before the command group starts it's execution , after or when any
      * command or interceptor in the group throw an exception.
      * see http://commangular.org/docs/#event-aspects
      * @param aspectDescriptor The interceptor descriptor has two parts 'Where' and 'What'.
      *         Where do you want to intercept? you've 3 options :
      *         - @Before : The interceptor will be executed before the command. You will be able to
      *                 cancel the command or modify the data that will be injected in the command or do
      *                 some other operation you need before the command execution.
      *         - @After : The interceptor will be executed just after the command and before any other next
      *                 command. You can get the lastResult from the command, cancel execution etc etc.
      *         - @AfterThrowing : This interceptor will be executed if the command or any interceptor of
      *                 the command throws an exception. You can get the error throwed injected to do what you need.
      * @param aspectFunction It's the command class execute function that will be run for the given aspect.
      * @param order You can chain any number of interceptors to the same command, so if you need to executed
      *         the interceptor in a specific order you can indicate it here. An order of 0 is assigned by default.
      */
    def eventAspect(aspectDescriptor: String, aspectFunction: ICommand, order: Double): Unit = js.native
    
    /**
      * Clears all commands and aspects registered with commangular.
      */
    def reset(): Unit = js.native
    
    /**
      * TBD
      */
    def resolver(commandName: String, resolverFunction: js.Function): Unit = js.native
  }
  
  /**
    * The command function/object
    * see http://commangular.org/docs/#commangular-namespace
    */
  @js.native
  trait ICommand extends StObject {
    
    /**
      * This function is what gets called when the command executes.
      * It can take parameters in as injected by angular
      */
    def execute(): js.Any = js.native
  }
  object ICommand {
    
    @scala.inline
    def apply(execute: () => js.Any): ICommand = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
      __obj.asInstanceOf[ICommand]
    }
    
    @scala.inline
    implicit class ICommandMutableBuilder[Self <: ICommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: () => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ICommandCall extends StObject {
    
    /**
      * Name of the command that needs to
      * execute
      */
    var command: String = js.native
    
    /**
      * Data that needs to be passed to the command
      */
    var data: js.UndefOr[js.Any] = js.native
  }
  object ICommandCall {
    
    @scala.inline
    def apply(command: String): ICommandCall = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandCall]
    }
    
    @scala.inline
    implicit class ICommandCallMutableBuilder[Self <: ICommandCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  /**
    * Command creation configuration
    * see http://commangular.org/docs/#the-command-config-object
    */
  @js.native
  trait ICommandConfig extends StObject {
    
    /**
      * This property instruct commangular to keep the value returned by the command in the value
      * key passed in 'resultKey'. It has to be a string. It means that after the execution of this
      * commands you will be able to inject on the next command using that key and the result of the command will be injected.
      */
    var resultKey: String = js.native
  }
  object ICommandConfig {
    
    @scala.inline
    def apply(resultKey: String): ICommandConfig = {
      val __obj = js.Dynamic.literal(resultKey = resultKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandConfig]
    }
    
    @scala.inline
    implicit class ICommandConfigMutableBuilder[Self <: ICommandConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResultKey(value: String): Self = StObject.set(x, "resultKey", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Object type expected to be passed into the callback function
    * of the dispatch() function
    */
  @js.native
  trait ICommandInfo extends StObject {
    
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
    implicit class ICommandInfoMutableBuilder[Self <: ICommandInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanceled(value: () => Boolean): Self = StObject.set(x, "canceled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCommandExecuted(value: () => Boolean): Self = StObject.set(x, "commandExecuted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataPassed(value: String => js.Any): Self = StObject.set(x, "dataPassed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResultKey(value: String => js.Any): Self = StObject.set(x, "resultKey", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The result object expected in the promise returned by the dispatch function
    * This must be extended to add custom result keys
    * see http://commangular.org/docs/#returning-result-from-commands
    */
  @js.native
  trait ICommandResult extends StObject {
    
    /**
      * By defualt the result of the command will be found in this property
      */
    var lastResult: js.Any = js.native
  }
  object ICommandResult {
    
    @scala.inline
    def apply(lastResult: js.Any): ICommandResult = {
      val __obj = js.Dynamic.literal(lastResult = lastResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandResult]
    }
    
    @scala.inline
    implicit class ICommandResultMutableBuilder[Self <: ICommandResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastResult(value: js.Any): Self = StObject.set(x, "lastResult", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class IResultCommandMutableBuilder[Self <: IResultCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResult(value: js.Any => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
    }
  }
}
