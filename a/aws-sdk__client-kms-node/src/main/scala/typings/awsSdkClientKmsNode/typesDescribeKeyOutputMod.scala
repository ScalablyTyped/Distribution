package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/DescribeKeyOutput", JSImport.Namespace)
@js.native
object typesDescribeKeyOutputMod extends js.Object {
  @js.native
  trait DescribeKeyOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Metadata associated with the key.</p>
      */
    var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.native
  }
  
}

