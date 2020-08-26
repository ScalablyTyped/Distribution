package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceUpdatesMessage extends js.Object {
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of service updates
    */
  var ServiceUpdates: js.UndefOr[ServiceUpdateList] = js.native
}

object ServiceUpdatesMessage {
  @scala.inline
  def apply(): ServiceUpdatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdatesMessage]
  }
  @scala.inline
  implicit class ServiceUpdatesMessageOps[Self <: ServiceUpdatesMessage] (val x: Self) extends AnyVal {
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
    def setServiceUpdatesVarargs(value: ServiceUpdate*): Self = this.set("ServiceUpdates", js.Array(value :_*))
    @scala.inline
    def setServiceUpdates(value: ServiceUpdateList): Self = this.set("ServiceUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdates: Self = this.set("ServiceUpdates", js.undefined)
  }
  
}

