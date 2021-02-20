package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecommendationError extends StObject {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[Code] = js.native
  
  /**
    * The ID of the error.
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * The message, or reason, for the error.
    */
  var message: js.UndefOr[Message] = js.native
}
object GetRecommendationError {
  
  @scala.inline
  def apply(): GetRecommendationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationError]
  }
  
  @scala.inline
  implicit class GetRecommendationErrorMutableBuilder[Self <: GetRecommendationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
