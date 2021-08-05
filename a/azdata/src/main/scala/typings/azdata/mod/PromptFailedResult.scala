package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptFailedResult extends StObject {
  
  /**
    * Type guard for differentiating user cancelled sign in errors from other errors
    */
  var canceled: Boolean
}
object PromptFailedResult {
  
  inline def apply(canceled: Boolean): PromptFailedResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptFailedResult]
  }
  
  extension [Self <: PromptFailedResult](x: Self) {
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
  }
}
