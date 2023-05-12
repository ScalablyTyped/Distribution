package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableReplicaAutoScalingOutput extends StObject {
  
  /**
    * Returns information about the auto scaling settings of a table with replicas.
    */
  var TableAutoScalingDescription: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableAutoScalingDescription] = js.undefined
}
object UpdateTableReplicaAutoScalingOutput {
  
  inline def apply(): UpdateTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
    
    inline def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
    
    inline def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
  }
}
