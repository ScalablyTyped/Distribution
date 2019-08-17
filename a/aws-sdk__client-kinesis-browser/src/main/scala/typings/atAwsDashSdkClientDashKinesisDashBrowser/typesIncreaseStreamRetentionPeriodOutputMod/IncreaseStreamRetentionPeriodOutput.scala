package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesIncreaseStreamRetentionPeriodOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[IncreaseStreamRetentionPeriodOutput]
  }
}

