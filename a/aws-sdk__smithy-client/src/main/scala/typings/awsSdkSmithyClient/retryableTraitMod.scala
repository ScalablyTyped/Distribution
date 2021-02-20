package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryableTraitMod {
  
  @js.native
  trait RetryableTrait extends StObject {
    
    /**
      * Indicates that the error is a retryable throttling error.
      */
    val throttling: js.UndefOr[Boolean] = js.native
  }
  object RetryableTrait {
    
    @scala.inline
    def apply(): RetryableTrait = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryableTrait]
    }
    
    @scala.inline
    implicit class RetryableTraitMutableBuilder[Self <: RetryableTrait] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThrottling(value: Boolean): Self = StObject.set(x, "throttling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingUndefined: Self = StObject.set(x, "throttling", js.undefined)
    }
  }
}
