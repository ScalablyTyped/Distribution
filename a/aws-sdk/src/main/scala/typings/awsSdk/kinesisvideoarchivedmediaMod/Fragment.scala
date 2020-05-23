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
  def apply(
    FragmentLengthInMilliseconds: js.UndefOr[Long] = js.undefined,
    FragmentNumber: FragmentNumberString = null,
    FragmentSizeInBytes: js.UndefOr[Long] = js.undefined,
    ProducerTimestamp: Timestamp = null,
    ServerTimestamp: Timestamp = null
  ): Fragment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FragmentLengthInMilliseconds)) __obj.updateDynamic("FragmentLengthInMilliseconds")(FragmentLengthInMilliseconds.get.asInstanceOf[js.Any])
    if (FragmentNumber != null) __obj.updateDynamic("FragmentNumber")(FragmentNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(FragmentSizeInBytes)) __obj.updateDynamic("FragmentSizeInBytes")(FragmentSizeInBytes.get.asInstanceOf[js.Any])
    if (ProducerTimestamp != null) __obj.updateDynamic("ProducerTimestamp")(ProducerTimestamp.asInstanceOf[js.Any])
    if (ServerTimestamp != null) __obj.updateDynamic("ServerTimestamp")(ServerTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
}

