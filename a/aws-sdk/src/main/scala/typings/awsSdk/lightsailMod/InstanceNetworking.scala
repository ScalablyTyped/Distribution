package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceNetworking extends StObject {
  
  /**
    * The amount of data in GB allocated for monthly data transfers.
    */
  var monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.undefined
  
  /**
    * An array of key-value pairs containing information about the ports on the instance.
    */
  var ports: js.UndefOr[InstancePortInfoList] = js.undefined
}
object InstanceNetworking {
  
  inline def apply(): InstanceNetworking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworking]
  }
  
  extension [Self <: InstanceNetworking](x: Self) {
    
    inline def setMonthlyTransfer(value: MonthlyTransfer): Self = StObject.set(x, "monthlyTransfer", value.asInstanceOf[js.Any])
    
    inline def setMonthlyTransferUndefined: Self = StObject.set(x, "monthlyTransfer", js.undefined)
    
    inline def setPorts(value: InstancePortInfoList): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: InstancePortInfo*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
