package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableOutput extends StObject {
  
  /**
    * <p>The properties of the table.</p>
    */
  var Table: js.UndefOr[TableDescription] = js.undefined
}
object DescribeTableOutput {
  
  inline def apply(): DescribeTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableOutput] (val x: Self) extends AnyVal {
    
    inline def setTable(value: TableDescription): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
