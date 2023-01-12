package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkBalance
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The current balance of the account.  A positive value indicates that amount is owing to be paid.  A negative value indicates that the account is in credit
    */
  var balance: String
}
object DictkBalance {
  
  inline def apply(balance: String): DictkBalance = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkBalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkBalance] (val x: Self) extends AnyVal {
    
    inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
  }
}
