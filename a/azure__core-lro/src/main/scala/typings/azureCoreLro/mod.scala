package typings.azureCoreLro

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreLro.anon.AbortSignal
import typings.azureCoreLro.anon.FireProgress
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-lro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-lro", "LroEngine")
  @js.native
  open class LroEngine[TResult, TState /* <: PollOperationState[TResult] */] protected () extends Poller[TState, TResult] {
    def this(lro: LongRunningOperation[TResult]) = this()
    def this(lro: LongRunningOperation[TResult], options: LroEngineOptions[TResult, TState]) = this()
    
    /* private */ var config: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("@azure/core-lro", "Poller")
  @js.native
  open class Poller[TState /* <: PollOperationState[TResult] */, TResult] protected ()
    extends StObject
       with PollerLike[TState, TResult] {
    /**
      * A poller needs to be initialized by passing in at least the basic properties of the `PollOperation<TState, TResult>`.
      *
      * When writing an implementation of a Poller, this implementation needs to deal with the initialization
      * of any custom state beyond the basic definition of the poller. The basic poller assumes that the poller's
      * operation has already been defined, at least its basic properties. The code below shows how to approach
      * the definition of the constructor of a new custom poller.
      *
      * ```ts
      * export class MyPoller extends Poller<MyOperationState, string> {
      *   constructor({
      *     // Anything you might need outside of the basics
      *   }) {
      *     let state: MyOperationState = {
      *       privateProperty: private,
      *       publicProperty: public,
      *     };
      *
      *     const operation = {
      *       state,
      *       update,
      *       cancel,
      *       toString
      *     }
      *
      *     // Sending the operation to the parent's constructor.
      *     super(operation);
      *
      *     // You can assign more local properties here.
      *   }
      * }
      * ```
      *
      * Inside of this constructor, a new promise is created. This will be used to
      * tell the user when the poller finishes (see `pollUntilDone()`). The promise's
      * resolve and reject methods are also used internally to control when to resolve
      * or reject anyone waiting for the poller to finish.
      *
      * The constructor of a custom implementation of a poller is where any serialized version of
      * a previous poller's operation should be deserialized into the operation sent to the
      * base constructor. For example:
      *
      * ```ts
      * export class MyPoller extends Poller<MyOperationState, string> {
      *   constructor(
      *     baseOperation: string | undefined
      *   ) {
      *     let state: MyOperationState = {};
      *     if (baseOperation) {
      *       state = {
      *         ...JSON.parse(baseOperation).state,
      *         ...state
      *       };
      *     }
      *     const operation = {
      *       state,
      *       // ...
      *     }
      *     super(operation);
      *   }
      * }
      * ```
      *
      * @param operation - Must contain the basic properties of `PollOperation<State, TResult>`.
      */
    def this(operation: PollOperation[TState, TResult]) = this()
    
    /**
      * Invokes the underlying operation's cancel method.
      */
    /* private */ var cancelOnce: Any = js.native
    
    /* private */ var cancelPromise: Any = js.native
    
    /**
      * Defines how much to wait between each poll request.
      * This has to be implemented by your custom poller.
      *
      * \@azure/core-util has a simple implementation of a delay function that waits as many milliseconds as specified.
      * This can be used as follows:
      *
      * ```ts
      * import { delay } from "@azure/core-util";
      *
      * export class MyPoller extends Poller<MyOperationState, string> {
      *   // The other necessary definitions.
      *
      *   async delay(): Promise<void> {
      *     const milliseconds = 1000;
      *     return delay(milliseconds);
      *   }
      * }
      * ```
      *
      */
    /* protected */ def delay(): js.Promise[Unit] = js.native
    
    /**
      * fireProgress calls the functions passed in via onProgress the method of the poller.
      *
      * It loops over all of the callbacks received from onProgress, and executes them, sending them
      * the current operation state.
      *
      * @param state - The current operation state.
      */
    /* private */ var fireProgress: Any = js.native
    
    /**
      * The poller's operation is available in full to any of the methods of the Poller class
      * and any class extending the Poller class.
      */
    /* protected */ var operation: PollOperation[TState, TResult] = js.native
    
    /**
      * pollOnce does one polling, by calling to the update method of the underlying
      * poll operation to make any relevant change effective.
      *
      * It only optionally receives an object with an abortSignal property, from \@azure/abort-controller's AbortSignalLike.
      *
      * @param options - Optional properties passed to the operation's update method.
      */
    /* private */ var pollOnce: Any = js.native
    
    /* private */ var pollOncePromise: Any = js.native
    
    /* private */ var pollProgressCallbacks: Any = js.native
    
    /* private */ var processUpdatedState: Any = js.native
    
    /* private */ var promise: Any = js.native
    
    /* private */ var reject: Any = js.native
    
    /* private */ var resolve: Any = js.native
    
    /**
      * Starts a loop that will break only if the poller is done
      * or if the poller is stopped.
      */
    /* private */ var startPolling: Any = js.native
    
    /* private */ var stopped: Any = js.native
  }
  
  @JSImport("@azure/core-lro", "PollerCancelledError")
  @js.native
  open class PollerCancelledError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@azure/core-lro", "PollerStoppedError")
  @js.native
  open class PollerStoppedError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def createHttpPoller[TResult, TState /* <: OperationState[TResult] */](lro: LongRunningOperation[Any]): js.Promise[SimplePollerLike[TState, TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpPoller")(lro.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SimplePollerLike[TState, TResult]]]
  inline def createHttpPoller[TResult, TState /* <: OperationState[TResult] */](lro: LongRunningOperation[Any], options: CreateHttpPollerOptions[TResult, TState]): js.Promise[SimplePollerLike[TState, TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpPoller")(lro.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SimplePollerLike[TState, TResult]]]
  
  type CancelOnProgress = js.Function0[Unit]
  
  trait CreateHttpPollerOptions[TResult, TState] extends StObject {
    
    /**
      * Defines how much time the poller is going to wait before making a new request to the service.
      */
    var intervalInMs: js.UndefOr[Double] = js.undefined
    
    /**
      * A function to process the result of the LRO.
      */
    var processResult: js.UndefOr[js.Function2[/* result */ Any, /* state */ TState, TResult]] = js.undefined
    
    /**
      * The potential location of the result of the LRO if specified by the LRO extension in the swagger.
      */
    var resourceLocationConfig: js.UndefOr[LroResourceLocationConfig] = js.undefined
    
    /**
      * A serialized poller which can be used to resume an existing paused Long-Running-Operation.
      */
    var restoreFrom: js.UndefOr[String] = js.undefined
    
    /**
      * A function to process the state of the LRO.
      */
    var updateState: js.UndefOr[js.Function2[/* state */ TState, /* response */ LroResponse[Any], Unit]] = js.undefined
    
    /**
      * A function to be called each time the operation location is updated by the
      * service.
      */
    var withOperationLocation: js.UndefOr[js.Function1[/* operationLocation */ String, Unit]] = js.undefined
  }
  object CreateHttpPollerOptions {
    
    inline def apply[TResult, TState](): CreateHttpPollerOptions[TResult, TState] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateHttpPollerOptions[TResult, TState]]
    }
    
    extension [Self <: CreateHttpPollerOptions[?, ?], TResult, TState](x: Self & (CreateHttpPollerOptions[TResult, TState])) {
      
      inline def setIntervalInMs(value: Double): Self = StObject.set(x, "intervalInMs", value.asInstanceOf[js.Any])
      
      inline def setIntervalInMsUndefined: Self = StObject.set(x, "intervalInMs", js.undefined)
      
      inline def setProcessResult(value: (/* result */ Any, /* state */ TState) => TResult): Self = StObject.set(x, "processResult", js.Any.fromFunction2(value))
      
      inline def setProcessResultUndefined: Self = StObject.set(x, "processResult", js.undefined)
      
      inline def setResourceLocationConfig(value: LroResourceLocationConfig): Self = StObject.set(x, "resourceLocationConfig", value.asInstanceOf[js.Any])
      
      inline def setResourceLocationConfigUndefined: Self = StObject.set(x, "resourceLocationConfig", js.undefined)
      
      inline def setRestoreFrom(value: String): Self = StObject.set(x, "restoreFrom", value.asInstanceOf[js.Any])
      
      inline def setRestoreFromUndefined: Self = StObject.set(x, "restoreFrom", js.undefined)
      
      inline def setUpdateState(value: (/* state */ TState, /* response */ LroResponse[Any]) => Unit): Self = StObject.set(x, "updateState", js.Any.fromFunction2(value))
      
      inline def setUpdateStateUndefined: Self = StObject.set(x, "updateState", js.undefined)
      
      inline def setWithOperationLocation(value: /* operationLocation */ String => Unit): Self = StObject.set(x, "withOperationLocation", js.Any.fromFunction1(value))
      
      inline def setWithOperationLocationUndefined: Self = StObject.set(x, "withOperationLocation", js.undefined)
    }
  }
  
  @js.native
  trait LongRunningOperation[T] extends StObject {
    
    /**
      * The HTTP request method. This should be set if the operation is a PUT or a
      * DELETE.
      */
    var requestMethod: js.UndefOr[String] = js.native
    
    /**
      * The request path. This should be set if the operation is a PUT and needs
      * to poll from the same request path.
      */
    var requestPath: js.UndefOr[String] = js.native
    
    /**
      * A function that can be used to send initial request to the service.
      */
    def sendInitialRequest(): js.Promise[LroResponse[Any]] = js.native
    
    /**
      * A function that can be used to poll for the current status of a long running operation.
      */
    def sendPollRequest(path: String): js.Promise[LroResponse[T]] = js.native
    def sendPollRequest(path: String, options: AbortSignal): js.Promise[LroResponse[T]] = js.native
  }
  
  trait LroEngineOptions[TResult, TState] extends StObject {
    
    /**
      * Defines how much time the poller is going to wait before making a new request to the service.
      */
    var intervalInMs: js.UndefOr[Double] = js.undefined
    
    /**
      * A predicate to determine whether the LRO finished processing.
      */
    var isDone: js.UndefOr[js.Function2[/* lastResponse */ Any, /* state */ TState, Boolean]] = js.undefined
    
    /**
      * The potential location of the result of the LRO if specified by the LRO extension in the swagger.
      */
    var lroResourceLocationConfig: js.UndefOr[LroResourceLocationConfig] = js.undefined
    
    /**
      * A function to process the result of the LRO.
      */
    var processResult: js.UndefOr[js.Function2[/* result */ Any, /* state */ TState, TResult]] = js.undefined
    
    /**
      * A serialized poller which can be used to resume an existing paused Long-Running-Operation.
      */
    var resumeFrom: js.UndefOr[String] = js.undefined
    
    /**
      * A function to process the state of the LRO.
      */
    var updateState: js.UndefOr[js.Function2[/* state */ TState, /* lastResponse */ RawResponse, Unit]] = js.undefined
  }
  object LroEngineOptions {
    
    inline def apply[TResult, TState](): LroEngineOptions[TResult, TState] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LroEngineOptions[TResult, TState]]
    }
    
    extension [Self <: LroEngineOptions[?, ?], TResult, TState](x: Self & (LroEngineOptions[TResult, TState])) {
      
      inline def setIntervalInMs(value: Double): Self = StObject.set(x, "intervalInMs", value.asInstanceOf[js.Any])
      
      inline def setIntervalInMsUndefined: Self = StObject.set(x, "intervalInMs", js.undefined)
      
      inline def setIsDone(value: (/* lastResponse */ Any, /* state */ TState) => Boolean): Self = StObject.set(x, "isDone", js.Any.fromFunction2(value))
      
      inline def setIsDoneUndefined: Self = StObject.set(x, "isDone", js.undefined)
      
      inline def setLroResourceLocationConfig(value: LroResourceLocationConfig): Self = StObject.set(x, "lroResourceLocationConfig", value.asInstanceOf[js.Any])
      
      inline def setLroResourceLocationConfigUndefined: Self = StObject.set(x, "lroResourceLocationConfig", js.undefined)
      
      inline def setProcessResult(value: (/* result */ Any, /* state */ TState) => TResult): Self = StObject.set(x, "processResult", js.Any.fromFunction2(value))
      
      inline def setProcessResultUndefined: Self = StObject.set(x, "processResult", js.undefined)
      
      inline def setResumeFrom(value: String): Self = StObject.set(x, "resumeFrom", value.asInstanceOf[js.Any])
      
      inline def setResumeFromUndefined: Self = StObject.set(x, "resumeFrom", js.undefined)
      
      inline def setUpdateState(value: (/* state */ TState, /* lastResponse */ RawResponse) => Unit): Self = StObject.set(x, "updateState", js.Any.fromFunction2(value))
      
      inline def setUpdateStateUndefined: Self = StObject.set(x, "updateState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureCoreLro.azureCoreLroStrings.`azure-async-operation`
    - typings.azureCoreLro.azureCoreLroStrings.location
    - typings.azureCoreLro.azureCoreLroStrings.`original-uri`
  */
  trait LroResourceLocationConfig extends StObject
  object LroResourceLocationConfig {
    
    inline def `azure-async-operation`: typings.azureCoreLro.azureCoreLroStrings.`azure-async-operation` = "azure-async-operation".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.`azure-async-operation`]
    
    inline def location: typings.azureCoreLro.azureCoreLroStrings.location = "location".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.location]
    
    inline def `original-uri`: typings.azureCoreLro.azureCoreLroStrings.`original-uri` = "original-uri".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.`original-uri`]
  }
  
  trait LroResponse[T] extends StObject {
    
    /** The flattened response */
    var flatResponse: T
    
    /** The raw response */
    var rawResponse: RawResponse
  }
  object LroResponse {
    
    inline def apply[T](flatResponse: T, rawResponse: RawResponse): LroResponse[T] = {
      val __obj = js.Dynamic.literal(flatResponse = flatResponse.asInstanceOf[js.Any], rawResponse = rawResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[LroResponse[T]]
    }
    
    extension [Self <: LroResponse[?], T](x: Self & LroResponse[T]) {
      
      inline def setFlatResponse(value: T): Self = StObject.set(x, "flatResponse", value.asInstanceOf[js.Any])
      
      inline def setRawResponse(value: RawResponse): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
    }
  }
  
  trait OperationState[TResult] extends StObject {
    
    /**
      * Will exist if the operation encountered any error.
      */
    var error: js.UndefOr[js.Error] = js.undefined
    
    /**
      * Will exist if the operation produced a result of the expected type.
      */
    var result: js.UndefOr[TResult] = js.undefined
    
    /**
      * The current status of the operation.
      */
    var status: OperationStatus
  }
  object OperationState {
    
    inline def apply[TResult](status: OperationStatus): OperationState[TResult] = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationState[TResult]]
    }
    
    extension [Self <: OperationState[?], TResult](x: Self & OperationState[TResult]) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: TResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setStatus(value: OperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureCoreLro.azureCoreLroStrings.notStarted
    - typings.azureCoreLro.azureCoreLroStrings.running
    - typings.azureCoreLro.azureCoreLroStrings.succeeded
    - typings.azureCoreLro.azureCoreLroStrings.canceled
    - typings.azureCoreLro.azureCoreLroStrings.failed
  */
  trait OperationStatus extends StObject
  object OperationStatus {
    
    inline def canceled: typings.azureCoreLro.azureCoreLroStrings.canceled = "canceled".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.canceled]
    
    inline def failed: typings.azureCoreLro.azureCoreLroStrings.failed = "failed".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.failed]
    
    inline def notStarted: typings.azureCoreLro.azureCoreLroStrings.notStarted = "notStarted".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.notStarted]
    
    inline def running: typings.azureCoreLro.azureCoreLroStrings.running = "running".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.running]
    
    inline def succeeded: typings.azureCoreLro.azureCoreLroStrings.succeeded = "succeeded".asInstanceOf[typings.azureCoreLro.azureCoreLroStrings.succeeded]
  }
  
  @js.native
  trait PollOperation[TState, TResult] extends StObject {
    
    /**
      * Attempts to cancel the underlying operation.
      *
      * It only optionally receives an object with an abortSignal property, from \@azure/abort-controller's AbortSignalLike.
      *
      * It returns a promise that should be resolved with an updated version of the poller's operation.
      *
      * @param options - Optional properties passed to the operation's update method.
      *
      * @deprecated `cancel` has been deprecated because it was not implemented.
      */
    def cancel(): js.Promise[PollOperation[TState, TResult]] = js.native
    def cancel(options: AbortSignal): js.Promise[PollOperation[TState, TResult]] = js.native
    
    /**
      * The state of the operation.
      * It will be used to store the basic properties of PollOperationState<TResult>,
      * plus any custom property that the implementation may require.
      */
    var state: TState = js.native
    
    /**
      * Defines how to request the remote service for updates on the status of the long running operation.
      *
      * It optionally receives an object with an abortSignal property, from \@azure/abort-controller's AbortSignalLike.
      * Also optionally receives a "fireProgress" function, which, if called, is responsible for triggering the
      * poller's onProgress callbacks.
      *
      * @param options - Optional properties passed to the operation's update method.
      */
    def update(): js.Promise[PollOperation[TState, TResult]] = js.native
    def update(options: FireProgress[TState]): js.Promise[PollOperation[TState, TResult]] = js.native
  }
  
  trait PollOperationState[TResult] extends StObject {
    
    /**
      * Will exist if the operation encountered any error.
      */
    var error: js.UndefOr[js.Error] = js.undefined
    
    /**
      * True if the operation has been cancelled.
      */
    var isCancelled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True if the operation has been completed.
      */
    var isCompleted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True if the operation has started.
      */
    var isStarted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will exist if the operation concluded in a result of an expected type.
      */
    var result: js.UndefOr[TResult] = js.undefined
  }
  object PollOperationState {
    
    inline def apply[TResult](): PollOperationState[TResult] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollOperationState[TResult]]
    }
    
    extension [Self <: PollOperationState[?], TResult](x: Self & PollOperationState[TResult]) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsCancelled(value: Boolean): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
      
      inline def setIsCancelledUndefined: Self = StObject.set(x, "isCancelled", js.undefined)
      
      inline def setIsCompleted(value: Boolean): Self = StObject.set(x, "isCompleted", value.asInstanceOf[js.Any])
      
      inline def setIsCompletedUndefined: Self = StObject.set(x, "isCompleted", js.undefined)
      
      inline def setIsStarted(value: Boolean): Self = StObject.set(x, "isStarted", value.asInstanceOf[js.Any])
      
      inline def setIsStartedUndefined: Self = StObject.set(x, "isStarted", js.undefined)
      
      inline def setResult(value: TResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  type PollProgressCallback[TState] = js.Function1[/* state */ TState, Unit]
  
  @js.native
  trait PollerLike[TState /* <: PollOperationState[TResult] */, TResult] extends StObject {
    
    /**
      * Attempts to cancel the underlying operation.
      * @deprecated `cancelOperation` has been deprecated because it was not implemented.
      */
    def cancelOperation(): js.Promise[Unit] = js.native
    def cancelOperation(options: AbortSignal): js.Promise[Unit] = js.native
    
    /**
      * Returns the state of the operation.
      * The TState defined in PollerLike can be a subset of the TState defined in
      * the Poller implementation.
      */
    def getOperationState(): TState = js.native
    
    /**
      * Returns the result value of the operation,
      * regardless of the state of the poller.
      * It can return undefined or an incomplete form of the final TResult value
      * depending on the implementation.
      */
    def getResult(): js.UndefOr[TResult] = js.native
    
    /**
      * Returns true if the poller has finished polling.
      */
    def isDone(): Boolean = js.native
    
    /**
      * Returns true if the poller is stopped.
      */
    def isStopped(): Boolean = js.native
    
    /**
      * Invokes the provided callback after each polling is completed,
      * sending the current state of the poller's operation.
      *
      * It returns a method that can be used to stop receiving updates on the given callback function.
      */
    def onProgress(callback: js.Function1[/* state */ TState, Unit]): CancelOnProgress = js.native
    
    /**
      * Returns a promise that will resolve once a single polling request finishes.
      * It does this by calling the update method of the Poller's operation.
      */
    def poll(): js.Promise[Unit] = js.native
    def poll(options: AbortSignal): js.Promise[Unit] = js.native
    
    /**
      * Returns a promise that will resolve once the underlying operation is completed.
      */
    def pollUntilDone(): js.Promise[TResult] = js.native
    def pollUntilDone(pollOptions: AbortSignal): js.Promise[TResult] = js.native
    
    /**
      * Stops the poller. After this, no manual or automated requests can be sent.
      */
    def stopPolling(): Unit = js.native
  }
  
  trait RawResponse extends StObject {
    
    /** The parsed response body */
    var body: js.UndefOr[Any] = js.undefined
    
    /** A HttpHeaders collection in the response represented as a simple JSON object where all header names have been normalized to be lower-case. */
    var headers: StringDictionary[String]
    
    /** The HTTP status code */
    var statusCode: Double
  }
  object RawResponse {
    
    inline def apply(headers: StringDictionary[String], statusCode: Double): RawResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResponse]
    }
    
    extension [Self <: RawResponse](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimplePollerLike[TState /* <: OperationState[TResult] */, TResult] extends StObject {
    
    /**
      * Returns the state of the operation.
      */
    def getOperationState(): TState = js.native
    
    /**
      * Returns the result value of the operation,
      * regardless of the state of the poller.
      * It can return undefined or an incomplete form of the final TResult value
      * depending on the implementation.
      */
    def getResult(): js.UndefOr[TResult] = js.native
    
    /**
      * Returns true if the poller has finished polling.
      */
    def isDone(): Boolean = js.native
    
    /**
      * Returns true if the poller is stopped.
      */
    def isStopped(): Boolean = js.native
    
    /**
      * Invokes the provided callback after each polling is completed,
      * sending the current state of the poller's operation.
      *
      * It returns a method that can be used to stop receiving updates on the given callback function.
      */
    def onProgress(callback: js.Function1[/* state */ TState, Unit]): CancelOnProgress = js.native
    
    /**
      * Returns a promise that will resolve once a single polling request finishes.
      * It does this by calling the update method of the Poller's operation.
      */
    def poll(): js.Promise[Unit] = js.native
    def poll(options: AbortSignal): js.Promise[Unit] = js.native
    
    /**
      * Returns a promise that will resolve once the underlying operation is completed.
      */
    def pollUntilDone(): js.Promise[TResult] = js.native
    def pollUntilDone(pollOptions: AbortSignal): js.Promise[TResult] = js.native
    
    /**
      * Stops the poller. After this, no manual or automated requests can be sent.
      */
    def stopPolling(): Unit = js.native
  }
}
