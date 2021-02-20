package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageInstruction extends StObject {
  
  /**
    * The usage instruction type for the value.
    */
  var Type: js.UndefOr[InstructionType] = js.native
  
  /**
    * The usage instruction value for this type.
    */
  var Value: js.UndefOr[InstructionValue] = js.native
}
object UsageInstruction {
  
  @scala.inline
  def apply(): UsageInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageInstruction]
  }
  
  @scala.inline
  implicit class UsageInstructionMutableBuilder[Self <: UsageInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InstructionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: InstructionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
