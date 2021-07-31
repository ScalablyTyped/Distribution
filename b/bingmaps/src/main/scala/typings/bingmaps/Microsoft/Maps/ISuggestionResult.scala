package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuggestionResult extends StObject {
  
  /** A structured address object for the result.  */
  var address: IAddress
  
  /** A LocationRect that can be used to set the map view over the result. */
  var bestView: LocationRect
  
  /** Unique entity id to be used for searching the entity. */
  var entityId: String
  
  /** The sub type of result; Address, RoadBlock, PopulatedPlace, CountryRegion, etc. */
  var entitySubType: String
  
  /** The type of the result; Address, Place */
  var entityType: String
  
  /** A nicely formatted suggestion string for the result based on market. */
  var formattedSuggestion: String
  
  /**
    * The coordinate of the result. This value is only returned for place (city, landmarks) results and not for addresses.
    * Street addresses will need to be geocoded to get their location.
    */
  var location: Location
  
  /** A secondary title that provides additional context to the title value of the suggestion. **/
  var subtitle: String
  
  /** The display title for the result (i.e. “Redmond”). */
  var title: String
}
object ISuggestionResult {
  
  @scala.inline
  def apply(
    address: IAddress,
    bestView: LocationRect,
    entityId: String,
    entitySubType: String,
    entityType: String,
    formattedSuggestion: String,
    location: Location,
    subtitle: String,
    title: String
  ): ISuggestionResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bestView = bestView.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any], entitySubType = entitySubType.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], formattedSuggestion = formattedSuggestion.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionResult]
  }
  
  @scala.inline
  implicit class ISuggestionResultMutableBuilder[Self <: ISuggestionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestView(value: LocationRect): Self = StObject.set(x, "bestView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitySubType(value: String): Self = StObject.set(x, "entitySubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedSuggestion(value: String): Self = StObject.set(x, "formattedSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
