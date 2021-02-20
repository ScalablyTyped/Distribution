package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnError extends StObject {
  
  /**
    * The name of the column that failed.
    */
  var ColumnName: js.UndefOr[NameString] = js.native
  
  /**
    * An error message with the reason for the failure of an operation.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
}
object ColumnError {
  
  @scala.inline
  def apply(): ColumnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnError]
  }
  
  @scala.inline
  implicit class ColumnErrorMutableBuilder[Self <: ColumnError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnName(value: NameString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNameUndefined: Self = StObject.set(x, "ColumnName", js.undefined)
    
    @scala.inline
    def setError(value: ErrorDetail): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
