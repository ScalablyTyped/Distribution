package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStreamDescriptionSummaryMod._UnmarshalledStreamDescriptionSummary
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/DescribeStreamSummaryOutput", JSImport.Namespace)
@js.native
object typesDescribeStreamSummaryOutputMod extends js.Object {
  @js.native
  trait DescribeStreamSummaryOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A <a>StreamDescriptionSummary</a> containing information about the stream.</p>
      */
    var StreamDescriptionSummary: _UnmarshalledStreamDescriptionSummary = js.native
  }
  
}

