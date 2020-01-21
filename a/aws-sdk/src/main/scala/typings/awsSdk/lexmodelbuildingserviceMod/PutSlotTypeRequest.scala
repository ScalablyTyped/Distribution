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
    * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to one of the following values:    ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to the slot value.    TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the resolution list as the slot type value. If there is no resolution list, null is returned.   If you don't specify the valueSelectionStrategy, the default is ORIGINAL_VALUE.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.native
}

object PutSlotTypeRequest {
  @scala.inline
  def apply(
    name: SlotTypeName,
    checksum: String = null,
    createVersion: js.UndefOr[scala.Boolean] = js.undefined,
    description: Description = null,
    enumerationValues: EnumerationValues = null,
    valueSelectionStrategy: SlotValueSelectionStrategy = null
  ): PutSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (!js.isUndefined(createVersion)) __obj.updateDynamic("createVersion")(createVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enumerationValues != null) __obj.updateDynamic("enumerationValues")(enumerationValues.asInstanceOf[js.Any])
    if (valueSelectionStrategy != null) __obj.updateDynamic("valueSelectionStrategy")(valueSelectionStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSlotTypeRequest]
  }
}

