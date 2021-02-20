package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTableOutput extends StObject {
  
  /**
    * The properties of the table.
    */
  var Table: js.UndefOr[TableDescription] = js.native
}
object DescribeTableOutput {
  
  @scala.inline
  def apply(): DescribeTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableOutput]
  }
  
  @scala.inline
  implicit class DescribeTableOutputMutableBuilder[Self <: DescribeTableOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: TableDescription): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
