package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryStrategy extends StObject {
  
  /**
    * The number of times to retry the job. When the job is retried, it's SecondaryStatus is changed to STARTING.
    */
  var MaximumRetryAttempts: typings.awsSdk.sagemakerMod.MaximumRetryAttempts
}
object RetryStrategy {
  
  inline def apply(MaximumRetryAttempts: MaximumRetryAttempts): RetryStrategy = {
    val __obj = js.Dynamic.literal(MaximumRetryAttempts = MaximumRetryAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryStrategy]
  }
  
  extension [Self <: RetryStrategy](x: Self) {
    
    inline def setMaximumRetryAttempts(value: MaximumRetryAttempts): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
  }
}
