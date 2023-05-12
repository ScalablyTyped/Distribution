package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteTransactionInput extends StObject {
  
  /**
    * <p>Set this value to get remaining results, if <code>NextToken</code> was returned in the
    *             statement response.</p>
    */
  var ClientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Determines the level of detail about either provisioned or on-demand throughput
    *             consumption that is returned in the response. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactGetItems.html">TransactGetItems</a> and <a href="https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_TransactWriteItems.html">TransactWriteItems</a>.</p>
    */
  var ReturnConsumedCapacity: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
  ] = js.undefined
  
  /**
    * <p>The list of PartiQL statements representing the transaction to run.</p>
    */
  var TransactStatements: js.UndefOr[js.Array[ParameterizedStatement]] = js.undefined
}
object ExecuteTransactionInput {
  
  inline def apply(): ExecuteTransactionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteTransactionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteTransactionInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setTransactStatements(value: js.Array[ParameterizedStatement]): Self = StObject.set(x, "TransactStatements", value.asInstanceOf[js.Any])
    
    inline def setTransactStatementsUndefined: Self = StObject.set(x, "TransactStatements", js.undefined)
    
    inline def setTransactStatementsVarargs(value: ParameterizedStatement*): Self = StObject.set(x, "TransactStatements", js.Array(value*))
  }
}
