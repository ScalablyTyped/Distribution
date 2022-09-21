package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISerializedGast extends StObject {
  
  var definition: js.UndefOr[js.Array[ISerializedGast]] = js.undefined
  
  var `type`: typings.chevrotainTypes.chevrotainTypesStrings.NonTerminal | typings.chevrotainTypes.chevrotainTypesStrings.Alternative | typings.chevrotainTypes.chevrotainTypesStrings.Option | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatory | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatoryWithSeparator | typings.chevrotainTypes.chevrotainTypesStrings.Repetition | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionWithSeparator | typings.chevrotainTypes.chevrotainTypesStrings.Alternation | typings.chevrotainTypes.chevrotainTypesStrings.Terminal | typings.chevrotainTypes.chevrotainTypesStrings.Rule
}
object ISerializedGast {
  
  inline def apply(
    `type`: typings.chevrotainTypes.chevrotainTypesStrings.NonTerminal | typings.chevrotainTypes.chevrotainTypesStrings.Alternative | typings.chevrotainTypes.chevrotainTypesStrings.Option | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatory | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatoryWithSeparator | typings.chevrotainTypes.chevrotainTypesStrings.Repetition | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionWithSeparator | typings.chevrotainTypes.chevrotainTypesStrings.Alternation | typings.chevrotainTypes.chevrotainTypesStrings.Terminal | typings.chevrotainTypes.chevrotainTypesStrings.Rule
  ): ISerializedGast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerializedGast]
  }
  
  extension [Self <: ISerializedGast](x: Self) {
    
    inline def setDefinition(value: js.Array[ISerializedGast]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: ISerializedGast*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setType(
      value: typings.chevrotainTypes.chevrotainTypesStrings.NonTerminal | typings.chevrotainTypes.chevrotainTypesStrings.Alternative | typings.chevrotainTypes.chevrotainTypesStrings.Option | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatory | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatoryWithSeparator | typings.chevrotainTypes.chevrotainTypesStrings.Repetition | typings.chevrotainTypes.chevrotainTypesStrings.RepetitionWithSeparator | typings.chevrotainTypes.chevrotainTypesStrings.Alternation | typings.chevrotainTypes.chevrotainTypesStrings.Terminal | typings.chevrotainTypes.chevrotainTypesStrings.Rule
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
