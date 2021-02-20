package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorInfo extends StObject {
  
  /**
    * 
    A number describing the error programmatically.
    
    */
  var ErrorCode: js.UndefOr[string] = js.native
  
  /**
    * 
    An optional field to provide more details about the error.
    
    */
  var ErrorString: js.UndefOr[string] = js.native
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
    def setErrorCode(value: string): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorString(value: string): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStringUndefined: Self = StObject.set(x, "ErrorString", js.undefined)
  }
}
