package typings.azure.azureMod

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
    val __obj = js.Dynamic.literal(maximumSizeInMegabytes = maximumSizeInMegabytes, name = name, path = path)
  
    __obj.asInstanceOf[RoleLocalResource]
  }
}

