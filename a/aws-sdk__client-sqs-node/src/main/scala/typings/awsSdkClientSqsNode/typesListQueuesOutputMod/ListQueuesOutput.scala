package typings.awsSdkClientSqsNode.typesListQueuesOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A list of queue URLs, up to 1,000 entries.</p>
    */
  var QueueUrls: js.UndefOr[js.Array[String]] = js.native
}

object ListQueuesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListQueuesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesOutput]
  }
  @scala.inline
  implicit class ListQueuesOutputOps[Self <: ListQueuesOutput] (val x: Self) extends AnyVal {
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
    def setQueueUrlsVarargs(value: String*): Self = this.set("QueueUrls", js.Array(value :_*))
    @scala.inline
    def setQueueUrls(value: js.Array[String]): Self = this.set("QueueUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueUrls: Self = this.set("QueueUrls", js.undefined)
  }
  
}

