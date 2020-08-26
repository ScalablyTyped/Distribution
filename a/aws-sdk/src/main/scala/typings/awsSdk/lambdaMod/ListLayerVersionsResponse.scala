package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayerVersionsResponse extends js.Object {
  /**
    * A list of versions.
    */
  var LayerVersions: js.UndefOr[LayerVersionsList] = js.native
  /**
    * A pagination token returned when the response doesn't contain all versions.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListLayerVersionsResponse {
  @scala.inline
  def apply(): ListLayerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayerVersionsResponse]
  }
  @scala.inline
  implicit class ListLayerVersionsResponseOps[Self <: ListLayerVersionsResponse] (val x: Self) extends AnyVal {
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
    def setLayerVersionsVarargs(value: LayerVersionsListItem*): Self = this.set("LayerVersions", js.Array(value :_*))
    @scala.inline
    def setLayerVersions(value: LayerVersionsList): Self = this.set("LayerVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerVersions: Self = this.set("LayerVersions", js.undefined)
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

