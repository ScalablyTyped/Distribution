package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.input
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.list
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.map
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.output
import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.List
  - typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.Map
  - typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.Structure
*/
trait ComplexShape extends js.Object

object ComplexShape {
  @scala.inline
  def List(
    member: Member,
    `type`: list,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): ComplexShape = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexShape]
  }
  @scala.inline
  def Map(
    key: Member,
    `type`: map,
    value: Member,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): ComplexShape = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexShape]
  }
  @scala.inline
  def Structure(
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
  ): ComplexShape = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exception)) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (!js.isUndefined(fault)) __obj.updateDynamic("fault")(fault.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (topLevel != null) __obj.updateDynamic("topLevel")(topLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexShape]
  }
}

