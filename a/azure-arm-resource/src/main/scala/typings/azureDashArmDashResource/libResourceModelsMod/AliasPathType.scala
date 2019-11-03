package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasPathType extends js.Object {
  /**
    * The API versions.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The path of an alias.
    */
  var path: js.UndefOr[String] = js.undefined
}

object AliasPathType {
  @scala.inline
  def apply(apiVersions: js.Array[String] = null, path: String = null): AliasPathType = {
    val __obj = js.Dynamic.literal()
    if (apiVersions != null) __obj.updateDynamic("apiVersions")(apiVersions)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[AliasPathType]
  }
}

