package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableOutput extends StObject {
  
  /**
    * The properties of the table.
    */
  var Table: js.UndefOr[TableDescription] = js.undefined
}
object DescribeTableOutput {
  
  inline def apply(): DescribeTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableOutput]
  }
  
  extension [Self <: DescribeTableOutput](x: Self) {
    
    inline def setTable(value: TableDescription): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
