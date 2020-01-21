package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasType extends js.Object {
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The paths for an alias.
    */
  var paths: js.UndefOr[js.Array[AliasPathType]] = js.undefined
}

object AliasType {
  @scala.inline
  def apply(name: String = null, paths: js.Array[AliasPathType] = null): AliasType = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasType]
  }
}

