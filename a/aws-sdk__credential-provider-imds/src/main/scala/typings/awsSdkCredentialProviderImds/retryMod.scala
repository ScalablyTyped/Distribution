package typings.awsSdkCredentialProviderImds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retry[T](toRetry: RetryableProvider[T], maxRetries: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(toRetry.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  type RetryableProvider[T] = js.Function0[js.Promise[T]]
}
