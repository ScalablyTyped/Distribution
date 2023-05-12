package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkTransactions
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of transactions sorted by date and time in descending order
    */
  var transactions: js.Array[ExecutionDateTime]
}
object DictkTransactions {
  
  inline def apply(transactions: js.Array[ExecutionDateTime]): DictkTransactions = {
    val __obj = js.Dynamic.literal(transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkTransactions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkTransactions] (val x: Self) extends AnyVal {
    
    inline def setTransactions(value: js.Array[ExecutionDateTime]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: ExecutionDateTime*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}
