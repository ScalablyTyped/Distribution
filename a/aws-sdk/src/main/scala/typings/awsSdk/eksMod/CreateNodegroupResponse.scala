package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodegroupResponse extends StObject {
  
  /**
    * The full description of your new node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.undefined
}
object CreateNodegroupResponse {
  
  inline def apply(): CreateNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodegroupResponse]
  }
  
  extension [Self <: CreateNodegroupResponse](x: Self) {
    
    inline def setNodegroup(value: Nodegroup): Self = StObject.set(x, "nodegroup", value.asInstanceOf[js.Any])
    
    inline def setNodegroupUndefined: Self = StObject.set(x, "nodegroup", js.undefined)
  }
}
