package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/DescribeVaultOutput", JSImport.Namespace)
@js.native
object typesDescribeVaultOutputMod extends js.Object {
  @js.native
  trait DescribeVaultOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
      */
    var CreationDate: js.UndefOr[String] = js.native
    /**
      * <p>The Universal Coordinated Time (UTC) date when Amazon Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
      */
    var LastInventoryDate: js.UndefOr[String] = js.native
    /**
      * <p>The number of archives in the vault as of the last inventory date. This field will return <code>null</code> if an inventory has not yet run on the vault, for example if you just created the vault.</p>
      */
    var NumberOfArchives: js.UndefOr[Double] = js.native
    /**
      * <p>Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.</p>
      */
    var SizeInBytes: js.UndefOr[Double] = js.native
    /**
      * <p>The Amazon Resource Name (ARN) of the vault.</p>
      */
    var VaultARN: js.UndefOr[String] = js.native
    /**
      * <p>The name of the vault.</p>
      */
    var VaultName: js.UndefOr[String] = js.native
  }
  
}

