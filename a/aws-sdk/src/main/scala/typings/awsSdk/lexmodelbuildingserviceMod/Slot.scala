package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends js.Object {
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
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: SlotName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotConstraint(value: SlotConstraint): Self = this.set("slotConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setObfuscationSetting(value: ObfuscationSetting): Self = this.set("obfuscationSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObfuscationSetting: Self = this.set("obfuscationSetting", js.undefined)
    @scala.inline
    def setPriority(value: Priority): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setResponseCard(value: ResponseCard): Self = this.set("responseCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCard: Self = this.set("responseCard", js.undefined)
    @scala.inline
    def setSampleUtterancesVarargs(value: Utterance*): Self = this.set("sampleUtterances", js.Array(value :_*))
    @scala.inline
    def setSampleUtterances(value: SlotUtteranceList): Self = this.set("sampleUtterances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleUtterances: Self = this.set("sampleUtterances", js.undefined)
    @scala.inline
    def setSlotType(value: CustomOrBuiltinSlotTypeName): Self = this.set("slotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotType: Self = this.set("slotType", js.undefined)
    @scala.inline
    def setSlotTypeVersion(value: Version): Self = this.set("slotTypeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotTypeVersion: Self = this.set("slotTypeVersion", js.undefined)
    @scala.inline
    def setValueElicitationPrompt(value: Prompt): Self = this.set("valueElicitationPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueElicitationPrompt: Self = this.set("valueElicitationPrompt", js.undefined)
  }
  
}

