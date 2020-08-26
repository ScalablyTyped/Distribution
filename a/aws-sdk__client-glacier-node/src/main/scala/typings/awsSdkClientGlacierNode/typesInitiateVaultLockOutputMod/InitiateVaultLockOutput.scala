package typings.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateVaultLockOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The lock ID, which is used to complete the vault locking process.</p>
    */
  var lockId: js.UndefOr[String] = js.native
}

object InitiateVaultLockOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): InitiateVaultLockOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateVaultLockOutput]
  }
  @scala.inline
  implicit class InitiateVaultLockOutputOps[Self <: InitiateVaultLockOutput] (val x: Self) extends AnyVal {
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
    def setLockId(value: String): Self = this.set("lockId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockId: Self = this.set("lockId", js.undefined)
  }
  
}

