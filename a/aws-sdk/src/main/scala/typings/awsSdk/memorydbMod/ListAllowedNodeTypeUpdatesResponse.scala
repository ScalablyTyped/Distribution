package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAllowedNodeTypeUpdatesResponse extends StObject {
  
  /**
    * A list node types which you can use to scale down your cluster.
    */
  var ScaleDownNodeTypes: js.UndefOr[NodeTypeList] = js.undefined
  
  /**
    * A list node types which you can use to scale up your cluster.
    */
  var ScaleUpNodeTypes: js.UndefOr[NodeTypeList] = js.undefined
}
object ListAllowedNodeTypeUpdatesResponse {
  
  inline def apply(): ListAllowedNodeTypeUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAllowedNodeTypeUpdatesResponse]
  }
  
  extension [Self <: ListAllowedNodeTypeUpdatesResponse](x: Self) {
    
    inline def setScaleDownNodeTypes(value: NodeTypeList): Self = StObject.set(x, "ScaleDownNodeTypes", value.asInstanceOf[js.Any])
    
    inline def setScaleDownNodeTypesUndefined: Self = StObject.set(x, "ScaleDownNodeTypes", js.undefined)
    
    inline def setScaleDownNodeTypesVarargs(value: String*): Self = StObject.set(x, "ScaleDownNodeTypes", js.Array(value*))
    
    inline def setScaleUpNodeTypes(value: NodeTypeList): Self = StObject.set(x, "ScaleUpNodeTypes", value.asInstanceOf[js.Any])
    
    inline def setScaleUpNodeTypesUndefined: Self = StObject.set(x, "ScaleUpNodeTypes", js.undefined)
    
    inline def setScaleUpNodeTypesVarargs(value: String*): Self = StObject.set(x, "ScaleUpNodeTypes", js.Array(value*))
  }
}
