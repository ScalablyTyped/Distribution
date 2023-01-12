package typings.consumerDataStandards.anon

import typings.consumerDataStandards.energyMod.EnergyBillingTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionsArray extends StObject {
  
  /**
    * Array of transactions sorted by date and time in descending order
    */
  var transactions: js.Array[EnergyBillingTransaction]
}
object TransactionsArray {
  
  inline def apply(transactions: js.Array[EnergyBillingTransaction]): TransactionsArray = {
    val __obj = js.Dynamic.literal(transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionsArray] (val x: Self) extends AnyVal {
    
    inline def setTransactions(value: js.Array[EnergyBillingTransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: EnergyBillingTransaction*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}
