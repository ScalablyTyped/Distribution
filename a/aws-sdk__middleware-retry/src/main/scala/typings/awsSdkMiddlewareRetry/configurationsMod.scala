package typings.awsSdkMiddlewareRetry

import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RetryStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationsMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "CONFIG_MAX_ATTEMPTS")
  @js.native
  val CONFIG_MAX_ATTEMPTS: /* "max_attempts" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "CONFIG_RETRY_MODE")
  @js.native
  val CONFIG_RETRY_MODE: /* "retry_mode" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "ENV_MAX_ATTEMPTS")
  @js.native
  val ENV_MAX_ATTEMPTS: /* "AWS_MAX_ATTEMPTS" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "ENV_RETRY_MODE")
  @js.native
  val ENV_RETRY_MODE: /* "AWS_RETRY_MODE" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "NODE_MAX_ATTEMPT_CONFIG_OPTIONS")
  @js.native
  val NODE_MAX_ATTEMPT_CONFIG_OPTIONS: LoadedConfigSelectors[Double] = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "NODE_RETRY_MODE_CONFIG_OPTIONS")
  @js.native
  val NODE_RETRY_MODE_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "resolveRetryConfig")
  @js.native
  def resolveRetryConfig[T](input: T with PreviouslyResolved with RetryInputConfig): T with RetryResolvedConfig = js.native
  
  @js.native
  trait PreviouslyResolved extends StObject
  
  @js.native
  trait RetryInputConfig extends StObject {
    
    /**
      * The maximum number of times requests that encounter retryable failures should be attempted.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.native
    
    /**
      * The strategy to retry the request. Using built-in exponential backoff strategy by default.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  }
  object RetryInputConfig {
    
    @scala.inline
    def apply(): RetryInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryInputConfig]
    }
    
    @scala.inline
    implicit class RetryInputConfigMutableBuilder[Self <: RetryInputConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = StObject.set(x, "maxAttempts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    }
  }
  
  @js.native
  trait RetryResolvedConfig extends StObject {
    
    def maxAttempts(): js.Promise[Double] = js.native
    @JSName("maxAttempts")
    var maxAttempts_Original: Provider[Double] = js.native
    
    var retryStrategy: RetryStrategy = js.native
  }
}
