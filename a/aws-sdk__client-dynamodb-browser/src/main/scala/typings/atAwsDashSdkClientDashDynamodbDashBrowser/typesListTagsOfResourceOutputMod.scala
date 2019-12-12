package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/ListTagsOfResourceOutput", JSImport.Namespace)
@js.native
object typesListTagsOfResourceOutputMod extends js.Object {
  @js.native
  trait ListTagsOfResourceOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>The tags currently associated with the Amazon DynamoDB resource.</p>
      */
    var Tags: js.UndefOr[js.Array[_UnmarshalledTag]] = js.native
  }
  
}

