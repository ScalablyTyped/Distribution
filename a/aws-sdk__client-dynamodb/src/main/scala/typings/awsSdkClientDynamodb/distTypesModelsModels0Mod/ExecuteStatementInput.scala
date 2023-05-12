package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementInput extends StObject {
  
  /**
    * <p>The consistency of a read operation. If set to <code>true</code>, then a strongly
    *             consistent read is used; otherwise, an eventually consistent read is used.</p>
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>The maximum number of items to evaluate (not necessarily the number of matching
    *             items). If DynamoDB processes the number of items up to the limit while processing the
    *             results, it stops the operation and returns the matching values up to that point, along
    *             with a key in <code>LastEvaluatedKey</code> to apply in a subsequent operation so you
    *             can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before
    *             DynamoDB reaches this limit, it stops the operation and returns the matching values up
    *             to the limit, and a key in <code>LastEvaluatedKey</code> to apply in a subsequent
    *             operation to continue the operation. </p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Set this value to get remaining results, if <code>NextToken</code> was returned in the
    *             statement response.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The parameters for the PartiQL statement, if any.</p>
    */
  var Parameters: js.UndefOr[js.Array[AttributeValue]] = js.undefined
  
  /**
    * <p>Determines the level of detail about either provisioned or on-demand throughput
    *             consumption that is returned in the response:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>INDEXES</code> - The response includes the aggregate
    *                         <code>ConsumedCapacity</code> for the operation, together with
    *                         <code>ConsumedCapacity</code> for each table and secondary index that was
    *                     accessed.</p>
    *                <p>Note that some operations, such as <code>GetItem</code> and
    *                         <code>BatchGetItem</code>, do not access any indexes at all. In these cases,
    *                     specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code>
    *                     information for table(s).</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>TOTAL</code> - The response includes only the aggregate
    *                         <code>ConsumedCapacity</code> for the operation.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the
    *                     response.</p>
    *             </li>
    *          </ul>
    */
  var ReturnConsumedCapacity: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
  ] = js.undefined
  
  /**
    * <p>The PartiQL statement representing the operation to run.</p>
    */
  var Statement: js.UndefOr[String] = js.undefined
}
object ExecuteStatementInput {
  
  inline def apply(): ExecuteStatementInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteStatementInput] (val x: Self) extends AnyVal {
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameters(value: js.Array[AttributeValue]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
