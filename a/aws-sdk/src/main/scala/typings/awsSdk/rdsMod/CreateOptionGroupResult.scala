package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOptionGroupResult extends StObject {
  
  var OptionGroup: js.UndefOr[typings.awsSdk.rdsMod.OptionGroup] = js.undefined
}
object CreateOptionGroupResult {
  
  inline def apply(): CreateOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptionGroupResult]
  }
  
  extension [Self <: CreateOptionGroupResult](x: Self) {
    
    inline def setOptionGroup(value: OptionGroup): Self = StObject.set(x, "OptionGroup", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupUndefined: Self = StObject.set(x, "OptionGroup", js.undefined)
  }
}
