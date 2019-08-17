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
    val __obj = js.Dynamic.literal(members = members, required = required)
    __obj.updateDynamic("type")(`type`)
    if (exceptionCode != null) __obj.updateDynamic("exceptionCode")(exceptionCode)
    if (exceptionType != null) __obj.updateDynamic("exceptionType")(exceptionType)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[Structure]
  }
}

