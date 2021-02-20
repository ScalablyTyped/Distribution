package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTableResponse extends StObject {
  
  /**
    * The Timestream table.
    */
  var Table: js.UndefOr[typings.awsSdk.timestreamwriteMod.Table] = js.native
}
object DescribeTableResponse {
  
  @scala.inline
  def apply(): DescribeTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableResponse]
  }
  
  @scala.inline
  implicit class DescribeTableResponseMutableBuilder[Self <: DescribeTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
