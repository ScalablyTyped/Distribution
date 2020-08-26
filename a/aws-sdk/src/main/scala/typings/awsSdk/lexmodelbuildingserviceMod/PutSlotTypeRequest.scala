package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSlotTypeRequest extends js.Object {
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new slot type, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a slot type, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * When set to true a new numbered version of the slot type is created. This is the same as calling the CreateSlotTypeVersion operation. If you do not specify createVersion, the default is false.
    */
  var createVersion: js.UndefOr[Boolean] = js.native
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, which are additional values that help train the machine learning model about the values that it resolves for a slot.  When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not using a Lambda function you can choose to return the value that the user entered or the first value in the resolution list as the slot value. The valueSelectionStrategy field indicates the option to use. 
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.native
  /**
    * The name of the slot type. The name is not case sensitive.  The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example, because there is a built-in slot type called AMAZON.DATE, you can't create a custom slot type called DATE. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit.
    */
  var name: SlotTypeName = js.native
  /**
    * The built-in slot type used as the parent of the slot type. When you define a parent slot type, the new slot type has all of the same configuration as the parent. Only AMAZON.AlphaNumeric is supported.
    */
  var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.native
  /**
    * Configuration information that extends the parent built-in slot type. The configuration is added to the settings for the parent slot type.
    */
  var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations] = js.native
  /**
    * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to one of the following values:    ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to the slot value.    TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the resolution list as the slot type value. If there is no resolution list, null is returned.   If you don't specify the valueSelectionStrategy, the default is ORIGINAL_VALUE.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.native
}

object PutSlotTypeRequest {
  @scala.inline
  def apply(name: SlotTypeName): PutSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSlotTypeRequest]
  }
  @scala.inline
  implicit class PutSlotTypeRequestOps[Self <: PutSlotTypeRequest] (val x: Self) extends AnyVal {
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
    def setName(value: SlotTypeName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    @scala.inline
    def setCreateVersion(value: Boolean): Self = this.set("createVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateVersion: Self = this.set("createVersion", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnumerationValuesVarargs(value: EnumerationValue*): Self = this.set("enumerationValues", js.Array(value :_*))
    @scala.inline
    def setEnumerationValues(value: EnumerationValues): Self = this.set("enumerationValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumerationValues: Self = this.set("enumerationValues", js.undefined)
    @scala.inline
    def setParentSlotTypeSignature(value: CustomOrBuiltinSlotTypeName): Self = this.set("parentSlotTypeSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentSlotTypeSignature: Self = this.set("parentSlotTypeSignature", js.undefined)
    @scala.inline
    def setSlotTypeConfigurationsVarargs(value: SlotTypeConfiguration*): Self = this.set("slotTypeConfigurations", js.Array(value :_*))
    @scala.inline
    def setSlotTypeConfigurations(value: SlotTypeConfigurations): Self = this.set("slotTypeConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotTypeConfigurations: Self = this.set("slotTypeConfigurations", js.undefined)
    @scala.inline
    def setValueSelectionStrategy(value: SlotValueSelectionStrategy): Self = this.set("valueSelectionStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSelectionStrategy: Self = this.set("valueSelectionStrategy", js.undefined)
  }
  
}

