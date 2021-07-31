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
  
  @scala.inline
  def apply(): BatchDeleteTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteTableVersionResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteTableVersionResponseMutableBuilder[Self <: BatchDeleteTableVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: TableVersionErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: TableVersionError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
