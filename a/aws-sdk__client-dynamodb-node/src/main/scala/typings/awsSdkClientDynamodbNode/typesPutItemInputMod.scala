package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ALL_NEW
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ALL_OLD
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AND
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.INDEXES
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NONE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.OR
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SIZE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TOTAL
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATED_NEW
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATED_OLD
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbNode.typesExpectedAttributeValueMod.ExpectedAttributeValue
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutItemInputMod {
  
  trait PutItemInput
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
      * <p>A condition that must be satisfied in order for a conditional <code>PutItem</code> operation to succeed.</p> <p>An expression can contain any of the following:</p> <ul> <li> <p>Functions: <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code> </p> <p>These function names are case-sensitive.</p> </li> <li> <p>Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code> </p> </li> <li> <p> Logical operators: <code>AND | OR | NOT</code> </p> </li> </ul> <p>For more information on condition expressions, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ConditionExpression: js.UndefOr[String] = js.undefined
    
    /**
      * <p>This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ConditionalOperator: js.UndefOr[AND | OR | String] = js.undefined
    
    /**
      * <p>This is a legacy parameter. Use <code>ConditionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html">Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var Expected: js.UndefOr[
        StringDictionary[ExpectedAttributeValue] | (Iterable[js.Tuple2[String, ExpectedAttributeValue]])
      ] = js.undefined
    
    /**
      * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ExpressionAttributeNames: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>One or more values that can be substituted in an expression.</p> <p>Use the <b>:</b> (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the <i>ProductStatus</i> attribute was one of the following: </p> <p> <code>Available | Backordered | Discontinued</code> </p> <p>You would first need to specify <code>ExpressionAttributeValues</code> as follows:</p> <p> <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code> </p> <p>You could then use these values in an expression, such as this:</p> <p> <code>ProductStatus IN (:avail, :back, :disc)</code> </p> <p>For more information on expression attribute values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ExpressionAttributeValues: js.UndefOr[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])] = js.undefined
    
    /**
      * <p>A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.</p> <p>You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key.</p> <p>If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.</p> <p>For more information about primary keys, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p> <p>Each element in the <code>Item</code> map is an <code>AttributeValue</code> object.</p>
      */
    var Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])
    
    /**
      * <p>Determines the level of detail about provisioned throughput consumption that is returned in the response:</p> <ul> <li> <p> <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.</p> <p>Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).</p> </li> <li> <p> <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.</p> </li> <li> <p> <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.</p> </li> </ul>
      */
    var ReturnConsumedCapacity: js.UndefOr[INDEXES | TOTAL | NONE | String] = js.undefined
    
    /**
      * <p>Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to <code>NONE</code> (the default), no statistics are returned.</p>
      */
    var ReturnItemCollectionMetrics: js.UndefOr[SIZE | NONE | String] = js.undefined
    
    /**
      * <p>Use <code>ReturnValues</code> if you want to get the item attributes as they appeared before they were updated with the <code>PutItem</code> request. For <code>PutItem</code>, the valid values are:</p> <ul> <li> <p> <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)</p> </li> <li> <p> <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an attribute name-value pair, then the content of the old item is returned.</p> </li> </ul> <note> <p>The <code>ReturnValues</code> parameter is used by several DynamoDB operations; however, <code>PutItem</code> does not recognize any values other than <code>NONE</code> or <code>ALL_OLD</code>.</p> </note>
      */
    var ReturnValues: js.UndefOr[NONE | ALL_OLD | UPDATED_OLD | ALL_NEW | UPDATED_NEW | String] = js.undefined
    
    /**
      * <p>The name of the table to contain the item.</p>
      */
    var TableName: String
  }
  object PutItemInput {
    
    @scala.inline
    def apply(
      Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutItemInput]
    }
    
    @scala.inline
    implicit class PutItemInputMutableBuilder[Self <: PutItemInput] (val x: Self) extends AnyVal {
      
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
      def setConditionExpression(value: String): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      @scala.inline
      def setConditionalOperator(value: AND | OR | String): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      @scala.inline
      def setExpected(
        value: StringDictionary[ExpectedAttributeValue] | (Iterable[js.Tuple2[String, ExpectedAttributeValue]])
      ): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setItem(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacity(value: INDEXES | TOTAL | NONE | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setReturnItemCollectionMetrics(value: SIZE | NONE | String): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      @scala.inline
      def setReturnValues(value: NONE | ALL_OLD | UPDATED_OLD | ALL_NEW | UPDATED_NEW | String): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
}
