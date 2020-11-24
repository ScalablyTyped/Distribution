package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuggestionResult extends js.Object {
  
  /** A structured address object for the result.  */
  var address: IAddress = js.native
  
  /** A LocationRect that can be used to set the map view over the result. */
  var bestView: LocationRect = js.native
  
  /** Unique entity id to be used for searching the entity. */
  var entityId: String = js.native
  
  /** The sub type of result; Address, RoadBlock, PopulatedPlace, CountryRegion, etc. */
  var entitySubType: String = js.native
  
  /** The type of the result; Address, Place */
  var entityType: String = js.native
  
  /** A nicely formatted suggestion string for the result based on market. */
  var formattedSuggestion: String = js.native
  
  /**
    * The coordinate of the result. This value is only returned for place (city, landmarks) results and not for addresses.
    * Street addresses will need to be geocoded to get their location.
    */
  var location: Location = js.native
  
  /** A secondary title that provides additional context to the title value of the suggestion. **/
  var subtitle: String = js.native
  
  /** The display title for the result (i.e. “Redmond”). */
  var title: String = js.native
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
  implicit class ISuggestionResultOps[Self <: ISuggestionResult] (val x: Self) extends AnyVal {
    
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
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitySubType(value: String): Self = this.set("entitySubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedSuggestion(value: String): Self = this.set("formattedSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
