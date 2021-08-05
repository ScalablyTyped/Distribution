package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGeoMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
  
  /**
    * The GeoMatchSetId of the GeoMatchSet that you want to update. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId
  
  /**
    * An array of GeoMatchSetUpdate objects that you want to insert into or delete from an GeoMatchSet. For more information, see the applicable data types:    GeoMatchSetUpdate: Contains Action and GeoMatchConstraint     GeoMatchConstraint: Contains Type and Value  You can have only one Type and Value per GeoMatchConstraint. To add multiple countries, include multiple GeoMatchSetUpdate objects in your request.  
    */
  var Updates: GeoMatchSetUpdates
}
object UpdateGeoMatchSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, GeoMatchSetId: ResourceId, Updates: GeoMatchSetUpdates): UpdateGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGeoMatchSetRequest]
  }
  
  extension [Self <: UpdateGeoMatchSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchSetId(value: ResourceId): Self = StObject.set(x, "GeoMatchSetId", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: GeoMatchSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: GeoMatchSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
  }
}
