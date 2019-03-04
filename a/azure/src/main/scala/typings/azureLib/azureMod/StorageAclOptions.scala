package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageAclOptions extends TimeoutIntervalOptions {
  var leaseId: js.UndefOr[java.lang.String] = js.undefined
  var signedIdentifiers: js.Array[SignedIdentifier]
}

object StorageAclOptions {
  @scala.inline
  def apply(
    signedIdentifiers: js.Array[SignedIdentifier],
    leaseId: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): StorageAclOptions = {
    val __obj = js.Dynamic.literal(signedIdentifiers = signedIdentifiers)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAclOptions]
  }
}

