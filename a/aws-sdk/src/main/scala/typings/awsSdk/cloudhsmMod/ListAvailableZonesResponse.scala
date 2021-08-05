package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableZonesResponse extends StObject {
  
  /**
    * The list of Availability Zones that have available AWS CloudHSM capacity.
    */
  var AZList: js.UndefOr[typings.awsSdk.cloudhsmMod.AZList] = js.undefined
}
object ListAvailableZonesResponse {
  
  inline def apply(): ListAvailableZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableZonesResponse]
  }
  
  extension [Self <: ListAvailableZonesResponse](x: Self) {
    
    inline def setAZList(value: AZList): Self = StObject.set(x, "AZList", value.asInstanceOf[js.Any])
    
    inline def setAZListUndefined: Self = StObject.set(x, "AZList", js.undefined)
    
    inline def setAZListVarargs(value: AZ*): Self = StObject.set(x, "AZList", js.Array(value :_*))
  }
}
