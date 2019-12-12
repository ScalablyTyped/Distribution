package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreVaultAccessPolicyMod._UnmarshalledVaultAccessPolicy
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/GetVaultAccessPolicyOutput", JSImport.Namespace)
@js.native
object typesGetVaultAccessPolicyOutputMod extends js.Object {
  @js.native
  trait GetVaultAccessPolicyOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the returned vault access policy as a JSON string.</p>
      */
    var policy: js.UndefOr[_UnmarshalledVaultAccessPolicy] = js.native
  }
  
}

