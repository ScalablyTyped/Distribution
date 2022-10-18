package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGeoMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ChangeToken] = js.undefined
  
  /**
    * The GeoMatchSet returned in the CreateGeoMatchSet response. The GeoMatchSet contains no GeoMatchConstraints.
    */
  var GeoMatchSet: js.UndefOr[typings.awsSdk.clientsWafregionalMod.GeoMatchSet] = js.undefined
}
object CreateGeoMatchSetResponse {
  
  inline def apply(): CreateGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGeoMatchSetResponse]
  }
  
  extension [Self <: CreateGeoMatchSetResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setGeoMatchSet(value: GeoMatchSet): Self = StObject.set(x, "GeoMatchSet", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchSetUndefined: Self = StObject.set(x, "GeoMatchSet", js.undefined)
  }
}
