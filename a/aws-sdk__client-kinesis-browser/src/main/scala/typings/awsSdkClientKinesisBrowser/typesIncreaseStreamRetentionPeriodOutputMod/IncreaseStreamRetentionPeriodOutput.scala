package typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncreaseStreamRetentionPeriodOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
}

object IncreaseStreamRetentionPeriodOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): IncreaseStreamRetentionPeriodOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IncreaseStreamRetentionPeriodOutput]
  }
}

