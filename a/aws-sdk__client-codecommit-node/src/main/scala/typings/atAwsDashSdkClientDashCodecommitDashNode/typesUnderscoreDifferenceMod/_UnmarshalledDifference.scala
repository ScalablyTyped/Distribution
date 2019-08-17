package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreDifferenceMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.A
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.D
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.M
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreBlobMetadataMod._UnmarshalledBlobMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDifference extends _Difference {
  /**
    * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("afterBlob")
  var afterBlob__UnmarshalledDifference: js.UndefOr[_UnmarshalledBlobMetadata] = js.undefined
  /**
    * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("beforeBlob")
  var beforeBlob__UnmarshalledDifference: js.UndefOr[_UnmarshalledBlobMetadata] = js.undefined
}

object _UnmarshalledDifference {
  @scala.inline
  def apply(
    afterBlob: _UnmarshalledBlobMetadata = null,
    beforeBlob: _UnmarshalledBlobMetadata = null,
    changeType: A | M | D | String = null
  ): _UnmarshalledDifference = {
    val __obj = js.Dynamic.literal()
    if (afterBlob != null) __obj.updateDynamic("afterBlob")(afterBlob)
    if (beforeBlob != null) __obj.updateDynamic("beforeBlob")(beforeBlob)
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledDifference]
  }
}

