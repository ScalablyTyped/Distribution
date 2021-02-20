package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointTypesResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The types of endpoints that are supported.
    */
  var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList] = js.native
}
object DescribeEndpointTypesResponse {
  
  @scala.inline
  def apply(): DescribeEndpointTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointTypesResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointTypesResponseMutableBuilder[Self <: DescribeEndpointTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSupportedEndpointTypes(value: SupportedEndpointTypeList): Self = StObject.set(x, "SupportedEndpointTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedEndpointTypesUndefined: Self = StObject.set(x, "SupportedEndpointTypes", js.undefined)
    
    @scala.inline
    def setSupportedEndpointTypesVarargs(value: SupportedEndpointType*): Self = StObject.set(x, "SupportedEndpointTypes", js.Array(value :_*))
  }
}
