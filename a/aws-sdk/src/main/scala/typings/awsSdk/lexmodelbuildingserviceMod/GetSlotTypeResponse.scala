package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSlotTypeResponse extends js.Object {
  /**
    * Checksum of the $LATEST version of the slot type.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The date that the slot type was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take.
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.native
  /**
    * The date that the slot type was updated. When you create a resource, the creation date and last update date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.native
  /**
    * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.native
  /**
    * The version of the slot type.
    */
  var version: js.UndefOr[Version] = js.native
}

object GetSlotTypeResponse {
  @scala.inline
  def apply(
    checksum: String = null,
    createdDate: Timestamp = null,
    description: Description = null,
    enumerationValues: EnumerationValues = null,
    lastUpdatedDate: Timestamp = null,
    name: SlotTypeName = null,
    valueSelectionStrategy: SlotValueSelectionStrategy = null,
    version: Version = null
  ): GetSlotTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enumerationValues != null) __obj.updateDynamic("enumerationValues")(enumerationValues.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (valueSelectionStrategy != null) __obj.updateDynamic("valueSelectionStrategy")(valueSelectionStrategy.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypeResponse]
  }
}

