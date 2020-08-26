package typings.awsSdkClientKinesisBrowser.typesDescribeLimitsOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object DescribeLimitsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, OpenShardCount: Double, ShardLimit: Double): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  @scala.inline
  implicit class DescribeLimitsOutputOps[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenShardCount(value: Double): Self = this.set("OpenShardCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setShardLimit(value: Double): Self = this.set("ShardLimit", value.asInstanceOf[js.Any])
  }
  
}

