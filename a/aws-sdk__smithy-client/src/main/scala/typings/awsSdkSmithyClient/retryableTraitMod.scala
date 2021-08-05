package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryableTraitMod {
  
  trait RetryableTrait extends StObject {
    
    /**
      * Indicates that the error is a retryable throttling error.
      */
    val throttling: js.UndefOr[Boolean] = js.undefined
  }
  object RetryableTrait {
    
    inline def apply(): RetryableTrait = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryableTrait]
    }
    
    extension [Self <: RetryableTrait](x: Self) {
      
      inline def setThrottling(value: Boolean): Self = StObject.set(x, "throttling", value.asInstanceOf[js.Any])
      
      inline def setThrottlingUndefined: Self = StObject.set(x, "throttling", js.undefined)
    }
  }
}
