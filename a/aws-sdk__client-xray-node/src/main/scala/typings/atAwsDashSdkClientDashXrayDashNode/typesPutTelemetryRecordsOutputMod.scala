package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/PutTelemetryRecordsOutput", JSImport.Namespace)
@js.native
object typesPutTelemetryRecordsOutputMod extends js.Object {
  @js.native
  trait PutTelemetryRecordsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
  }
  
}

