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
import typings.awsSdkClientDynamodbNode.typesAttributeValueUpdateMod.AttributeValueUpdate
import typings.awsSdkClientDynamodbNode.typesExpectedAttributeValueMod.ExpectedAttributeValue
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateItemInputMod {
  
  trait UpdateItemInput
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
      * <p>This is a legacy parameter. Use <code>UpdateExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html">AttributeUpdates</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var AttributeUpdates: js.UndefOr[
        StringDictionary[AttributeValueUpdate] | (Iterable[js.Tuple2[String, AttributeValueUpdate]])
      ] = js.undefined
    
    /**
      * <p>A condition that must be satisfied in order for a conditional update to succeed.</p> <p>An expression can contain any of the following:</p> <ul> <li> <p>Functions: <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code> </p> <p>These function names are case-sensitive.</p> </li> <li> <p>Comparison operators: <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code> </p> </li> <li> <p> Logical operators: <code>AND | OR | NOT</code> </p> </li> </ul> <p>For more information on condition expressions, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
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
      * <p>The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.</p> <p>For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.</p>
      */
    var Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])
    
    /**
      * <p>Determines the level of detail about provisioned throughput consumption that is returned in the response:</p> <ul> <li> <p> <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.</p> <p>Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).</p> </li> <li> <p> <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.</p> </li> <li> <p> <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.</p> </li> </ul>
      */
    var ReturnConsumedCapacity: js.UndefOr[INDEXES | TOTAL | NONE | String] = js.undefined
    
    /**
      * <p>Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to <code>NONE</code> (the default), no statistics are returned.</p>
      */
    var ReturnItemCollectionMetrics: js.UndefOr[SIZE | NONE | String] = js.undefined
    
    /**
      * <p>Use <code>ReturnValues</code> if you want to get the item attributes as they appear before or after they are updated. For <code>UpdateItem</code>, the valid values are:</p> <ul> <li> <p> <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if its value is <code>NONE</code>, then nothing is returned. (This setting is the default for <code>ReturnValues</code>.)</p> </li> <li> <p> <code>ALL_OLD</code> - Returns all of the attributes of the item, as they appeared before the UpdateItem operation.</p> </li> <li> <p> <code>UPDATED_OLD</code> - Returns only the updated attributes, as they appeared before the UpdateItem operation.</p> </li> <li> <p> <code>ALL_NEW</code> - Returns all of the attributes of the item, as they appear after the UpdateItem operation.</p> </li> <li> <p> <code>UPDATED_NEW</code> - Returns only the updated attributes, as they appear after the UpdateItem operation.</p> </li> </ul> <p>There is no additional cost associated with requesting a return value aside from the small network and processing overhead of receiving a larger response. No read capacity units are consumed.</p> <p>The values returned are strongly consistent.</p>
      */
    var ReturnValues: js.UndefOr[NONE | ALL_OLD | UPDATED_OLD | ALL_NEW | UPDATED_NEW | String] = js.undefined
    
    /**
      * <p>The name of the table containing the item to update.</p>
      */
    var TableName: String
    
    /**
      * <p>An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.</p> <p>The following action values are available for <code>UpdateExpression</code>.</p> <ul> <li> <p> <code>SET</code> - Adds one or more attributes and values to an item. If any of these attribute already exist, they are replaced by the new values. You can also use <code>SET</code> to add or subtract from an attribute that is of type Number. For example: <code>SET myNum = myNum + :val</code> </p> <p> <code>SET</code> supports the following functions:</p> <ul> <li> <p> <code>if_not_exists (path, operand)</code> - if the item does not contain an attribute at the specified path, then <code>if_not_exists</code> evaluates to operand; otherwise, it evaluates to path. You can use this function to avoid overwriting an attribute that may already be present in the item.</p> </li> <li> <p> <code>list_append (operand, operand)</code> - evaluates to a list with a new element added to it. You can append the new element to the start or the end of the list by reversing the order of the operands.</p> </li> </ul> <p>These function names are case-sensitive.</p> </li> <li> <p> <code>REMOVE</code> - Removes one or more attributes from an item.</p> </li> <li> <p> <code>ADD</code> - Adds the specified value to the item, if the attribute does not already exist. If the attribute does exist, then the behavior of <code>ADD</code> depends on the data type of the attribute:</p> <ul> <li> <p>If the existing attribute is a number, and if <code>Value</code> is also a number, then <code>Value</code> is mathematically added to the existing attribute. If <code>Value</code> is a negative number, then it is subtracted from the existing attribute.</p> <note> <p>If you use <code>ADD</code> to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value.</p> <p>Similarly, if you use <code>ADD</code> for an existing item to increment or decrement an attribute value that doesn't exist before the update, DynamoDB uses <code>0</code> as the initial value. For example, suppose that the item you want to update doesn't have an attribute named <i>itemcount</i>, but you decide to <code>ADD</code> the number <code>3</code> to this attribute anyway. DynamoDB will create the <i>itemcount</i> attribute, set its initial value to <code>0</code>, and finally add <code>3</code> to it. The result will be a new <i>itemcount</i> attribute in the item, with a value of <code>3</code>.</p> </note> </li> <li> <p>If the existing data type is a set and if <code>Value</code> is also a set, then <code>Value</code> is added to the existing set. For example, if the attribute value is the set <code>[1,2]</code>, and the <code>ADD</code> action specified <code>[3]</code>, then the final attribute value is <code>[1,2,3]</code>. An error occurs if an <code>ADD</code> action is specified for a set attribute and the attribute type specified does not match the existing set type. </p> <p>Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the <code>Value</code> must also be a set of strings.</p> </li> </ul> <important> <p>The <code>ADD</code> action only supports Number and set data types. In addition, <code>ADD</code> can only be used on top-level attributes, not nested attributes.</p> </important> </li> <li> <p> <code>DELETE</code> - Deletes an element from a set.</p> <p>If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set <code>[a,b,c]</code> and the <code>DELETE</code> action specifies <code>[a,c]</code>, then the final attribute value is <code>[b]</code>. Specifying an empty set is an error.</p> <important> <p>The <code>DELETE</code> action only supports set data types. In addition, <code>DELETE</code> can only be used on top-level attributes, not nested attributes.</p> </important> </li> </ul> <p>You can have many actions in a single expression, such as the following: <code>SET a=:value1, b=:value2 DELETE :value3, :value4, :value5</code> </p> <p>For more information on update expressions, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html">Modifying Items and Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var UpdateExpression: js.UndefOr[String] = js.undefined
  }
  object UpdateItemInput {
    
    @scala.inline
    def apply(
      Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateItemInput]
    }
    
    @scala.inline
    implicit class UpdateItemInputMutableBuilder[Self <: UpdateItemInput] (val x: Self) extends AnyVal {
      
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
      def setAttributeUpdates(
        value: StringDictionary[AttributeValueUpdate] | (Iterable[js.Tuple2[String, AttributeValueUpdate]])
      ): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUpdatesUndefined: Self = StObject.set(x, "AttributeUpdates", js.undefined)
      
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
      def setKey(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
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
      
      @scala.inline
      def setUpdateExpression(value: String): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
    }
  }
}
