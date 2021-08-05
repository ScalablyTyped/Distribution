package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableReplicaAutoScalingInput extends StObject {
  
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
}
object DescribeTableReplicaAutoScalingInput {
  
  inline def apply(TableName: TableName): DescribeTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingInput]
  }
  
  extension [Self <: DescribeTableReplicaAutoScalingInput](x: Self) {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
