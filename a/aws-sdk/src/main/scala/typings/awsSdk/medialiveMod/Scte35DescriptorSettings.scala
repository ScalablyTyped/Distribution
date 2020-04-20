package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35DescriptorSettings extends js.Object {
  /**
    * SCTE-35 Segmentation Descriptor.
    */
  var SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor = js.native
}

object Scte35DescriptorSettings {
  @scala.inline
  def apply(SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor): Scte35DescriptorSettings = {
    val __obj = js.Dynamic.literal(SegmentationDescriptorScte35DescriptorSettings = SegmentationDescriptorScte35DescriptorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35DescriptorSettings]
  }
}

