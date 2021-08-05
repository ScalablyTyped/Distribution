package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageInstruction extends StObject {
  
  /**
    * The usage instruction type for the value.
    */
  var Type: js.UndefOr[InstructionType] = js.undefined
  
  /**
    * The usage instruction value for this type.
    */
  var Value: js.UndefOr[InstructionValue] = js.undefined
}
object UsageInstruction {
  
  inline def apply(): UsageInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageInstruction]
  }
  
  extension [Self <: UsageInstruction](x: Self) {
    
    inline def setType(value: InstructionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: InstructionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
