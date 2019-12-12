package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/InitiateJobOutput", JSImport.Namespace)
@js.native
object typesInitiateJobOutputMod extends js.Object {
  @js.native
  trait InitiateJobOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The ID of the job.</p>
      */
    var jobId: js.UndefOr[String] = js.native
    /**
      * <p>The path to the location of where the select results are stored.</p>
      */
    var jobOutputPath: js.UndefOr[String] = js.native
    /**
      * <p>The relative URI path of the job.</p>
      */
    var location: js.UndefOr[String] = js.native
  }
  
}

