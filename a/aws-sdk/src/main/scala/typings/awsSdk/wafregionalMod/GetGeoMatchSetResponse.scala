package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoMatchSetResponse extends StObject {
  
  /**
    * Information about the GeoMatchSet that you specified in the GetGeoMatchSet request. This includes the Type, which for a GeoMatchContraint is always Country, as well as the Value, which is the identifier for a specific country.
    */
  var GeoMatchSet: js.UndefOr[typings.awsSdk.wafregionalMod.GeoMatchSet] = js.undefined
}
object GetGeoMatchSetResponse {
  
  @scala.inline
  def apply(): GetGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeoMatchSetResponse]
  }
  
  @scala.inline
  implicit class GetGeoMatchSetResponseMutableBuilder[Self <: GetGeoMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoMatchSet(value: GeoMatchSet): Self = StObject.set(x, "GeoMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchSetUndefined: Self = StObject.set(x, "GeoMatchSet", js.undefined)
  }
}
