package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment extends js.Object {
  /**
    * The playback duration or other time value associated with the fragment.
    */
  var FragmentLengthInMilliseconds: js.UndefOr[Long] = js.native
  /**
    * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
    */
  var FragmentNumber: js.UndefOr[FragmentNumberString] = js.native
  /**
    * The total fragment size, including information about the fragment and contained media data.
    */
  var FragmentSizeInBytes: js.UndefOr[Long] = js.native
  /**
    * The timestamp from the producer corresponding to the fragment.
    */
  var ProducerTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The timestamp from the AWS server corresponding to the fragment.
    */
  var ServerTimestamp: js.UndefOr[Timestamp] = js.native
}

object Fragment {
  @scala.inline
  def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
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
    def setFragmentLengthInMilliseconds(value: Long): Self = this.set("FragmentLengthInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentLengthInMilliseconds: Self = this.set("FragmentLengthInMilliseconds", js.undefined)
    @scala.inline
    def setFragmentNumber(value: FragmentNumberString): Self = this.set("FragmentNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentNumber: Self = this.set("FragmentNumber", js.undefined)
    @scala.inline
    def setFragmentSizeInBytes(value: Long): Self = this.set("FragmentSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentSizeInBytes: Self = this.set("FragmentSizeInBytes", js.undefined)
    @scala.inline
    def setProducerTimestamp(value: Timestamp): Self = this.set("ProducerTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducerTimestamp: Self = this.set("ProducerTimestamp", js.undefined)
    @scala.inline
    def setServerTimestamp(value: Timestamp): Self = this.set("ServerTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerTimestamp: Self = this.set("ServerTimestamp", js.undefined)
  }
  
}

