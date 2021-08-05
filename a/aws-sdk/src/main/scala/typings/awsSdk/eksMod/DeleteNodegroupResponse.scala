package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNodegroupResponse extends StObject {
  
  /**
    * The full description of your deleted node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.undefined
}
object DeleteNodegroupResponse {
  
  inline def apply(): DeleteNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNodegroupResponse]
  }
  
  extension [Self <: DeleteNodegroupResponse](x: Self) {
    
    inline def setNodegroup(value: Nodegroup): Self = StObject.set(x, "nodegroup", value.asInstanceOf[js.Any])
    
    inline def setNodegroupUndefined: Self = StObject.set(x, "nodegroup", js.undefined)
  }
}
