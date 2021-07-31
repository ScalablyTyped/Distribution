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
  
  @scala.inline
  def apply(): ListAvailableZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableZonesResponse]
  }
  
  @scala.inline
  implicit class ListAvailableZonesResponseMutableBuilder[Self <: ListAvailableZonesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAZList(value: AZList): Self = StObject.set(x, "AZList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAZListUndefined: Self = StObject.set(x, "AZList", js.undefined)
    
    @scala.inline
    def setAZListVarargs(value: AZ*): Self = StObject.set(x, "AZList", js.Array(value :_*))
  }
}
