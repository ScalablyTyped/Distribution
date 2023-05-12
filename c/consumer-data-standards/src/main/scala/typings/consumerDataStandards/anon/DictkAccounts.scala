package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkAccounts
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The list of accounts returned. If the filter results in an empty set then this array may have no records
    */
  var accounts: js.Array[AccountOwnership]
}
object DictkAccounts {
  
  inline def apply(accounts: js.Array[AccountOwnership]): DictkAccounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkAccounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkAccounts] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[AccountOwnership]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: AccountOwnership*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
