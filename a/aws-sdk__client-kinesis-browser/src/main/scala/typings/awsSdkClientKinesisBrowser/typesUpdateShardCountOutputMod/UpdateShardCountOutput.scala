package typings.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object UpdateShardCountOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
  @scala.inline
  implicit class UpdateShardCountOutputOps[Self <: UpdateShardCountOutput] (val x: Self) extends AnyVal {
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
    def setCurrentShardCount(value: Double): Self = this.set("CurrentShardCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentShardCount: Self = this.set("CurrentShardCount", js.undefined)
    @scala.inline
    def setStreamName(value: String): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
    @scala.inline
    def setTargetShardCount(value: Double): Self = this.set("TargetShardCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetShardCount: Self = this.set("TargetShardCount", js.undefined)
  }
  
}

