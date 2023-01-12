package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payees
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The list of payees returned
    */
  var payees: js.Array[Nickname]
}
object Payees {
  
  inline def apply(payees: js.Array[Nickname]): Payees = {
    val __obj = js.Dynamic.literal(payees = payees.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payees]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payees] (val x: Self) extends AnyVal {
    
    inline def setPayees(value: js.Array[Nickname]): Self = StObject.set(x, "payees", value.asInstanceOf[js.Any])
    
    inline def setPayeesVarargs(value: Nickname*): Self = StObject.set(x, "payees", js.Array(value*))
  }
}
