package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleLocalResource extends js.Object {
  var maximumSizeInMegabytes: scala.Double
  var name: java.lang.String
  var path: java.lang.String
}

object RoleLocalResource {
  @scala.inline
  def apply(maximumSizeInMegabytes: scala.Double, name: java.lang.String, path: java.lang.String): RoleLocalResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maximumSizeInMegabytes")(maximumSizeInMegabytes)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RoleLocalResource]
  }
}

