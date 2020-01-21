package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRef extends js.Object {
  var id: String
  var resource: ResourceType
  var resource_path: String
}

object ResourceRef {
  @scala.inline
  def apply(id: String, resource: ResourceType, resource_path: String): ResourceRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resource_path = resource_path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceRef]
  }
}

