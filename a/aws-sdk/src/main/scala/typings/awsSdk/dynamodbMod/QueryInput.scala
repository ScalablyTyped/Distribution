package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInput extends js.Object {
  /**
    * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
    */
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.native
  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  var ConditionalOperator: js.UndefOr[typings.awsSdk.dynamodbMod.ConditionalOperator] = js.native
  /**
    * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads. Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
    */
  var ConsistentRead: js.UndefOr[typings.awsSdk.dynamodbMod.ConsistentRead] = js.native
  /**
    * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number, or Binary. No set data types are allowed.
    */
  var ExclusiveStartKey: js.UndefOr[Key] = js.native
  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  /**
    * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  /**
    * A string that contains conditions that DynamoDB applies after the Query operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned. A FilterExpression does not allow key attributes. You cannot define a filter expression based on a partition key or a sort key.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
    */
  var FilterExpression: js.UndefOr[ConditionExpression] = js.native
  /**
    * The name of an index to query. This index can be any local secondary index or global secondary index on the table. Note that if you use the IndexName parameter, you must also provide TableName. 
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  /**
    * The condition that specifies the key values for items to be retrieved by the Query action. The condition must perform an equality test on a single partition key value. The condition can optionally perform one of several comparison tests on a single sort key value. This allows Query to retrieve one item with a given partition key value and sort key value, or several items that have the same partition key value but different sort key values. The partition key equality test is required, and must be specified in the following format:  partitionKeyName = :partitionkeyval  If you also want to provide a condition for the sort key, it must be combined using AND with the condition for the sort key. Following is an example, using the = comparison operator for the sort key:  partitionKeyName = :partitionkeyval AND sortKeyName = :sortkeyval  Valid comparisons for the sort key condition are as follows:    sortKeyName = :sortkeyval - true if the sort key value is equal to :sortkeyval.    sortKeyName &lt; :sortkeyval - true if the sort key value is less than :sortkeyval.    sortKeyName &lt;= :sortkeyval - true if the sort key value is less than or equal to :sortkeyval.    sortKeyName &gt; :sortkeyval - true if the sort key value is greater than :sortkeyval.    sortKeyName &gt;=  :sortkeyval - true if the sort key value is greater than or equal to :sortkeyval.    sortKeyName BETWEEN :sortkeyval1 AND :sortkeyval2 - true if the sort key value is greater than or equal to :sortkeyval1, and less than or equal to :sortkeyval2.    begins_with ( sortKeyName, :sortkeyval ) - true if the sort key value begins with a particular operand. (You cannot use this function with a sort key that is of type Number.) Note that the function name begins_with is case-sensitive.   Use the ExpressionAttributeValues parameter to replace tokens such as :partitionval and :sortval with actual values at runtime. You can optionally use the ExpressionAttributeNames parameter to replace the names of the partition key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a DynamoDB reserved word. For example, the following KeyConditionExpression parameter causes an error because Size is a reserved word:    Size = :myval    To work around this, define a placeholder (such a #S) to represent the attribute name Size. KeyConditionExpression then is as follows:    #S = :myval    For a list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide. For more information on ExpressionAttributeNames and ExpressionAttributeValues, see Using Placeholders for Attribute Names and Values in the Amazon DynamoDB Developer Guide.
    */
  var KeyConditionExpression: js.UndefOr[KeyExpression] = js.native
  /**
    * This is a legacy parameter. Use KeyConditionExpression instead. For more information, see KeyConditions in the Amazon DynamoDB Developer Guide.
    */
  var KeyConditions: js.UndefOr[typings.awsSdk.dynamodbMod.KeyConditions] = js.native
  /**
    * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Query and Scan in the Amazon DynamoDB Developer Guide.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ProjectionExpression: js.UndefOr[typings.awsSdk.dynamodbMod.ProjectionExpression] = js.native
  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see QueryFilter in the Amazon DynamoDB Developer Guide.
    */
  var QueryFilter: js.UndefOr[FilterConditionMap] = js.native
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
  /**
    * Specifies the order for index traversal: If true (default), the traversal is performed in ascending order; if false, the traversal is performed in descending order.  Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned. If ScanIndexForward is true, DynamoDB returns the results in the order in which they are stored (by sort key value). This is the default behavior. If ScanIndexForward is false, DynamoDB reads the results in reverse order by sort key value, and then returns the results to the client.
    */
  var ScanIndexForward: js.UndefOr[BooleanObject] = js.native
  /**
    * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
    */
  var Select: js.UndefOr[typings.awsSdk.dynamodbMod.Select] = js.native
  /**
    * The name of the table containing the requested items.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object QueryInput {
  @scala.inline
  def apply(TableName: TableName): QueryInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInput]
  }
  @scala.inline
  implicit class QueryInputOps[Self <: QueryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesToGetVarargs(value: AttributeName*): Self = this.set("AttributesToGet", js.Array(value :_*))
    @scala.inline
    def setAttributesToGet(value: AttributeNameList): Self = this.set("AttributesToGet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributesToGet: Self = this.set("AttributesToGet", js.undefined)
    @scala.inline
    def setConditionalOperator(value: ConditionalOperator): Self = this.set("ConditionalOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalOperator: Self = this.set("ConditionalOperator", js.undefined)
    @scala.inline
    def setConsistentRead(value: ConsistentRead): Self = this.set("ConsistentRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistentRead: Self = this.set("ConsistentRead", js.undefined)
    @scala.inline
    def setExclusiveStartKey(value: Key): Self = this.set("ExclusiveStartKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveStartKey: Self = this.set("ExclusiveStartKey", js.undefined)
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    @scala.inline
    def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = this.set("ExpressionAttributeValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionAttributeValues: Self = this.set("ExpressionAttributeValues", js.undefined)
    @scala.inline
    def setFilterExpression(value: ConditionExpression): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    @scala.inline
    def setKeyConditionExpression(value: KeyExpression): Self = this.set("KeyConditionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyConditionExpression: Self = this.set("KeyConditionExpression", js.undefined)
    @scala.inline
    def setKeyConditions(value: KeyConditions): Self = this.set("KeyConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyConditions: Self = this.set("KeyConditions", js.undefined)
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setProjectionExpression(value: ProjectionExpression): Self = this.set("ProjectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionExpression: Self = this.set("ProjectionExpression", js.undefined)
    @scala.inline
    def setQueryFilter(value: FilterConditionMap): Self = this.set("QueryFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryFilter: Self = this.set("QueryFilter", js.undefined)
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
    @scala.inline
    def setScanIndexForward(value: BooleanObject): Self = this.set("ScanIndexForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanIndexForward: Self = this.set("ScanIndexForward", js.undefined)
    @scala.inline
    def setSelect(value: Select): Self = this.set("Select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("Select", js.undefined)
  }
  
}

