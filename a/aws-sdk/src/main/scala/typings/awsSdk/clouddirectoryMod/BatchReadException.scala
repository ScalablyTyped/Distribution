package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchReadException extends StObject {
  
  /**
    * An exception message that is associated with the failure.
    */
  var Message: js.UndefOr[ExceptionMessage] = js.native
  
  /**
    * A type of exception, such as InvalidArnException.
    */
  var Type: js.UndefOr[BatchReadExceptionType] = js.native
}
object BatchReadException {
  
  @scala.inline
  def apply(): BatchReadException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadException]
  }
  
  @scala.inline
  implicit class BatchReadExceptionMutableBuilder[Self <: BatchReadException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ExceptionMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: BatchReadExceptionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
