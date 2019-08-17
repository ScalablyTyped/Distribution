package typings.atAwsDashSdkClientDashKmsDashBrowser.typesDescribeKeyOutputMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreKeyMetadataMod._UnmarshalledKeyMetadata
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeKeyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Metadata associated with the key.</p>
    */
  var KeyMetadata: js.UndefOr[_UnmarshalledKeyMetadata] = js.undefined
}

object DescribeKeyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, KeyMetadata: _UnmarshalledKeyMetadata = null): DescribeKeyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata)
    __obj.asInstanceOf[DescribeKeyOutput]
  }
}

