package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServiceUpdatesMessage extends js.Object {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.native
}
object DescribeServiceUpdatesMessage {
  
  @scala.inline
  def apply(): DescribeServiceUpdatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceUpdatesMessage]
  }
  
  @scala.inline
  implicit class DescribeServiceUpdatesMessageOps[Self <: DescribeServiceUpdatesMessage] (val x: Self) extends AnyVal {
    
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
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setServiceUpdateName(value: String): Self = this.set("ServiceUpdateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateName: Self = this.set("ServiceUpdateName", js.undefined)
    
    @scala.inline
    def setServiceUpdateStatusVarargs(value: ServiceUpdateStatus*): Self = this.set("ServiceUpdateStatus", js.Array(value :_*))
    
    @scala.inline
    def setServiceUpdateStatus(value: ServiceUpdateStatusList): Self = this.set("ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateStatus: Self = this.set("ServiceUpdateStatus", js.undefined)
  }
}
