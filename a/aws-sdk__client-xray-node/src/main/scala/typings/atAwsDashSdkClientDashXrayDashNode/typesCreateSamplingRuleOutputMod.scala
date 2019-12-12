package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleRecordMod._UnmarshalledSamplingRuleRecord
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/CreateSamplingRuleOutput", JSImport.Namespace)
@js.native
object typesCreateSamplingRuleOutputMod extends js.Object {
  @js.native
  trait CreateSamplingRuleOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The saved rule definition and metadata.</p>
      */
    var SamplingRuleRecord: js.UndefOr[_UnmarshalledSamplingRuleRecord] = js.native
  }
  
}

