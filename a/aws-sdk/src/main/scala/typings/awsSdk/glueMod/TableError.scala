package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableError extends StObject {
  
  /**
    * The details about the error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.glueMod.ErrorDetail] = js.undefined
  
  /**
    * The name of the table. For Hive compatibility, this must be entirely lowercase.
    */
  var TableName: js.UndefOr[NameString] = js.undefined
}
object TableError {
  
  @scala.inline
  def apply(): TableError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableError]
  }
  
  @scala.inline
  implicit class TableErrorMutableBuilder[Self <: TableError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
