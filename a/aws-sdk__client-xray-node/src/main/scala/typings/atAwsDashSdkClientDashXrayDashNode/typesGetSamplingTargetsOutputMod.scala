package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingTargetDocumentMod._UnmarshalledSamplingTargetDocument
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreUnprocessedStatisticsMod._UnmarshalledUnprocessedStatistics
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetSamplingTargetsOutput", JSImport.Namespace)
@js.native
object typesGetSamplingTargetsOutputMod extends js.Object {
  @js.native
  trait GetSamplingTargetsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.</p>
      */
    var LastRuleModification: js.UndefOr[Date] = js.native
    /**
      * <p>Updated rules that the service should use to sample requests.</p>
      */
    var SamplingTargetDocuments: js.UndefOr[js.Array[_UnmarshalledSamplingTargetDocument]] = js.native
    /**
      * <p>Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.</p>
      */
    var UnprocessedStatistics: js.UndefOr[js.Array[_UnmarshalledUnprocessedStatistics]] = js.native
  }
  
}

