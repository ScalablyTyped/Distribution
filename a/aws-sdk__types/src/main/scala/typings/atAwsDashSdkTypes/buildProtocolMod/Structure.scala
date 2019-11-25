package typings.atAwsDashSdkTypes.buildProtocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Structure
  extends Shape
     with SerializationModel {
  var exceptionCode: js.UndefOr[java.lang.String] = js.undefined
  var exceptionType: js.UndefOr[java.lang.String] = js.undefined
  var members: StringDictionary[Member]
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var required: js.Array[java.lang.String]
  @JSName("type")
  var type_Structure: structure
}

object Structure {
  @scala.inline
  def apply(
    members: StringDictionary[Member],
    required: js.Array[java.lang.String],
    `type`: structure,
    exceptionCode: java.lang.String = null,
    exceptionType: java.lang.String = null,
    payload: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exceptionCode != null) __obj.updateDynamic("exceptionCode")(exceptionCode.asInstanceOf[js.Any])
    if (exceptionType != null) __obj.updateDynamic("exceptionType")(exceptionType.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure]
  }
}

