package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/DescribeLimitsOutput", JSImport.Namespace)
@js.native
object typesDescribeLimitsOutputMod extends js.Object {
  @js.native
  trait DescribeLimitsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The number of open shards.</p>
      */
    var OpenShardCount: Double = js.native
    /**
      * <p>The maximum number of shards.</p>
      */
    var ShardLimit: Double = js.native
  }
  
}

