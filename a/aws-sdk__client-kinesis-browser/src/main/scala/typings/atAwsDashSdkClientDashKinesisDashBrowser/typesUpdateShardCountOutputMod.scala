package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/UpdateShardCountOutput", JSImport.Namespace)
@js.native
object typesUpdateShardCountOutputMod extends js.Object {
  @js.native
  trait UpdateShardCountOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The current number of shards.</p>
      */
    var CurrentShardCount: js.UndefOr[Double] = js.native
    /**
      * <p>The name of the stream.</p>
      */
    var StreamName: js.UndefOr[String] = js.native
    /**
      * <p>The updated number of shards.</p>
      */
    var TargetShardCount: js.UndefOr[Double] = js.native
  }
  
}

