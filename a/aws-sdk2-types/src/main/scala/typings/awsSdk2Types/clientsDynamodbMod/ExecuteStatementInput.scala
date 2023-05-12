package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementInput extends StObject {
  
  /**
    * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
    */
  var ConsistentRead: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ConsistentRead] = js.undefined
  
  /**
    * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, along with a key in LastEvaluatedKey to apply in a subsequent operation so you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. 
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  
  /**
    * Set this value to get remaining results, if NextToken was returned in the statement response.
    */
  var NextToken: js.UndefOr[PartiQLNextToken] = js.undefined
  
  /**
    * The parameters for the PartiQL statement, if any.
    */
  var Parameters: js.UndefOr[PreparedStatementParameters] = js.undefined
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  /**
    * The PartiQL statement representing the operation to run.
    */
  var Statement: PartiQLStatement
}
object ExecuteStatementInput {
  
  inline def apply(Statement: PartiQLStatement): ExecuteStatementInput = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteStatementInput] (val x: Self) extends AnyVal {
    
    inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: PartiQLNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameters(value: PreparedStatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setStatement(value: PartiQLStatement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
  }
}
