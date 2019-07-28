package typings.coinbase.coinbaseMod

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
    val __obj = js.Dynamic.literal(id = id, resource = resource, resource_path = resource_path)
  
    __obj.asInstanceOf[ResourceRef]
  }
}

