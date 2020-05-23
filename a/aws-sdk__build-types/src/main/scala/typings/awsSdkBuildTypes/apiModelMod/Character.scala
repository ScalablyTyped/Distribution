package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.character
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Character
  extends ShapeDef
     with Shape {
  @JSName("type")
  val type_Character: character
}

object Character {
  @scala.inline
  def apply(
    `type`: character,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Character = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Character]
  }
}

