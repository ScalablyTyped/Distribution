package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataEndpointOutput extends js.Object {
  /**
    * The endpoint value. To read data from the stream or to write data to it, specify this endpoint in your application.
    */
  var DataEndpoint: js.UndefOr[typings.awsSdk.kinesisvideoMod.DataEndpoint] = js.native
}

object GetDataEndpointOutput {
  @scala.inline
  def apply(): GetDataEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataEndpointOutput]
  }
  @scala.inline
  implicit class GetDataEndpointOutputOps[Self <: GetDataEndpointOutput] (val x: Self) extends AnyVal {
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
    def setDataEndpoint(value: DataEndpoint): Self = this.set("DataEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataEndpoint: Self = this.set("DataEndpoint", js.undefined)
  }
  
}

