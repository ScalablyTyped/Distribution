package typings.awsSdk2Types.anon

import typings.awsSdk2Types.clientsDynamodbMod.TableName
import typings.awsSdk2Types.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk2-types.aws-sdk2-types/clients/dynamodb.DescribeTableInput & {  $waiter :aws-sdk2-types.aws-sdk2-types/lib/service.WaiterConfiguration | undefined} */
trait DescribeTableInputwaiterW extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the table to describe.
    */
  var TableName: typings.awsSdk2Types.clientsDynamodbMod.TableName
}
object DescribeTableInputwaiterW {
  
  inline def apply(TableName: TableName): DescribeTableInputwaiterW = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInputwaiterW]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableInputwaiterW] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
