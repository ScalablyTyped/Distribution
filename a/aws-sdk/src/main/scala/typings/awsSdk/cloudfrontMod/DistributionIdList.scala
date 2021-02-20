package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionIdList extends StObject {
  
  /**
    * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can make a subsequent request using the Marker request field to retrieve more distribution IDs in the list.
    */
  var IsTruncated: Boolean = js.native
  
  /**
    * Contains the distribution IDs in the list.
    */
  var Items: js.UndefOr[DistributionIdListSummary] = js.native
  
  /**
    * The value provided in the Marker request field.
    */
  var Marker: String = js.native
  
  /**
    * The maximum number of distribution IDs requested.
    */
  var MaxItems: integer = js.native
  
  /**
    * Contains the value that you should use in the Marker field of a subsequent request to continue listing distribution IDs where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * The total number of distribution IDs returned in the response.
    */
  var Quantity: integer = js.native
}
object DistributionIdList {
  
  @scala.inline
  def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer, Quantity: integer): DistributionIdList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionIdList]
  }
  
  @scala.inline
  implicit class DistributionIdListMutableBuilder[Self <: DistributionIdList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: DistributionIdListSummary): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
