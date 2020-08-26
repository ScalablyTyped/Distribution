package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayersRequest extends js.Object {
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.native
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of layers to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.native
}

object ListLayersRequest {
  @scala.inline
  def apply(): ListLayersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersRequest]
  }
  @scala.inline
  implicit class ListLayersRequestOps[Self <: ListLayersRequest] (val x: Self) extends AnyVal {
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
    def setCompatibleRuntime(value: Runtime): Self = this.set("CompatibleRuntime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleRuntime: Self = this.set("CompatibleRuntime", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxItems(value: MaxLayerListItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
  }
  
}

