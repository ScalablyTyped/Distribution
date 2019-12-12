package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleRecordMod._UnmarshalledSamplingRuleRecord
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetSamplingRulesOutput", JSImport.Namespace)
@js.native
object typesGetSamplingRulesOutputMod extends js.Object {
  @js.native
  trait GetSamplingRulesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>Rule definitions and metadata.</p>
      */
    var SamplingRuleRecords: js.UndefOr[js.Array[_UnmarshalledSamplingRuleRecord]] = js.native
  }
  
}

