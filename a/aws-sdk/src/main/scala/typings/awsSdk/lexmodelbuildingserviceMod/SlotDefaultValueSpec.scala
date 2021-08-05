package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotDefaultValueSpec extends StObject {
  
  /**
    * The default values for a slot. You can specify more than one default. For example, you can specify a default value to use from a matching context variable, a session attribute, or a fixed value. The default value chosen is selected based on the order that you specify them in the list. For example, if you specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it is available, else it uses the fixed value.
    */
  var defaultValueList: SlotDefaultValueList
}
object SlotDefaultValueSpec {
  
  inline def apply(defaultValueList: SlotDefaultValueList): SlotDefaultValueSpec = {
    val __obj = js.Dynamic.literal(defaultValueList = defaultValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDefaultValueSpec]
  }
  
  extension [Self <: SlotDefaultValueSpec](x: Self) {
    
    inline def setDefaultValueList(value: SlotDefaultValueList): Self = StObject.set(x, "defaultValueList", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueListVarargs(value: SlotDefaultValue*): Self = StObject.set(x, "defaultValueList", js.Array(value :_*))
  }
}
