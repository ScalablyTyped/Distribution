package typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A list of source queue URLs that have the <code>RedrivePolicy</code> queue attribute configured with a dead-letter queue.</p>
    */
  var queueUrls: js.Array[String] = js.native
}

object ListDeadLetterSourceQueuesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, queueUrls: js.Array[String]): ListDeadLetterSourceQueuesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesOutput]
  }
  @scala.inline
  implicit class ListDeadLetterSourceQueuesOutputOps[Self <: ListDeadLetterSourceQueuesOutput] (val x: Self) extends AnyVal {
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
    def setQueueUrlsVarargs(value: String*): Self = this.set("queueUrls", js.Array(value :_*))
    @scala.inline
    def setQueueUrls(value: js.Array[String]): Self = this.set("queueUrls", value.asInstanceOf[js.Any])
  }
  
}

