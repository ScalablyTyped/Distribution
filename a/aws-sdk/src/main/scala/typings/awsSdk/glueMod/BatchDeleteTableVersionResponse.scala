package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteTableVersionResponse extends StObject {
  
  /**
    * A list of errors encountered while trying to delete the specified table versions.
    */
  var Errors: js.UndefOr[TableVersionErrors] = js.undefined
}
object BatchDeleteTableVersionResponse {
  
  inline def apply(): BatchDeleteTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteTableVersionResponse]
  }
  
  extension [Self <: BatchDeleteTableVersionResponse](x: Self) {
    
    inline def setErrors(value: TableVersionErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: TableVersionError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
