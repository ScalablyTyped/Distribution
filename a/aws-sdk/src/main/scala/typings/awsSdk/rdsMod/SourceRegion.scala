package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRegion extends StObject {
  
  /**
    * The endpoint for the source AWS Region endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.native
  
  /**
    * The name of the source AWS Region.
    */
  var RegionName: js.UndefOr[String] = js.native
  
  /**
    * The status of the source AWS Region.
    */
  var Status: js.UndefOr[String] = js.native
}
object SourceRegion {
  
  @scala.inline
  def apply(): SourceRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceRegion]
  }
  
  @scala.inline
  implicit class SourceRegionMutableBuilder[Self <: SourceRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
