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
  var transactions: js.Array[Demand]
}
object DictkTransactions {
  
  inline def apply(transactions: js.Array[Demand]): DictkTransactions = {
    val __obj = js.Dynamic.literal(transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkTransactions]
  }
  
  extension [Self <: DictkTransactions](x: Self) {
    
    inline def setTransactions(value: js.Array[Demand]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: Demand*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}
