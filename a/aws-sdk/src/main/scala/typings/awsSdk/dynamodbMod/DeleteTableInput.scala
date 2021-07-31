package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableInput extends StObject {
  
  /**
    * The name of the table to delete.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
}
object DeleteTableInput {
  
  @scala.inline
  def apply(TableName: TableName): DeleteTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableInput]
  }
  
  @scala.inline
  implicit class DeleteTableInputMutableBuilder[Self <: DeleteTableInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
