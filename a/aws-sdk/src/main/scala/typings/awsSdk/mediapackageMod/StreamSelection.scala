package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSelection extends js.Object {
  /**
    * The maximum video bitrate (bps) to include in output.
    */
  var MaxVideoBitsPerSecond: js.UndefOr[integer] = js.native
  /**
    * The minimum video bitrate (bps) to include in output.
    */
  var MinVideoBitsPerSecond: js.UndefOr[integer] = js.native
  /**
    * A directive that determines the order of streams in the output.
    */
  var StreamOrder: js.UndefOr[typings.awsSdk.mediapackageMod.StreamOrder] = js.native
}

object StreamSelection {
  @scala.inline
  def apply(): StreamSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSelection]
  }
  @scala.inline
  implicit class StreamSelectionOps[Self <: StreamSelection] (val x: Self) extends AnyVal {
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
    def setMaxVideoBitsPerSecond(value: integer): Self = this.set("MaxVideoBitsPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVideoBitsPerSecond: Self = this.set("MaxVideoBitsPerSecond", js.undefined)
    @scala.inline
    def setMinVideoBitsPerSecond(value: integer): Self = this.set("MinVideoBitsPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinVideoBitsPerSecond: Self = this.set("MinVideoBitsPerSecond", js.undefined)
    @scala.inline
    def setStreamOrder(value: StreamOrder): Self = this.set("StreamOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamOrder: Self = this.set("StreamOrder", js.undefined)
  }
  
}

