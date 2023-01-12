package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel
import typings.azureCoreHttp.typesLatestSrcHttpPipelineLoggerMod.HttpPipelineLogger
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesRequestPolicyMod {
  
  /* note: abstract class */ @JSImport("@azure/core-http/types/latest/src/policies/requestPolicy", "BaseRequestPolicy")
  @js.native
  open class BaseRequestPolicy protected ()
    extends StObject
       with RequestPolicy {
    /**
      * The main method to implement that manipulates a request/response.
      */
    /* protected */ def this(
      /**
      * The next policy in the pipeline. Each policy is responsible for executing the next one if the request is to continue through the pipeline.
      */
    _nextPolicy: RequestPolicy,
      /**
      * The options that can be passed to a given request policy.
      */
    _options: RequestPolicyOptionsLike
    ) = this()
    
    /**
      * The next policy in the pipeline. Each policy is responsible for executing the next one if the request is to continue through the pipeline.
      */
    val _nextPolicy: RequestPolicy = js.native
    
    /**
      * The options that can be passed to a given request policy.
      */
    val _options: RequestPolicyOptionsLike = js.native
    
    /**
      * Attempt to log the provided message to the provided logger. If no logger was provided or if
      * the log level does not meat the logger's threshold, then nothing will be logged.
      * @param logLevel - The log level of this log.
      * @param message - The message of this log.
      */
    def log(logLevel: HttpPipelineLogLevel, message: String): Unit = js.native
    
    /**
      * A method that retrieves an {@link HttpOperationResponse} given a {@link WebResourceLike} describing the request to be made.
      * @param httpRequest - {@link WebResourceLike} describing the request to be made.
      */
    /* CompleteClass */
    override def sendRequest(httpRequest: WebResourceLike): js.Promise[HttpOperationResponse] = js.native
    
    /**
      * Get whether or not a log with the provided log level should be logged.
      * @param logLevel - The log level of the log that will be logged.
      * @returns Whether or not a log with the provided log level should be logged.
      */
    def shouldLog(logLevel: HttpPipelineLogLevel): Boolean = js.native
  }
  
  @JSImport("@azure/core-http/types/latest/src/policies/requestPolicy", "RequestPolicyOptions")
  @js.native
  open class RequestPolicyOptions () extends StObject {
    def this(_logger: HttpPipelineLogger) = this()
    
    /* private */ var _logger: Any = js.native
    
    /**
      * Attempt to log the provided message to the provided logger. If no logger was provided or if
      * the log level does not meet the logger's threshold, then nothing will be logged.
      * @param logLevel - The log level of this log.
      * @param message - The message of this log.
      */
    def log(logLevel: HttpPipelineLogLevel, message: String): Unit = js.native
    
    /**
      * Get whether or not a log with the provided log level should be logged.
      * @param logLevel - The log level of the log that will be logged.
      * @returns Whether or not a log with the provided log level should be logged.
      */
    def shouldLog(logLevel: HttpPipelineLogLevel): Boolean = js.native
  }
  
  trait RequestPolicy extends StObject {
    
    /**
      * A method that retrieves an {@link HttpOperationResponse} given a {@link WebResourceLike} describing the request to be made.
      * @param httpRequest - {@link WebResourceLike} describing the request to be made.
      */
    def sendRequest(httpRequest: WebResourceLike): js.Promise[HttpOperationResponse]
  }
  object RequestPolicy {
    
    inline def apply(sendRequest: WebResourceLike => js.Promise[HttpOperationResponse]): RequestPolicy = {
      val __obj = js.Dynamic.literal(sendRequest = js.Any.fromFunction1(sendRequest))
      __obj.asInstanceOf[RequestPolicy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestPolicy] (val x: Self) extends AnyVal {
      
      inline def setSendRequest(value: WebResourceLike => js.Promise[HttpOperationResponse]): Self = StObject.set(x, "sendRequest", js.Any.fromFunction1(value))
    }
  }
  
  trait RequestPolicyFactory extends StObject {
    
    def create(nextPolicy: RequestPolicy, options: RequestPolicyOptionsLike): RequestPolicy
  }
  object RequestPolicyFactory {
    
    inline def apply(create: (RequestPolicy, RequestPolicyOptionsLike) => RequestPolicy): RequestPolicyFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
      __obj.asInstanceOf[RequestPolicyFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestPolicyFactory] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (RequestPolicy, RequestPolicyOptionsLike) => RequestPolicy): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    }
  }
  
  trait RequestPolicyOptionsLike extends StObject {
    
    /**
      * Attempt to log the provided message to the provided logger. If no logger was provided or if
      * the log level does not meet the logger's threshold, then nothing will be logged.
      * @param logLevel - The log level of this log.
      * @param message - The message of this log.
      */
    def log(logLevel: HttpPipelineLogLevel, message: String): Unit
    
    /**
      * Get whether or not a log with the provided log level should be logged.
      * @param logLevel - The log level of the log that will be logged.
      * @returns Whether or not a log with the provided log level should be logged.
      */
    def shouldLog(logLevel: HttpPipelineLogLevel): Boolean
  }
  object RequestPolicyOptionsLike {
    
    inline def apply(log: (HttpPipelineLogLevel, String) => Unit, shouldLog: HttpPipelineLogLevel => Boolean): RequestPolicyOptionsLike = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log), shouldLog = js.Any.fromFunction1(shouldLog))
      __obj.asInstanceOf[RequestPolicyOptionsLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestPolicyOptionsLike] (val x: Self) extends AnyVal {
      
      inline def setLog(value: (HttpPipelineLogLevel, String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setShouldLog(value: HttpPipelineLogLevel => Boolean): Self = StObject.set(x, "shouldLog", js.Any.fromFunction1(value))
    }
  }
}
