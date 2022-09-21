package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLineageGroupPolicyRequest extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the lineage group.
    */
  var LineageGroupName: LineageGroupNameOrArn
}
object GetLineageGroupPolicyRequest {
  
  inline def apply(LineageGroupName: LineageGroupNameOrArn): GetLineageGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(LineageGroupName = LineageGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLineageGroupPolicyRequest]
  }
  
  extension [Self <: GetLineageGroupPolicyRequest](x: Self) {
    
    inline def setLineageGroupName(value: LineageGroupNameOrArn): Self = StObject.set(x, "LineageGroupName", value.asInstanceOf[js.Any])
  }
}
