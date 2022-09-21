package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accounts
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The list of accounts returned. If the filter results in an empty set then this array may have no records
    */
  var accounts: js.Array[CreationDate]
}
object Accounts {
  
  inline def apply(accounts: js.Array[CreationDate]): Accounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounts]
  }
  
  extension [Self <: Accounts](x: Self) {
    
    inline def setAccounts(value: js.Array[CreationDate]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: CreationDate*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
