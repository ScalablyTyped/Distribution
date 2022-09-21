package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBasedAutoScalingRequest extends StObject {
  
  /**
    * An array of layer IDs.
    */
  var LayerIds: Strings
}
object DescribeLoadBasedAutoScalingRequest {
  
  inline def apply(LayerIds: Strings): DescribeLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerIds = LayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingRequest]
  }
  
  extension [Self <: DescribeLoadBasedAutoScalingRequest](x: Self) {
    
    inline def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value*))
  }
}
