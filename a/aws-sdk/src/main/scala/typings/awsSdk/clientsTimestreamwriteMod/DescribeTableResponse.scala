package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableResponse extends StObject {
  
  /**
    * The Timestream table.
    */
  var Table: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.Table] = js.undefined
}
object DescribeTableResponse {
  
  inline def apply(): DescribeTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableResponse] (val x: Self) extends AnyVal {
    
    inline def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
