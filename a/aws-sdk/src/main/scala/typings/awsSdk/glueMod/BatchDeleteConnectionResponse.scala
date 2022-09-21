package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteConnectionResponse extends StObject {
  
  /**
    * A map of the names of connections that were not successfully deleted to error details.
    */
  var Errors: js.UndefOr[ErrorByName] = js.undefined
  
  /**
    * A list of names of the connection definitions that were successfully deleted.
    */
  var Succeeded: js.UndefOr[NameStringList] = js.undefined
}
object BatchDeleteConnectionResponse {
  
  inline def apply(): BatchDeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteConnectionResponse]
  }
  
  extension [Self <: BatchDeleteConnectionResponse](x: Self) {
    
    inline def setErrors(value: ErrorByName): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setSucceeded(value: NameStringList): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededUndefined: Self = StObject.set(x, "Succeeded", js.undefined)
    
    inline def setSucceededVarargs(value: NameString*): Self = StObject.set(x, "Succeeded", js.Array(value*))
  }
}
