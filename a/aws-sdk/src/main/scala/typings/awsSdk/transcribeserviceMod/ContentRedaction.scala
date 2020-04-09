package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentRedaction extends js.Object {
  /**
    * The output transcript file stored in either the default S3 bucket or in a bucket you specify. When you choose redacted Amazon Transcribe outputs only the redacted transcript. When you choose redacted_and_unredacted Amazon Transcribe outputs both the redacted and unredacted transcripts.
    */
  var RedactionOutput: typings.awsSdk.transcribeserviceMod.RedactionOutput = js.native
  /**
    * Request parameter that defines the entities to be redacted. The only accepted value is PII.
    */
  var RedactionType: typings.awsSdk.transcribeserviceMod.RedactionType = js.native
}

object ContentRedaction {
  @scala.inline
  def apply(RedactionOutput: RedactionOutput, RedactionType: RedactionType): ContentRedaction = {
    val __obj = js.Dynamic.literal(RedactionOutput = RedactionOutput.asInstanceOf[js.Any], RedactionType = RedactionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContentRedaction]
  }
}

