package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Structure
  extends ShapeDef
     with ComplexShape
     with Shape {
  var error: js.UndefOr[Error] = js.undefined
  var exception: js.UndefOr[scala.Boolean] = js.undefined
  var fault: js.UndefOr[scala.Boolean] = js.undefined
  var members: StringDictionary[StructureMember]
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var topLevel: js.UndefOr[input | output] = js.undefined
  @JSName("type")
  val type_Structure: structure
}

object Structure {
  @scala.inline
  def apply(
    members: StringDictionary[StructureMember],
    `type`: structure,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    error: Error = null,
    exception: js.UndefOr[scala.Boolean] = js.undefined,
    fault: js.UndefOr[scala.Boolean] = js.undefined,
    payload: java.lang.String = null,
    required: js.Array[java.lang.String] = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    topLevel: input | output = null
  ): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exception)) __obj.updateDynamic("exception")(exception.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fault)) __obj.updateDynamic("fault")(fault.get.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    if (topLevel != null) __obj.updateDynamic("topLevel")(topLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure]
  }
}

