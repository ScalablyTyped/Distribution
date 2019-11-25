package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreBlobMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BlobMetadata extends js.Object {
  /**
    * <p>The full ID of the blob.</p>
    */
  var blobId: js.UndefOr[String] = js.undefined
  /**
    * <p>The file mode permissions of the blob. File mode permission codes include:</p> <ul> <li> <p> <code>100644</code> indicates read/write</p> </li> <li> <p> <code>100755</code> indicates read/write/execute</p> </li> <li> <p> <code>160000</code> indicates a submodule</p> </li> <li> <p> <code>120000</code> indicates a symlink</p> </li> </ul>
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * <p>The path to the blob and any associated file name, if any.</p>
    */
  var path: js.UndefOr[String] = js.undefined
}

object _BlobMetadata {
  @scala.inline
  def apply(blobId: String = null, mode: String = null, path: String = null): _BlobMetadata = {
    val __obj = js.Dynamic.literal()
    if (blobId != null) __obj.updateDynamic("blobId")(blobId.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BlobMetadata]
  }
}

