package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpenseGroupProperty extends StObject {
  
  /**
    * Provides a group Id number, which will be the same for each in the group.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * Informs you on whether the expense group is a name or an address.
    */
  var Types: js.UndefOr[StringList] = js.undefined
}
object ExpenseGroupProperty {
  
  inline def apply(): ExpenseGroupProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpenseGroupProperty]
  }
  
  extension [Self <: ExpenseGroupProperty](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTypes(value: StringList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "Types", js.Array(value*))
  }
}
