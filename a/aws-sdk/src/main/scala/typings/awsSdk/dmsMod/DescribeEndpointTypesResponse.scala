package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointTypesResponse extends js.Object {
  
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
  implicit class DescribeEndpointTypesResponseOps[Self <: DescribeEndpointTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setSupportedEndpointTypesVarargs(value: SupportedEndpointType*): Self = this.set("SupportedEndpointTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedEndpointTypes(value: SupportedEndpointTypeList): Self = this.set("SupportedEndpointTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedEndpointTypes: Self = this.set("SupportedEndpointTypes", js.undefined)
  }
}
