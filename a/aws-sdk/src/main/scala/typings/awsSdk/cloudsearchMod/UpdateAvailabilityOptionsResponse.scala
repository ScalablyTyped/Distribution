package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAvailabilityOptionsResponse extends StObject {
  
  /**
    * The newly-configured availability options. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.native
}
object UpdateAvailabilityOptionsResponse {
  
  @scala.inline
  def apply(): UpdateAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAvailabilityOptionsResponse]
  }
  
  @scala.inline
  implicit class UpdateAvailabilityOptionsResponseMutableBuilder[Self <: UpdateAvailabilityOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityOptions(value: AvailabilityOptionsStatus): Self = StObject.set(x, "AvailabilityOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityOptionsUndefined: Self = StObject.set(x, "AvailabilityOptions", js.undefined)
  }
}
