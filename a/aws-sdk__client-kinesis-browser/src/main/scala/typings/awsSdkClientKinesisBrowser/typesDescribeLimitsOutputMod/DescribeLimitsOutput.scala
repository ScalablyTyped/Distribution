package typings.awsSdkClientKinesisBrowser.typesDescribeLimitsOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLimitsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The number of open shards.</p>
    */
  var OpenShardCount: Double
  /**
    * <p>The maximum number of shards.</p>
    */
  var ShardLimit: Double
}

object DescribeLimitsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, OpenShardCount: Double, ShardLimit: Double): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

