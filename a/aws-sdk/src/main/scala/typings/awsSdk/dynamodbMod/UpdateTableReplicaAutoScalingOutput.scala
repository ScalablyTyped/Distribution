package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableReplicaAutoScalingOutput extends StObject {
  
  /**
    * Returns information about the auto scaling settings of a table with replicas.
    */
  var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableAutoScalingDescription] = js.undefined
}
object UpdateTableReplicaAutoScalingOutput {
  
  @scala.inline
  def apply(): UpdateTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingOutput]
  }
  
  @scala.inline
  implicit class UpdateTableReplicaAutoScalingOutputMutableBuilder[Self <: UpdateTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
  }
}
