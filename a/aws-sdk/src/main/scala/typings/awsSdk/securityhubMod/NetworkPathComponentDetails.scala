package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPathComponentDetails extends StObject {
  
  /**
    * The IP addresses of the destination.
    */
  var Address: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of port ranges for the destination.
    */
  var PortRanges: js.UndefOr[PortRangeList] = js.undefined
}
object NetworkPathComponentDetails {
  
  inline def apply(): NetworkPathComponentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPathComponentDetails]
  }
  
  extension [Self <: NetworkPathComponentDetails](x: Self) {
    
    inline def setAddress(value: StringList): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setAddressVarargs(value: NonEmptyString*): Self = StObject.set(x, "Address", js.Array(value :_*))
    
    inline def setPortRanges(value: PortRangeList): Self = StObject.set(x, "PortRanges", value.asInstanceOf[js.Any])
    
    inline def setPortRangesUndefined: Self = StObject.set(x, "PortRanges", js.undefined)
    
    inline def setPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "PortRanges", js.Array(value :_*))
  }
}
