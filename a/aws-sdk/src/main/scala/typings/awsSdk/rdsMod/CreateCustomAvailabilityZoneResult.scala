package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomAvailabilityZoneResult extends StObject {
  
  var CustomAvailabilityZone: js.UndefOr[typings.awsSdk.rdsMod.CustomAvailabilityZone] = js.native
}
object CreateCustomAvailabilityZoneResult {
  
  @scala.inline
  def apply(): CreateCustomAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomAvailabilityZoneResult]
  }
  
  @scala.inline
  implicit class CreateCustomAvailabilityZoneResultMutableBuilder[Self <: CreateCustomAvailabilityZoneResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZone(value: CustomAvailabilityZone): Self = StObject.set(x, "CustomAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZoneUndefined: Self = StObject.set(x, "CustomAvailabilityZone", js.undefined)
  }
}
