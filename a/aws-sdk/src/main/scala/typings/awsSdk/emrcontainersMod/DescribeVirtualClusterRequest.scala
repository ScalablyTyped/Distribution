package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualClusterRequest extends StObject {
  
  /**
    * The ID of the virtual cluster that will be described.
    */
  var id: ResourceIdString
}
object DescribeVirtualClusterRequest {
  
  inline def apply(id: ResourceIdString): DescribeVirtualClusterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualClusterRequest]
  }
  
  extension [Self <: DescribeVirtualClusterRequest](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
