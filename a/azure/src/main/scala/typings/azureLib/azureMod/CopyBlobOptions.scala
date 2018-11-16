package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CopyBlobOptions extends BlobSnapshotOptions {
  var sourceAccessConditions: StorageAccessCondition
  var sourceLeaseId: js.UndefOr[java.lang.String] = js.undefined
}

