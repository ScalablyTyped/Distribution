package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsIngest extends js.Object {
  /**
    * A list of endpoints to which the source stream should be sent.
    */
  var IngestEndpoints: js.UndefOr[listOfIngestEndpoint] = js.native
}

object HlsIngest {
  @scala.inline
  def apply(): HlsIngest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsIngest]
  }
  @scala.inline
  implicit class HlsIngestOps[Self <: HlsIngest] (val x: Self) extends AnyVal {
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
    def setIngestEndpointsVarargs(value: IngestEndpoint*): Self = this.set("IngestEndpoints", js.Array(value :_*))
    @scala.inline
    def setIngestEndpoints(value: listOfIngestEndpoint): Self = this.set("IngestEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestEndpoints: Self = this.set("IngestEndpoints", js.undefined)
  }
  
}

