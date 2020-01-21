package typings.awsSdkClientCodecommitNode.typesDifferenceMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.A
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.D
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.M
import typings.awsSdkClientCodecommitNode.typesBlobMetadataMod.UnmarshalledBlobMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledDifference extends Difference {
  /**
    * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("afterBlob")
  var afterBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.undefined
  /**
    * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("beforeBlob")
  var beforeBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.undefined
}

object UnmarshalledDifference {
  @scala.inline
  def apply(
    afterBlob: UnmarshalledBlobMetadata = null,
    beforeBlob: UnmarshalledBlobMetadata = null,
    changeType: A | M | D | String = null
  ): UnmarshalledDifference = {
    val __obj = js.Dynamic.literal()
    if (afterBlob != null) __obj.updateDynamic("afterBlob")(afterBlob.asInstanceOf[js.Any])
    if (beforeBlob != null) __obj.updateDynamic("beforeBlob")(beforeBlob.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDifference]
  }
}

