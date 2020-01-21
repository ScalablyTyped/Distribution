package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod.UnmarshalledDataRetrievalPolicy
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/GetDataRetrievalPolicyOutput", JSImport.Namespace)
@js.native
object typesGetDataRetrievalPolicyOutputMod extends js.Object {
  @js.native
  trait GetDataRetrievalPolicyOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the returned data retrieval policy in JSON format.</p>
      */
    var Policy: js.UndefOr[UnmarshalledDataRetrievalPolicy] = js.native
  }
  
}

