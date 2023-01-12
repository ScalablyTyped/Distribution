package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transactions
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var transactions: js.Array[BillerName]
}
object Transactions {
  
  inline def apply(transactions: js.Array[BillerName]): Transactions = {
    val __obj = js.Dynamic.literal(transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transactions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transactions] (val x: Self) extends AnyVal {
    
    inline def setTransactions(value: js.Array[BillerName]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: BillerName*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}
