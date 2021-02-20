package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptFailedResult extends StObject {
  
  /**
    * Type guard for differentiating user cancelled sign in errors from other errors
    */
  var canceled: Boolean = js.native
}
object PromptFailedResult {
  
  @scala.inline
  def apply(canceled: Boolean): PromptFailedResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptFailedResult]
  }
  
  @scala.inline
  implicit class PromptFailedResultMutableBuilder[Self <: PromptFailedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
  }
}
