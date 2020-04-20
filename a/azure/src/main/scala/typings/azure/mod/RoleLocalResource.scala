package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleLocalResource extends js.Object {
  var maximumSizeInMegabytes: Double
  var name: String
  var path: String
}

object RoleLocalResource {
  @scala.inline
  def apply(maximumSizeInMegabytes: Double, name: String, path: String): RoleLocalResource = {
    val __obj = js.Dynamic.literal(maximumSizeInMegabytes = maximumSizeInMegabytes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleLocalResource]
  }
}

