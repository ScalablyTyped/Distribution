package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableReplicaAutoScalingInput extends StObject {
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DescribeTableReplicaAutoScalingInput {
  
  inline def apply(): DescribeTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
