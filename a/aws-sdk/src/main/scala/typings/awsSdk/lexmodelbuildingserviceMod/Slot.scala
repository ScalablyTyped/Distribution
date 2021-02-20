package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slot extends StObject {
  
  /**
    * A list of default values for the slot. Default values are used when Amazon Lex hasn't determined a value for a slot. You can specify default values from context variables, session attributes, and defined values.
    */
  var defaultValueSpec: js.UndefOr[SlotDefaultValueSpec] = js.native
  
  /**
    * A description of the slot.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The name of the slot.
    */
  var name: SlotName = js.native
  
  /**
    * Determines whether a slot is obfuscated in conversation logs and stored utterances. When you obfuscate a slot, the value is replaced by the slot name in curly braces ({}). For example, if the slot name is "full_name", obfuscated values are replaced with "{full_name}". For more information, see  Slot Obfuscation . 
    */
  var obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.native
  
  /**
    *  Directs Amazon Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots with priorities 1 and 2, AWS Amazon Lex first elicits a value for the slot with priority 1. If multiple slots share the same priority, the order in which Amazon Lex elicits values is arbitrary.
    */
  var priority: js.UndefOr[Priority] = js.native
  
  /**
    *  A set of possible responses for the slot type used by text-based clients. A user chooses an option from the response card, instead of using text to reply. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
  
  /**
    *  If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of understanding user utterances. 
    */
  var sampleUtterances: js.UndefOr[SlotUtteranceList] = js.native
  
  /**
    * Specifies whether the slot is required or optional. 
    */
  var slotConstraint: SlotConstraint = js.native
  
  /**
    * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
    */
  var slotType: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.native
  
  /**
    * The version of the slot type.
    */
  var slotTypeVersion: js.UndefOr[Version] = js.native
  
  /**
    * The prompt that Amazon Lex uses to elicit the slot value from the user.
    */
  var valueElicitationPrompt: js.UndefOr[Prompt] = js.native
}
object Slot {
  
  @scala.inline
  def apply(name: SlotName, slotConstraint: SlotConstraint): Slot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slotConstraint = slotConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  
  @scala.inline
  implicit class SlotMutableBuilder[Self <: Slot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValueSpec(value: SlotDefaultValueSpec): Self = StObject.set(x, "defaultValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueSpecUndefined: Self = StObject.set(x, "defaultValueSpec", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: SlotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObfuscationSetting(value: ObfuscationSetting): Self = StObject.set(x, "obfuscationSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObfuscationSettingUndefined: Self = StObject.set(x, "obfuscationSetting", js.undefined)
    
    @scala.inline
    def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setResponseCard(value: ResponseCard): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
    
    @scala.inline
    def setSampleUtterances(value: SlotUtteranceList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setSlotConstraint(value: SlotConstraint): Self = StObject.set(x, "slotConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotType(value: CustomOrBuiltinSlotTypeName): Self = StObject.set(x, "slotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTypeUndefined: Self = StObject.set(x, "slotType", js.undefined)
    
    @scala.inline
    def setSlotTypeVersion(value: Version): Self = StObject.set(x, "slotTypeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTypeVersionUndefined: Self = StObject.set(x, "slotTypeVersion", js.undefined)
    
    @scala.inline
    def setValueElicitationPrompt(value: Prompt): Self = StObject.set(x, "valueElicitationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueElicitationPromptUndefined: Self = StObject.set(x, "valueElicitationPrompt", js.undefined)
  }
}
