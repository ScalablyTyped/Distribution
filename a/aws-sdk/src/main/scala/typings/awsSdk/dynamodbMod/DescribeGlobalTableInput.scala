package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableInput extends StObject {
  
  /**
    * The name of the global table.
    */
  var GlobalTableName: TableName
}
object DescribeGlobalTableInput {
  
  @scala.inline
  def apply(GlobalTableName: TableName): DescribeGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableInput]
  }
  
  @scala.inline
  implicit class DescribeGlobalTableInputMutableBuilder[Self <: DescribeGlobalTableInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
  }
}
