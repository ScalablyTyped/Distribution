package typings.awsSdkClientCodecommitNode.typesDifferenceMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.A
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.D
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.M
import typings.awsSdkClientCodecommitNode.typesBlobMetadataMod.BlobMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Difference extends js.Object {
  /**
    * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  var afterBlob: js.UndefOr[BlobMetadata] = js.undefined
  /**
    * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  var beforeBlob: js.UndefOr[BlobMetadata] = js.undefined
  /**
    * <p>Whether the change type of the difference is an addition (A), deletion (D), or modification (M).</p>
    */
  var changeType: js.UndefOr[A | M | D | String] = js.undefined
}

object Difference {
  @scala.inline
  def apply(
    afterBlob: BlobMetadata = null,
    beforeBlob: BlobMetadata = null,
    changeType: A | M | D | String = null
  ): Difference = {
    val __obj = js.Dynamic.literal()
    if (afterBlob != null) __obj.updateDynamic("afterBlob")(afterBlob.asInstanceOf[js.Any])
    if (beforeBlob != null) __obj.updateDynamic("beforeBlob")(beforeBlob.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Difference]
  }
}

