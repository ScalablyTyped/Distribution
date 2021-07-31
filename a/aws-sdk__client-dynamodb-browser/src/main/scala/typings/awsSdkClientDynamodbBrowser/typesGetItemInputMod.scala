package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.INDEXES
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NONE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TOTAL
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetItemInputMod {
  
  trait GetItemInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html">AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var AttributesToGet: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>Determines the read consistency model: If set to <code>true</code>, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads.</p>
      */
    var ConsistentRead: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ExpressionAttributeNames: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>A map of attribute names to <code>AttributeValue</code> objects, representing the primary key of the item to retrieve.</p> <p>For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.</p>
      */
    var Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])
    
    /**
      * <p>A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas.</p> <p>If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ProjectionExpression: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Determines the level of detail about provisioned throughput consumption that is returned in the response:</p> <ul> <li> <p> <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.</p> <p>Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).</p> </li> <li> <p> <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.</p> </li> <li> <p> <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.</p> </li> </ul>
      */
    var ReturnConsumedCapacity: js.UndefOr[INDEXES | TOTAL | NONE | String] = js.undefined
    
    /**
      * <p>The name of the table containing the requested item.</p>
      */
    var TableName: String
  }
  object GetItemInput {
    
    @scala.inline
    def apply(
      Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetItemInput]
    }
    
    @scala.inline
    implicit class GetItemInputMutableBuilder[Self <: GetItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setAttributesToGet(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setKey(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      @scala.inline
      def setReturnConsumedCapacity(value: INDEXES | TOTAL | NONE | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
}
