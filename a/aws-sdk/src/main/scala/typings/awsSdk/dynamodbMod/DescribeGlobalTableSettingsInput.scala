package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableSettingsInput extends StObject {
  
  /**
    * The name of the global table to describe.
    */
  var GlobalTableName: TableName
}
object DescribeGlobalTableSettingsInput {
  
  @scala.inline
  def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
  }
  
  @scala.inline
  implicit class DescribeGlobalTableSettingsInputMutableBuilder[Self <: DescribeGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
  }
}
