package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableInput extends StObject {
  
  /**
    * The name of the table to describe.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
}
object DescribeTableInput {
  
  @scala.inline
  def apply(TableName: TableName): DescribeTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInput]
  }
  
  @scala.inline
  implicit class DescribeTableInputMutableBuilder[Self <: DescribeTableInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
