package typings.awsSdk2Types.clientsDynamodbMod

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
  
  inline def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
  }
}
