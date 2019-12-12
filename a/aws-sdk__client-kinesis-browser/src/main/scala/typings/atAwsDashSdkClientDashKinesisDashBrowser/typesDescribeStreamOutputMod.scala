package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStreamDescriptionMod._UnmarshalledStreamDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/DescribeStreamOutput", JSImport.Namespace)
@js.native
object typesDescribeStreamOutputMod extends js.Object {
  @js.native
  trait DescribeStreamOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.</p>
      */
    var StreamDescription: _UnmarshalledStreamDescription = js.native
  }
  
}

