package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StorageAclOptions extends TimeoutIntervalOptions {
  var leaseId: js.UndefOr[java.lang.String] = js.undefined
  var signedIdentifiers: js.Array[SignedIdentifier]
}

