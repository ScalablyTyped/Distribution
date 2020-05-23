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
    *  Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
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
  def apply(
    name: SlotName,
    slotConstraint: SlotConstraint,
    description: Description = null,
    obfuscationSetting: ObfuscationSetting = null,
    priority: js.UndefOr[Priority] = js.undefined,
    responseCard: ResponseCard = null,
    sampleUtterances: SlotUtteranceList = null,
    slotType: CustomOrBuiltinSlotTypeName = null,
    slotTypeVersion: Version = null,
    valueElicitationPrompt: Prompt = null
  ): Slot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slotConstraint = slotConstraint.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (obfuscationSetting != null) __obj.updateDynamic("obfuscationSetting")(obfuscationSetting.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    if (sampleUtterances != null) __obj.updateDynamic("sampleUtterances")(sampleUtterances.asInstanceOf[js.Any])
    if (slotType != null) __obj.updateDynamic("slotType")(slotType.asInstanceOf[js.Any])
    if (slotTypeVersion != null) __obj.updateDynamic("slotTypeVersion")(slotTypeVersion.asInstanceOf[js.Any])
    if (valueElicitationPrompt != null) __obj.updateDynamic("valueElicitationPrompt")(valueElicitationPrompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
}

