package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  /**
    * The Region service endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The Region opt-in status. The possible values are opt-in-not-required, opted-in, and not-opted-in.
    */
  var OptInStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
}
object Region {
  
  @scala.inline
  def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setOptInStatus(value: String): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
    
    @scala.inline
    def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
