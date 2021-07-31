package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegionsRequest extends StObject {
  
  /**
    * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability Zones are indicated with a letter: e.g., us-east-2a.
    */
  var includeAvailabilityZones: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value indicating whether to also include Availability Zones for databases in your get regions request. Availability Zones are indicated with a letter (e.g., us-east-2a).
    */
  var includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean] = js.undefined
}
object GetRegionsRequest {
  
  @scala.inline
  def apply(): GetRegionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionsRequest]
  }
  
  @scala.inline
  implicit class GetRegionsRequestMutableBuilder[Self <: GetRegionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAvailabilityZones(value: Boolean): Self = StObject.set(x, "includeAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAvailabilityZonesUndefined: Self = StObject.set(x, "includeAvailabilityZones", js.undefined)
    
    @scala.inline
    def setIncludeRelationalDatabaseAvailabilityZones(value: Boolean): Self = StObject.set(x, "includeRelationalDatabaseAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRelationalDatabaseAvailabilityZonesUndefined: Self = StObject.set(x, "includeRelationalDatabaseAvailabilityZones", js.undefined)
  }
}
