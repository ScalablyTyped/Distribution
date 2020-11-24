package typings.bingmaps.Microsoft.Maps.Search

import typings.bingmaps.Microsoft.Maps.IAddress
import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaceResult extends js.Object {
  
  /** The geocoded address of the place result. */
  var address: IAddress = js.native
  
  /** The location rectangle that defines the boundaries of the best map view of the place result. */
  var bestView: LocationRect = js.native
  
  /** The classification of the geographic entity returned, such as PopulatedPlace. */
  var entityType: String = js.native
  
  /** The geocoded location of the best result. */
  var location: Location = js.native
  
  /** The geocoded locations. */
  var locations: js.Array[IGeocodeLocation] = js.native
  
  /** The match code of the best result. */
  var matchCode: String | MatchCode = js.native
  
  /** The match confidence of the best result. */
  var matchConfidence: String | MatchConfidence = js.native
  
  /** The name of the place result, if one exists. */
  var name: String = js.native
}
object IPlaceResult {
  
  @scala.inline
  def apply(
    address: IAddress,
    bestView: LocationRect,
    entityType: String,
    location: Location,
    locations: js.Array[IGeocodeLocation],
    matchCode: String | MatchCode,
    matchConfidence: String | MatchConfidence,
    name: String
  ): IPlaceResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bestView = bestView.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], matchCode = matchCode.asInstanceOf[js.Any], matchConfidence = matchConfidence.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaceResult]
  }
  
  @scala.inline
  implicit class IPlaceResultOps[Self <: IPlaceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: IAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestView(value: LocationRect): Self = this.set("bestView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: IGeocodeLocation*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[IGeocodeLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCode(value: String | MatchCode): Self = this.set("matchCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchConfidence(value: String | MatchConfidence): Self = this.set("matchConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
