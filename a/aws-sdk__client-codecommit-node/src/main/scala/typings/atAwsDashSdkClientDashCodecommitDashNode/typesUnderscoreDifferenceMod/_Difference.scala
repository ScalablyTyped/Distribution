package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreDifferenceMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.A
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.D
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.M
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreBlobMetadataMod._BlobMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Difference extends js.Object {
  /**
    * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  var afterBlob: js.UndefOr[_BlobMetadata] = js.undefined
  /**
    * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  var beforeBlob: js.UndefOr[_BlobMetadata] = js.undefined
  /**
    * <p>Whether the change type of the difference is an addition (A), deletion (D), or modification (M).</p>
    */
  var changeType: js.UndefOr[A | M | D | String] = js.undefined
}

object _Difference {
  @scala.inline
  def apply(
    afterBlob: _BlobMetadata = null,
    beforeBlob: _BlobMetadata = null,
    changeType: A | M | D | String = null
  ): _Difference = {
    val __obj = js.Dynamic.literal()
    if (afterBlob != null) __obj.updateDynamic("afterBlob")(afterBlob)
    if (beforeBlob != null) __obj.updateDynamic("beforeBlob")(beforeBlob)
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Difference]
  }
}

