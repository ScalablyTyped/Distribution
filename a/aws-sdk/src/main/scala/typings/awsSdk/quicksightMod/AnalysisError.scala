package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisError extends StObject {
  
  /**
    * The message associated with the analysis error.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of the analysis error.
    */
  var Type: js.UndefOr[AnalysisErrorType] = js.native
}
object AnalysisError {
  
  @scala.inline
  def apply(): AnalysisError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisError]
  }
  
  @scala.inline
  implicit class AnalysisErrorMutableBuilder[Self <: AnalysisError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: AnalysisErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
