package typings.camundaExternalTaskClientJs

import org.scalablytyped.runtime.StringDictionary
import typings.camundaExternalTaskClientJs.anon.Error
import typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonsuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camunda-external-task-client-js", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(config: ClientConfig) = this()
    
    def on(name: ErrorEvent, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    def on(name: ErrorWithTaskEvent, callback: js.Function2[/* task */ Task, /* error */ js.Any, Unit]): Unit = js.native
    def on(name: PollEvent, callback: js.Function0[Unit]): Unit = js.native
    def on(name: SuccessWithTaskEvent, callback: js.Function1[/* task */ Task, Unit]): Unit = js.native
    def on(name: SuccessWithTasksEvent, callback: js.Function1[/* tasks */ js.Array[Task], Unit]): Unit = js.native
    def on(
      name: TopicEvent,
      callback: js.Function2[/* topic */ String, /* topicSubscription */ TopicSubscription, Unit]
    ): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def subscribe(topic: String, handler: Handler): TopicSubscription = js.native
    def subscribe(topic: String, options: SubscribeOptions, handler: Handler): TopicSubscription = js.native
  }
  
  @JSImport("camunda-external-task-client-js", "Variables")
  @js.native
  class Variables () extends StObject {
    
    def get(variableName: String): Value = js.native
    
    def getAll(): ValueMap = js.native
    
    def getAllTyped(): TypedValueMap = js.native
    
    def getTyped(variableName: String): TypedValue = js.native
    
    def set(variableName: String, value: Value): Variables = js.native
    
    def setAll(values: ValueMap): Variables = js.native
    
    def setAllTyped(typedValues: TypedValueMap): Variables = js.native
    
    def setTyped(variableName: String, typedValue: TypedValue): Variables = js.native
  }
  
  @JSImport("camunda-external-task-client-js", "logger")
  @js.native
  val logger: Logger_ = js.native
  
  @js.native
  trait ClientConfig extends StObject {
    
    var asyncResponseTimeout: js.UndefOr[Double] = js.native
    
    var autoPoll: js.UndefOr[Boolean] = js.native
    
    var baseUrl: String = js.native
    
    var interceptors: js.UndefOr[Interceptor | js.Array[Interceptor]] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var lockDuration: js.UndefOr[Double] = js.native
    
    var maxParallelExecutions: js.UndefOr[Double] = js.native
    
    var maxTasks: js.UndefOr[Double] = js.native
    
    var use: js.UndefOr[Middleware | js.Array[Middleware]] = js.native
    
    var workerId: js.UndefOr[String] = js.native
  }
  object ClientConfig {
    
    @scala.inline
    def apply(baseUrl: String): ClientConfig = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfig]
    }
    
    @scala.inline
    implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncResponseTimeout(value: Double): Self = StObject.set(x, "asyncResponseTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncResponseTimeoutUndefined: Self = StObject.set(x, "asyncResponseTimeout", js.undefined)
      
      @scala.inline
      def setAutoPoll(value: Boolean): Self = StObject.set(x, "autoPoll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPollUndefined: Self = StObject.set(x, "autoPoll", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptors(value: Interceptor | js.Array[Interceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptorsFunction1(value: /* config */ js.Any => js.Any): Self = StObject.set(x, "interceptors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      @scala.inline
      def setInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLockDuration(value: Double): Self = StObject.set(x, "lockDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockDurationUndefined: Self = StObject.set(x, "lockDuration", js.undefined)
      
      @scala.inline
      def setMaxParallelExecutions(value: Double): Self = StObject.set(x, "maxParallelExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxParallelExecutionsUndefined: Self = StObject.set(x, "maxParallelExecutions", js.undefined)
      
      @scala.inline
      def setMaxTasks(value: Double): Self = StObject.set(x, "maxTasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTasksUndefined: Self = StObject.set(x, "maxTasks", js.undefined)
      
      @scala.inline
      def setUse(value: Middleware | js.Array[Middleware]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFunction1(value: /* client */ Client => Unit): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      @scala.inline
      def setUseVarargs(value: Middleware*): Self = StObject.set(x, "use", js.Array(value :_*))
      
      @scala.inline
      def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror
  */
  trait ErrorEvent extends StObject
  object ErrorEvent {
    
    @scala.inline
    def completeColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror = "complete:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror]
    
    @scala.inline
    def pollColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror = "poll:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror
  */
  trait ErrorWithTaskEvent extends StObject
  object ErrorWithTaskEvent {
    
    @scala.inline
    def extendLockColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror = "extendLock:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror]
    
    @scala.inline
    def handleBpmnErrorColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror = "handleBpmnError:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror]
    
    @scala.inline
    def handleFailureColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror = "handleFailure:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror]
    
    @scala.inline
    def unlockColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror = "unlock:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror]
  }
  
  @js.native
  trait HandleFailureOptions extends StObject {
    
    var errorDetails: js.UndefOr[String] = js.native
    
    var errorMessage: js.UndefOr[String] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var retryTimeout: js.UndefOr[Double] = js.native
  }
  object HandleFailureOptions {
    
    @scala.inline
    def apply(): HandleFailureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleFailureOptions]
    }
    
    @scala.inline
    implicit class HandleFailureOptionsMutableBuilder[Self <: HandleFailureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
    }
  }
  
  type Handler = js.Function1[/* args */ HandlerArgs, Unit]
  
  @js.native
  trait HandlerArgs extends StObject {
    
    var task: Task = js.native
    
    var taskService: TaskService = js.native
  }
  object HandlerArgs {
    
    @scala.inline
    def apply(task: Task, taskService: TaskService): HandlerArgs = {
      val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], taskService = taskService.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerArgs]
    }
    
    @scala.inline
    implicit class HandlerArgsMutableBuilder[Self <: HandlerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskService(value: TaskService): Self = StObject.set(x, "taskService", value.asInstanceOf[js.Any])
    }
  }
  
  type Interceptor = js.Function1[/* config */ js.Any, js.Any]
  
  type Logger_ = Middleware with Error
  
  type Middleware = js.Function1[/* client */ Client, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop
  */
  trait PollEvent extends StObject
  object PollEvent {
    
    @scala.inline
    def pollColonstart: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart = "poll:start".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart]
    
    @scala.inline
    def pollColonstop: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop = "poll:stop".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop]
  }
  
  @js.native
  trait SubscribeOptions extends StObject {
    
    var businessKey: js.UndefOr[String] = js.native
    
    var lockDuration: js.UndefOr[Double] = js.native
    
    var processDefinitionId: js.UndefOr[String] = js.native
    
    var processDefinitionIdIn: js.UndefOr[String] = js.native
    
    var processDefinitionKey: js.UndefOr[String] = js.native
    
    var processDefinitionKeyIn: js.UndefOr[String] = js.native
    
    var processDefinitionVersionTag: js.UndefOr[String] = js.native
    
    var tenantIdIn: js.UndefOr[js.Array[String]] = js.native
    
    var variables: js.UndefOr[js.Array[_]] = js.native
    
    var withoutTenantId: js.UndefOr[Boolean] = js.native
  }
  object SubscribeOptions {
    
    @scala.inline
    def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    @scala.inline
    implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusinessKey(value: String): Self = StObject.set(x, "businessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusinessKeyUndefined: Self = StObject.set(x, "businessKey", js.undefined)
      
      @scala.inline
      def setLockDuration(value: Double): Self = StObject.set(x, "lockDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockDurationUndefined: Self = StObject.set(x, "lockDuration", js.undefined)
      
      @scala.inline
      def setProcessDefinitionId(value: String): Self = StObject.set(x, "processDefinitionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDefinitionIdIn(value: String): Self = StObject.set(x, "processDefinitionIdIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDefinitionIdInUndefined: Self = StObject.set(x, "processDefinitionIdIn", js.undefined)
      
      @scala.inline
      def setProcessDefinitionIdUndefined: Self = StObject.set(x, "processDefinitionId", js.undefined)
      
      @scala.inline
      def setProcessDefinitionKey(value: String): Self = StObject.set(x, "processDefinitionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDefinitionKeyIn(value: String): Self = StObject.set(x, "processDefinitionKeyIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDefinitionKeyInUndefined: Self = StObject.set(x, "processDefinitionKeyIn", js.undefined)
      
      @scala.inline
      def setProcessDefinitionKeyUndefined: Self = StObject.set(x, "processDefinitionKey", js.undefined)
      
      @scala.inline
      def setProcessDefinitionVersionTag(value: String): Self = StObject.set(x, "processDefinitionVersionTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDefinitionVersionTagUndefined: Self = StObject.set(x, "processDefinitionVersionTag", js.undefined)
      
      @scala.inline
      def setTenantIdIn(value: js.Array[String]): Self = StObject.set(x, "tenantIdIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdInUndefined: Self = StObject.set(x, "tenantIdIn", js.undefined)
      
      @scala.inline
      def setTenantIdInVarargs(value: String*): Self = StObject.set(x, "tenantIdIn", js.Array(value :_*))
      
      @scala.inline
      def setVariables(value: js.Array[_]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      @scala.inline
      def setVariablesVarargs(value: js.Any*): Self = StObject.set(x, "variables", js.Array(value :_*))
      
      @scala.inline
      def setWithoutTenantId(value: Boolean): Self = StObject.set(x, "withoutTenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutTenantIdUndefined: Self = StObject.set(x, "withoutTenantId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonsuccess
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonsuccess
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonsuccess
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonsuccess
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonsuccess
  */
  trait SuccessWithTaskEvent extends StObject
  object SuccessWithTaskEvent {
    
    @scala.inline
    def completeColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonsuccess = "complete:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonsuccess]
    
    @scala.inline
    def extendLockColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonsuccess = "extendLock:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonsuccess]
    
    @scala.inline
    def handleBpmnErrorColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonsuccess = "handleBpmnError:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonsuccess]
    
    @scala.inline
    def handleFailureColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonsuccess = "handleFailure:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonsuccess]
    
    @scala.inline
    def unlockColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonsuccess = "unlock:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonsuccess]
  }
  
  type SuccessWithTasksEvent = pollColonsuccess
  
  @js.native
  trait Task extends StObject {
    
    // These are not guaranteed by package documentation, but are returned according to REST API docs
    var activityId: js.UndefOr[String] = js.native
    
    var activityInstanceId: js.UndefOr[String] = js.native
    
    var businessKey: js.UndefOr[String] = js.native
    
    var errorDetails: js.UndefOr[String] = js.native
    
    var errorMessage: js.UndefOr[String] = js.native
    
    var executionId: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var lockExpirationTime: js.UndefOr[String] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var processDefinitionId: js.UndefOr[String] = js.native
    
    var processDefinitionKey: js.UndefOr[String] = js.native
    
    var processInstanceId: js.UndefOr[String] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var tenantId: js.UndefOr[String] = js.native
    
    var topicName: js.UndefOr[String] = js.native
    
    var variables: Variables = js.native
    
    var workerId: js.UndefOr[String] = js.native
  }
  object Task {
    
    @scala.inline
    def apply(variables: Variables): Task = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityIdUndefined: Self = StObject.set(x, "activityId", js.undefined)
      
      @scala.inline
      def setActivityInstanceId(value: String): Self = StObject.set(x, "activityInstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityInstanceIdUndefined: Self = StObject.set(x, "activityInstanceId", js.undefined)
      
      @scala.inline
      def setBusinessKey(value: String): Self = StObject.set(x, "businessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusinessKeyUndefined: Self = StObject.set(x, "businessKey", js.undefined)
      
      @scala.inline
      def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLockExpirationTime(value: String): Self = StObject.set(x, "lockExpirationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockExpirationTimeUndefined: Self = StObject.set(x, "lockExpirationTime", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setProcessDefinitionId(value: String): Self = StObject.set(x, "processDefinitionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDefinitionIdUndefined: Self = StObject.set(x, "processDefinitionId", js.undefined)
      
      @scala.inline
      def setProcessDefinitionKey(value: String): Self = StObject.set(x, "processDefinitionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDefinitionKeyUndefined: Self = StObject.set(x, "processDefinitionKey", js.undefined)
      
      @scala.inline
      def setProcessInstanceId(value: String): Self = StObject.set(x, "processInstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessInstanceIdUndefined: Self = StObject.set(x, "processInstanceId", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      
      @scala.inline
      def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
    }
  }
  
  @js.native
  trait TaskService extends StObject {
    
    def complete(task: Task): js.Promise[Unit] = js.native
    def complete(task: Task, processVariables: js.UndefOr[scala.Nothing], localVariables: Variables): js.Promise[Unit] = js.native
    def complete(task: Task, processVariables: Variables): js.Promise[Unit] = js.native
    def complete(task: Task, processVariables: Variables, localVariables: Variables): js.Promise[Unit] = js.native
    
    def extendLock(task: Task, newDuration: Double): js.Promise[Unit] = js.native
    
    def handleBpmnError(task: Task, errorCode: String): js.Promise[Unit] = js.native
    def handleBpmnError(task: Task, errorCode: String, errorMessage: js.UndefOr[scala.Nothing], variables: Variables): js.Promise[Unit] = js.native
    def handleBpmnError(task: Task, errorCode: String, errorMessage: String): js.Promise[Unit] = js.native
    def handleBpmnError(task: Task, errorCode: String, errorMessage: String, variables: Variables): js.Promise[Unit] = js.native
    
    def handleFailure(task: Task): js.Promise[Unit] = js.native
    def handleFailure(task: Task, options: HandleFailureOptions): js.Promise[Unit] = js.native
    
    def unlock(task: Task): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe
  */
  trait TopicEvent extends StObject
  object TopicEvent {
    
    @scala.inline
    def subscribe: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe = "subscribe".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe]
    
    @scala.inline
    def unsubscribe: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe = "unsubscribe".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe]
  }
  
  @js.native
  trait TopicSubscription extends StObject {
    
    def unsubscribe(): Unit = js.native
  }
  object TopicSubscription {
    
    @scala.inline
    def apply(unsubscribe: () => Unit): TopicSubscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[TopicSubscription]
    }
    
    @scala.inline
    implicit class TopicSubscriptionMutableBuilder[Self <: TopicSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypedValue extends StObject {
    
    var `type`: String = js.native
    
    var value: Value = js.native
    
    var valueInfo: js.Object = js.native
  }
  object TypedValue {
    
    @scala.inline
    def apply(`type`: String, value: Value, valueInfo: js.Object): TypedValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueInfo = valueInfo.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedValue]
    }
    
    @scala.inline
    implicit class TypedValueMutableBuilder[Self <: TypedValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueInfo(value: js.Object): Self = StObject.set(x, "valueInfo", value.asInstanceOf[js.Any])
    }
  }
  
  type TypedValueMap = StringDictionary[TypedValue]
  
  type Value = js.Any
  
  type ValueMap = StringDictionary[Value]
}
