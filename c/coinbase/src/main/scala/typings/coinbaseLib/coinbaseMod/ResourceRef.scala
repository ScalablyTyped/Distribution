package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRef extends js.Object {
  var id: java.lang.String
  var resource: ResourceType
  var resource_path: java.lang.String
}

object ResourceRef {
  @scala.inline
  def apply(id: java.lang.String, resource: ResourceType, resource_path: java.lang.String): ResourceRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("resource_path")(resource_path)
    __obj.asInstanceOf[ResourceRef]
  }
}

