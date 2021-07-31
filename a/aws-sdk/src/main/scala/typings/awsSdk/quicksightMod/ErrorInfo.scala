package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorInfo extends StObject {
  
  /**
    * Error message.
    */
  var Message: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * Error type.
    */
  var Type: js.UndefOr[IngestionErrorType] = js.undefined
}
object ErrorInfo {
  
  @scala.inline
  def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  @scala.inline
  implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: IngestionErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
