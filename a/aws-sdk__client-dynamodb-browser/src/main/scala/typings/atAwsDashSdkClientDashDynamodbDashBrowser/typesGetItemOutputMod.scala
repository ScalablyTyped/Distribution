package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._UnmarshalledAttributeValue
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreConsumedCapacityMod._UnmarshalledConsumedCapacity
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/GetItemOutput", JSImport.Namespace)
@js.native
object typesGetItemOutputMod extends js.Object {
  @js.native
  trait GetItemOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The capacity units consumed by the <code>GetItem</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ConsumedCapacity: js.UndefOr[_UnmarshalledConsumedCapacity] = js.native
    /**
      * <p>A map of attribute names to <code>AttributeValue</code> objects, as specified by <code>ProjectionExpression</code>.</p>
      */
    var Item: js.UndefOr[StringDictionary[_UnmarshalledAttributeValue]] = js.native
  }
  
}

