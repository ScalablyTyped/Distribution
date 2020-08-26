package typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentImportResource extends SegmentImportResource {
  /**
    * The number of channel types in the imported segment.
    */
  @JSName("ChannelCounts")
  var ChannelCounts_UnmarshalledSegmentImportResource: js.UndefOr[StringDictionary[Double]] = js.native
}

object UnmarshalledSegmentImportResource {
  @scala.inline
  def apply(): UnmarshalledSegmentImportResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentImportResource]
  }
  @scala.inline
  implicit class UnmarshalledSegmentImportResourceOps[Self <: UnmarshalledSegmentImportResource] (val x: Self) extends AnyVal {
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
    def setChannelCounts(value: StringDictionary[Double]): Self = this.set("ChannelCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCounts: Self = this.set("ChannelCounts", js.undefined)
  }
  
}

