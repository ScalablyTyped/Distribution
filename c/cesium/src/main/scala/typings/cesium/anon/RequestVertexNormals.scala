package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestVertexNormals extends js.Object {
  var requestVertexNormals: js.UndefOr[Boolean] = js.native
  var requestWaterMask: js.UndefOr[Boolean] = js.native
}

object RequestVertexNormals {
  @scala.inline
  def apply(): RequestVertexNormals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestVertexNormals]
  }
  @scala.inline
  implicit class RequestVertexNormalsOps[Self <: RequestVertexNormals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequestVertexNormals(value: Boolean): Self = this.set("requestVertexNormals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestVertexNormals: Self = this.set("requestVertexNormals", js.undefined)
    @scala.inline
    def setRequestWaterMask(value: Boolean): Self = this.set("requestWaterMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestWaterMask: Self = this.set("requestWaterMask", js.undefined)
  }
  
}

