package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableReplicaAutoScalingOutput extends StObject {
  
  /**
    * Represents the auto scaling properties of the table.
    */
  var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableAutoScalingDescription] = js.undefined
}
object DescribeTableReplicaAutoScalingOutput {
  
  @scala.inline
  def apply(): DescribeTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
  }
  
  @scala.inline
  implicit class DescribeTableReplicaAutoScalingOutputMutableBuilder[Self <: DescribeTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
  }
}
