package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/GetVaultLockOutput", JSImport.Namespace)
@js.native
object typesGetVaultLockOutputMod extends js.Object {
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
  
}

