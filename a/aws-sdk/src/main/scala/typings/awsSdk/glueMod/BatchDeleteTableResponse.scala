package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteTableResponse extends StObject {
  
  /**
    * A list of errors encountered in attempting to delete the specified tables.
    */
  var Errors: js.UndefOr[TableErrors] = js.native
}
object BatchDeleteTableResponse {
  
  @scala.inline
  def apply(): BatchDeleteTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteTableResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteTableResponseMutableBuilder[Self <: BatchDeleteTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: TableErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: TableError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
