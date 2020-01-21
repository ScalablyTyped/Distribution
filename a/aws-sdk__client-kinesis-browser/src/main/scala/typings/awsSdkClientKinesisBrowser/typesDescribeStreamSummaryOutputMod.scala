package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod.UnmarshalledStreamDescriptionSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    var StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary = js.native
  }
  
}

