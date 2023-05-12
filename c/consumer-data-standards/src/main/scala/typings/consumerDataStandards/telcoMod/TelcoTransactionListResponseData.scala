package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.ExecutionDateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoTransactionListResponseData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of transactions sorted by date and time in descending order
    */
  var transactions: js.Array[ExecutionDateTime]
}
object TelcoTransactionListResponseData {
  
  inline def apply(transactions: js.Array[ExecutionDateTime]): TelcoTransactionListResponseData = {
    val __obj = js.Dynamic.literal(transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoTransactionListResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoTransactionListResponseData] (val x: Self) extends AnyVal {
    
    inline def setTransactions(value: js.Array[ExecutionDateTime]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: ExecutionDateTime*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}
