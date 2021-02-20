package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSatellitesResponse extends StObject {
  
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * List of satellites.
    */
  var satellites: js.UndefOr[SatelliteList] = js.native
}
object ListSatellitesResponse {
  
  @scala.inline
  def apply(): ListSatellitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSatellitesResponse]
  }
  
  @scala.inline
  implicit class ListSatellitesResponseMutableBuilder[Self <: ListSatellitesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSatellites(value: SatelliteList): Self = StObject.set(x, "satellites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatellitesUndefined: Self = StObject.set(x, "satellites", js.undefined)
    
    @scala.inline
    def setSatellitesVarargs(value: SatelliteListItem*): Self = StObject.set(x, "satellites", js.Array(value :_*))
  }
}
