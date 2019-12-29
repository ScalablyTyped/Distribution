package typings.atAwsDashSdkTypes.buildProtocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.blob
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.boolean
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.float
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.integer
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.list
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.map
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.string
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.structure
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkTypes.buildProtocolMod.Blob
  - typings.atAwsDashSdkTypes.buildProtocolMod.Boolean
  - typings.atAwsDashSdkTypes.buildProtocolMod.Float
  - typings.atAwsDashSdkTypes.buildProtocolMod.Integer
  - typings.atAwsDashSdkTypes.buildProtocolMod.List
  - typings.atAwsDashSdkTypes.buildProtocolMod.Map
  - typings.atAwsDashSdkTypes.buildProtocolMod.String
  - typings.atAwsDashSdkTypes.buildProtocolMod.Structure
  - typings.atAwsDashSdkTypes.buildProtocolMod.Timestamp
*/
trait SerializationModel extends js.Object

object SerializationModel {
  @scala.inline
  def Map(
    key: Member,
    `type`: map,
    value: Member,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def List(
    member: Member,
    `type`: list,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    min: Int | Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def String(
    `type`: string,
    idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined,
    jsonValue: js.UndefOr[scala.Boolean] = js.undefined,
    min: Int | Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Blob(
    `type`: blob,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    streaming: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Timestamp(
    `type`: timestamp,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    timestampFormat: java.lang.String = null
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Integer(`type`: integer, min: Int | Double = null, sensitive: js.UndefOr[scala.Boolean] = js.undefined): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Structure(
    members: StringDictionary[Member],
    required: js.Array[java.lang.String],
    `type`: structure,
    exceptionCode: java.lang.String = null,
    exceptionType: java.lang.String = null,
    payload: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exceptionCode != null) __obj.updateDynamic("exceptionCode")(exceptionCode.asInstanceOf[js.Any])
    if (exceptionType != null) __obj.updateDynamic("exceptionType")(exceptionType.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Float(`type`: float, min: Int | Double = null, sensitive: js.UndefOr[scala.Boolean] = js.undefined): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Boolean(`type`: boolean, sensitive: js.UndefOr[scala.Boolean] = js.undefined): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
}

