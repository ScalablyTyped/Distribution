package typings.camundaExternalTaskClientJs

import org.scalablytyped.runtime.StringDictionary
import typings.camundaExternalTaskClientJs.anon.Authorization
import typings.camundaExternalTaskClientJs.anon.Password
import typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonsuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camunda-external-task-client-js", "BasicAuthInterceptor")
  @js.native
  open class BasicAuthInterceptor protected () extends StObject {
    def this(options: BasicAuthInterceptorConfig) = this()
    
    def getHeader(param0: Password): Authorization = js.native
    
    def interceptor(config: Any): Any = js.native
  }
  
  @JSImport("camunda-external-task-client-js", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(config: ClientConfig) = this()
    
    def on(name: ErrorEvent, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    def on(name: ErrorWithTaskEvent, callback: js.Function2[/* task */ Task, /* error */ Any, Unit]): Unit = js.native
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
  open class Variables () extends StObject {
    
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
  
  trait BasicAuthInterceptorConfig extends StObject {
    
    var password: String
    
    var username: String
  }
  object BasicAuthInterceptorConfig {
    
    inline def apply(password: String, username: String): BasicAuthInterceptorConfig = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicAuthInterceptorConfig]
    }
    
    extension [Self <: BasicAuthInterceptorConfig](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientConfig extends StObject {
    
    var asyncResponseTimeout: js.UndefOr[Double] = js.undefined
    
    var autoPoll: js.UndefOr[Boolean] = js.undefined
    
    var baseUrl: String
    
    var interceptors: js.UndefOr[
        Interceptor | (js.Array[BasicAuthInterceptor | Interceptor]) | BasicAuthInterceptor | Null
      ] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var lockDuration: js.UndefOr[Double] = js.undefined
    
    var maxParallelExecutions: js.UndefOr[Double] = js.undefined
    
    var maxTasks: js.UndefOr[Double] = js.undefined
    
    var use: js.UndefOr[Middleware | js.Array[Middleware]] = js.undefined
    
    var workerId: js.UndefOr[String] = js.undefined
  }
  object ClientConfig {
    
    inline def apply(baseUrl: String): ClientConfig = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfig]
    }
    
    extension [Self <: ClientConfig](x: Self) {
      
      inline def setAsyncResponseTimeout(value: Double): Self = StObject.set(x, "asyncResponseTimeout", value.asInstanceOf[js.Any])
      
      inline def setAsyncResponseTimeoutUndefined: Self = StObject.set(x, "asyncResponseTimeout", js.undefined)
      
      inline def setAutoPoll(value: Boolean): Self = StObject.set(x, "autoPoll", value.asInstanceOf[js.Any])
      
      inline def setAutoPollUndefined: Self = StObject.set(x, "autoPoll", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setInterceptors(value: Interceptor | (js.Array[BasicAuthInterceptor | Interceptor]) | BasicAuthInterceptor): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      inline def setInterceptorsFunction1(value: /* config */ Any => Any): Self = StObject.set(x, "interceptors", js.Any.fromFunction1(value))
      
      inline def setInterceptorsNull: Self = StObject.set(x, "interceptors", null)
      
      inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      inline def setInterceptorsVarargs(value: (BasicAuthInterceptor | Interceptor)*): Self = StObject.set(x, "interceptors", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLockDuration(value: Double): Self = StObject.set(x, "lockDuration", value.asInstanceOf[js.Any])
      
      inline def setLockDurationUndefined: Self = StObject.set(x, "lockDuration", js.undefined)
      
      inline def setMaxParallelExecutions(value: Double): Self = StObject.set(x, "maxParallelExecutions", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelExecutionsUndefined: Self = StObject.set(x, "maxParallelExecutions", js.undefined)
      
      inline def setMaxTasks(value: Double): Self = StObject.set(x, "maxTasks", value.asInstanceOf[js.Any])
      
      inline def setMaxTasksUndefined: Self = StObject.set(x, "maxTasks", js.undefined)
      
      inline def setUse(value: Middleware | js.Array[Middleware]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseFunction1(value: /* client */ Client => Unit): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      inline def setUseVarargs(value: Middleware*): Self = StObject.set(x, "use", js.Array(value*))
      
      inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
      
      inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror
  */
  trait ErrorEvent extends StObject
  object ErrorEvent {
    
    inline def completeColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror = "complete:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror]
    
    inline def pollColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror = "poll:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror
  */
  trait ErrorWithTaskEvent extends StObject
  object ErrorWithTaskEvent {
    
    inline def extendLockColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror = "extendLock:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror]
    
    inline def handleBpmnErrorColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror = "handleBpmnError:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror]
    
    inline def handleFailureColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror = "handleFailure:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror]
    
    inline def unlockColonerror: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror = "unlock:error".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror]
  }
  
  trait HandleFailureOptions extends StObject {
    
    var errorDetails: js.UndefOr[String] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retryTimeout: js.UndefOr[Double] = js.undefined
  }
  object HandleFailureOptions {
    
    inline def apply(): HandleFailureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleFailureOptions]
    }
    
    extension [Self <: HandleFailureOptions](x: Self) {
      
      inline def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
      
      inline def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
    }
  }
  
  type Handler = js.Function1[/* args */ HandlerArgs, Unit]
  
  trait HandlerArgs extends StObject {
    
    var task: Task
    
    var taskService: TaskService
  }
  object HandlerArgs {
    
    inline def apply(task: Task, taskService: TaskService): HandlerArgs = {
      val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], taskService = taskService.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerArgs]
    }
    
    extension [Self <: HandlerArgs](x: Self) {
      
      inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTaskService(value: TaskService): Self = StObject.set(x, "taskService", value.asInstanceOf[js.Any])
    }
  }
  
  type Interceptor = js.Function1[/* config */ Any, Any]
  
  @js.native
  trait Logger_ extends Middleware {
    
    def error(text: String): Unit = js.native
    
    def success(text: String): Unit = js.native
  }
  
  type Middleware = js.Function1[/* client */ Client, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart
    - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop
  */
  trait PollEvent extends StObject
  object PollEvent {
    
    inline def pollColonstart: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart = "poll:start".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart]
    
    inline def pollColonstop: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop = "poll:stop".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop]
  }
  
  trait SubscribeOptions extends StObject {
    
    var businessKey: js.UndefOr[String] = js.undefined
    
    var lockDuration: js.UndefOr[Double] = js.undefined
    
    var processDefinitionId: js.UndefOr[String] = js.undefined
    
    var processDefinitionIdIn: js.UndefOr[String] = js.undefined
    
    var processDefinitionKey: js.UndefOr[String] = js.undefined
    
    var processDefinitionKeyIn: js.UndefOr[String] = js.undefined
    
    var processDefinitionVersionTag: js.UndefOr[String] = js.undefined
    
    var tenantIdIn: js.UndefOr[js.Array[String]] = js.undefined
    
    var variables: js.UndefOr[js.Array[Any]] = js.undefined
    
    var withoutTenantId: js.UndefOr[Boolean] = js.undefined
  }
  object SubscribeOptions {
    
    inline def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    extension [Self <: SubscribeOptions](x: Self) {
      
      inline def setBusinessKey(value: String): Self = StObject.set(x, "businessKey", value.asInstanceOf[js.Any])
      
      inline def setBusinessKeyUndefined: Self = StObject.set(x, "businessKey", js.undefined)
      
      inline def setLockDuration(value: Double): Self = StObject.set(x, "lockDuration", value.asInstanceOf[js.Any])
      
      inline def setLockDurationUndefined: Self = StObject.set(x, "lockDuration", js.undefined)
      
      inline def setProcessDefinitionId(value: String): Self = StObject.set(x, "processDefinitionId", value.asInstanceOf[js.Any])
      
      inline def setProcessDefinitionIdIn(value: String): Self = StObject.set(x, "processDefinitionIdIn", value.asInstanceOf[js.Any])
      
      inline def setProcessDefinitionIdInUndefined: Self = StObject.set(x, "processDefinitionIdIn", js.undefined)
      
      inline def setProcessDefinitionIdUndefined: Self = StObject.set(x, "processDefinitionId", js.undefined)
      
      inline def setProcessDefinitionKey(value: String): Self = StObject.set(x, "processDefinitionKey", value.asInstanceOf[js.Any])
      
      inline def setProcessDefinitionKeyIn(value: String): Self = StObject.set(x, "processDefinitionKeyIn", value.asInstanceOf[js.Any])
      
      inline def setProcessDefinitionKeyInUndefined: Self = StObject.set(x, "processDefinitionKeyIn", js.undefined)
      
      inline def setProcessDefinitionKeyUndefined: Self = StObject.set(x, "processDefinitionKey", js.undefined)
      
      inline def setProcessDefinitionVersionTag(value: String): Self = StObject.set(x, "processDefinitionVersionTag", value.asInstanceOf[js.Any])
      
      inline def setProcessDefinitionVersionTagUndefined: Self = StObject.set(x, "processDefinitionVersionTag", js.undefined)
      
      inline def setTenantIdIn(value: js.Array[String]): Self = StObject.set(x, "tenantIdIn", value.asInstanceOf[js.Any])
      
      inline def setTenantIdInUndefined: Self = StObject.set(x, "tenantIdIn", js.undefined)
      
      inline def setTenantIdInVarargs(value: String*): Self = StObject.set(x, "tenantIdIn", js.Array(value*))
      
      inline def setVariables(value: js.Array[Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      inline def setVariablesVarargs(value: Any*): Self = StObject.set(x, "variables", js.Array(value*))
      
      inline def setWithoutTenantId(value: Boolean): Self = StObject.set(x, "withoutTenantId", value.asInstanceOf[js.Any])
      
      inline def setWithoutTenantIdUndefined: Self = StObject.set(x, "withoutTenantId", js.undefined)
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
    
    inline def completeColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonsuccess = "complete:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonsuccess]
    
    inline def extendLockColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonsuccess = "extendLock:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonsuccess]
    
    inline def handleBpmnErrorColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonsuccess = "handleBpmnError:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonsuccess]
    
    inline def handleFailureColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonsuccess = "handleFailure:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonsuccess]
    
    inline def unlockColonsuccess: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonsuccess = "unlock:success".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonsuccess]
  }
  
  type SuccessWithTasksEvent = pollColonsuccess
  
  trait Task extends StObject {
    
    // These are not guaranteed by package documentation, but are returned according to REST API docs
    var activityId: js.UndefOr[String] = js.undefined
    
    var activityInstanceId: js.UndefOr[String] = js.undefined
    
    var businessKey: js.UndefOr[String] = js.undefined
    
    var errorDetails: js.UndefOr[String] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var executionId: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var lockExpirationTime: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var processDefinitionId: js.UndefOr[String] = js.undefined
    
    var processDefinitionKey: js.UndefOr[String] = js.undefined
    
    var processInstanceId: js.UndefOr[String] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var topicName: js.UndefOr[String] = js.undefined
    
    var variables: Variables
    
    var workerId: js.UndefOr[String] = js.undefined
  }
  object Task {
    
    inline def apply(variables: Variables): Task = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      inline def setActivityIdUndefined: Self = StObject.set(x, "activityId", js.undefined)
      
      inline def setActivityInstanceId(value: String): Self = StObject.set(x, "activityInstanceId", value.asInstanceOf[js.Any])
      
      inline def setActivityInstanceIdUndefined: Self = StObject.set(x, "activityInstanceId", js.undefined)
      
      inline def setBusinessKey(value: String): Self = StObject.set(x, "businessKey", value.asInstanceOf[js.Any])
      
      inline def setBusinessKeyUndefined: Self = StObject.set(x, "businessKey", js.undefined)
      
      inline def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
      
      inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLockExpirationTime(value: String): Self = StObject.set(x, "lockExpirationTime", value.asInstanceOf[js.Any])
      
      inline def setLockExpirationTimeUndefined: Self = StObject.set(x, "lockExpirationTime", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProcessDefinitionId(value: String): Self = StObject.set(x, "processDefinitionId", value.asInstanceOf[js.Any])
      
      inline def setProcessDefinitionIdUndefined: Self = StObject.set(x, "processDefinitionId", js.undefined)
      
      inline def setProcessDefinitionKey(value: String): Self = StObject.set(x, "processDefinitionKey", value.asInstanceOf[js.Any])
      
      inline def setProcessDefinitionKeyUndefined: Self = StObject.set(x, "processDefinitionKey", js.undefined)
      
      inline def setProcessInstanceId(value: String): Self = StObject.set(x, "processInstanceId", value.asInstanceOf[js.Any])
      
      inline def setProcessInstanceIdUndefined: Self = StObject.set(x, "processInstanceId", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
      
      inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      
      inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
      
      inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
    }
  }
  
  @js.native
  trait TaskService extends StObject {
    
    def complete(task: Task): js.Promise[Unit] = js.native
    def complete(task: Task, processVariables: Unit, localVariables: Variables): js.Promise[Unit] = js.native
    def complete(task: Task, processVariables: Variables): js.Promise[Unit] = js.native
    def complete(task: Task, processVariables: Variables, localVariables: Variables): js.Promise[Unit] = js.native
    
    def extendLock(task: Task, newDuration: Double): js.Promise[Unit] = js.native
    
    def handleBpmnError(task: Task, errorCode: String): js.Promise[Unit] = js.native
    def handleBpmnError(task: Task, errorCode: String, errorMessage: String): js.Promise[Unit] = js.native
    def handleBpmnError(task: Task, errorCode: String, errorMessage: String, variables: Variables): js.Promise[Unit] = js.native
    def handleBpmnError(task: Task, errorCode: String, errorMessage: Unit, variables: Variables): js.Promise[Unit] = js.native
    
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
    
    inline def subscribe: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe = "subscribe".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe]
    
    inline def unsubscribe: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe = "unsubscribe".asInstanceOf[typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe]
  }
  
  trait TopicSubscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object TopicSubscription {
    
    inline def apply(unsubscribe: () => Unit): TopicSubscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[TopicSubscription]
    }
    
    extension [Self <: TopicSubscription](x: Self) {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait TypedValue extends StObject {
    
    var `type`: String
    
    var value: Value
    
    var valueInfo: js.Object
  }
  object TypedValue {
    
    inline def apply(`type`: String, value: Value, valueInfo: js.Object): TypedValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueInfo = valueInfo.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedValue]
    }
    
    extension [Self <: TypedValue](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueInfo(value: js.Object): Self = StObject.set(x, "valueInfo", value.asInstanceOf[js.Any])
    }
  }
  
  type TypedValueMap = StringDictionary[TypedValue]
  
  type Value = Any
  
  type ValueMap = StringDictionary[Value]
}
