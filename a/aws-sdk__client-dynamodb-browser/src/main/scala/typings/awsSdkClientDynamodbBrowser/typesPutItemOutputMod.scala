package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.awsSdkClientDynamodbBrowser.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typings.awsSdkClientDynamodbBrowser.typesItemCollectionMetricsMod.UnmarshalledItemCollectionMetrics
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutItemOutputMod {
  
  trait PutItemOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The attribute values as they appeared before the <code>PutItem</code> operation, but only if <code>ReturnValues</code> is specified as <code>ALL_OLD</code> in the request. Each element consists of an attribute name and an attribute value.</p>
      */
    var Attributes: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.undefined
    
    /**
      * <p>The capacity units consumed by the <code>PutItem</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ConsumedCapacity: js.UndefOr[UnmarshalledConsumedCapacity] = js.undefined
    
    /**
      * <p>Information about item collections, if any, that were affected by the <code>PutItem</code> operation. <code>ItemCollectionMetrics</code> is only returned if the <code>ReturnItemCollectionMetrics</code> parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response.</p> <p>Each <code>ItemCollectionMetrics</code> element consists of:</p> <ul> <li> <p> <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the partition key value of the item itself.</p> </li> <li> <p> <code>SizeEstimateRangeGB</code> - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p> </li> </ul>
      */
    var ItemCollectionMetrics: js.UndefOr[UnmarshalledItemCollectionMetrics] = js.undefined
  }
  object PutItemOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutItemOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutItemOutput]
    }
    
    @scala.inline
    implicit class PutItemOutputMutableBuilder[Self <: PutItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setConsumedCapacity(value: UnmarshalledConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setItemCollectionMetrics(value: UnmarshalledItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
}
