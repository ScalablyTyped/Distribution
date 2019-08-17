package typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultLockOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVaultLockOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The UTC date and time at which the vault lock was put into the <code>InProgress</code> state.</p>
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * <p>The UTC date and time at which the lock ID expires. This value can be <code>null</code> if the vault lock is in a <code>Locked</code> state.</p>
    */
  var ExpirationDate: js.UndefOr[String] = js.undefined
  /**
    * <p>The vault lock policy as a JSON string, which uses "\" as an escape character.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
  /**
    * <p>The state of the vault lock. <code>InProgress</code> or <code>Locked</code>.</p>
    */
  var State: js.UndefOr[String] = js.undefined
}

object GetVaultLockOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CreationDate: String = null,
    ExpirationDate: String = null,
    Policy: String = null,
    State: String = null
  ): GetVaultLockOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (State != null) __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[GetVaultLockOutput]
  }
}

