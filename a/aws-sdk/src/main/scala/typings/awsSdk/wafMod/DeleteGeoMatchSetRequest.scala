package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGeoMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken
  
  /**
    * The GeoMatchSetID of the GeoMatchSet that you want to delete. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId
}
object DeleteGeoMatchSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, GeoMatchSetId: ResourceId): DeleteGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGeoMatchSetRequest]
  }
  
  @scala.inline
  implicit class DeleteGeoMatchSetRequestMutableBuilder[Self <: DeleteGeoMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchSetId(value: ResourceId): Self = StObject.set(x, "GeoMatchSetId", value.asInstanceOf[js.Any])
  }
}
