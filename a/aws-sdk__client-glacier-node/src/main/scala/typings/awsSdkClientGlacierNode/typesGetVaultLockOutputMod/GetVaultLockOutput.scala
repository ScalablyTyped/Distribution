package typings.awsSdkClientGlacierNode.typesGetVaultLockOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultLockOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The UTC date and time at which the vault lock was put into the <code>InProgress</code> state.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * <p>The UTC date and time at which the lock ID expires. This value can be <code>null</code> if the vault lock is in a <code>Locked</code> state.</p>
    */
  var ExpirationDate: js.UndefOr[String] = js.native
  /**
    * <p>The vault lock policy as a JSON string, which uses "\" as an escape character.</p>
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * <p>The state of the vault lock. <code>InProgress</code> or <code>Locked</code>.</p>
    */
  var State: js.UndefOr[String] = js.native
}

object GetVaultLockOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetVaultLockOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultLockOutput]
  }
  @scala.inline
  implicit class GetVaultLockOutputOps[Self <: GetVaultLockOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

