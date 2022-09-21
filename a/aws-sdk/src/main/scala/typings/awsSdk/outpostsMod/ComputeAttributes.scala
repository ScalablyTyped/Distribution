package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeAttributes extends StObject {
  
  /**
    *  The host ID of any Dedicated Hosts on the asset. 
    */
  var HostId: js.UndefOr[typings.awsSdk.outpostsMod.HostId] = js.undefined
}
object ComputeAttributes {
  
  inline def apply(): ComputeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeAttributes]
  }
  
  extension [Self <: ComputeAttributes](x: Self) {
    
    inline def setHostId(value: HostId): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    inline def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
  }
}
