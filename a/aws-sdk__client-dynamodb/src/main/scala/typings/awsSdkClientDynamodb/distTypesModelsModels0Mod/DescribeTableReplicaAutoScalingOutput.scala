package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableReplicaAutoScalingOutput extends StObject {
  
  /**
    * <p>Represents the auto scaling properties of the table.</p>
    */
  var TableAutoScalingDescription: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableAutoScalingDescription
  ] = js.undefined
}
object DescribeTableReplicaAutoScalingOutput {
  
  inline def apply(): DescribeTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
    
    inline def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
    
    inline def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
  }
}
