package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadBlobOptions extends SetBlobPropertiesOptions {
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
  var parallelOperationThreadCount: js.UndefOr[scala.Double] = js.undefined
  var speedSummary: js.UndefOr[SpeedSummary] = js.undefined
  var storeBlobContentMD5: js.UndefOr[scala.Boolean] = js.undefined
  var useTransactionalMD5: js.UndefOr[scala.Boolean] = js.undefined
}

