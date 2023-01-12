package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottlingRetryPolicyOptions extends StObject {
  
  /**
    * The maximum number of retry attempts. Defaults to 3.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
}
object ThrottlingRetryPolicyOptions {
  
  inline def apply(): ThrottlingRetryPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottlingRetryPolicyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThrottlingRetryPolicyOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
