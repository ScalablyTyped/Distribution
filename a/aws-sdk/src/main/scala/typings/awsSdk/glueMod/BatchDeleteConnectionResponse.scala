package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteConnectionResponse extends StObject {
  
  /**
    * A map of the names of connections that were not successfully deleted to error details.
    */
  var Errors: js.UndefOr[ErrorByName] = js.native
  
  /**
    * A list of names of the connection definitions that were successfully deleted.
    */
  var Succeeded: js.UndefOr[NameStringList] = js.native
}
object BatchDeleteConnectionResponse {
  
  @scala.inline
  def apply(): BatchDeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteConnectionResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteConnectionResponseMutableBuilder[Self <: BatchDeleteConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: ErrorByName): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setSucceeded(value: NameStringList): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededUndefined: Self = StObject.set(x, "Succeeded", js.undefined)
    
    @scala.inline
    def setSucceededVarargs(value: NameString*): Self = StObject.set(x, "Succeeded", js.Array(value :_*))
  }
}
