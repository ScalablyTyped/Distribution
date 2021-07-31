package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGeoMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.undefined
  
  /**
    * The GeoMatchSet returned in the CreateGeoMatchSet response. The GeoMatchSet contains no GeoMatchConstraints.
    */
  var GeoMatchSet: js.UndefOr[typings.awsSdk.wafMod.GeoMatchSet] = js.undefined
}
object CreateGeoMatchSetResponse {
  
  @scala.inline
  def apply(): CreateGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGeoMatchSetResponse]
  }
  
  @scala.inline
  implicit class CreateGeoMatchSetResponseMutableBuilder[Self <: CreateGeoMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setGeoMatchSet(value: GeoMatchSet): Self = StObject.set(x, "GeoMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchSetUndefined: Self = StObject.set(x, "GeoMatchSet", js.undefined)
  }
}
