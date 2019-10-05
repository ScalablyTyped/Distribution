package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeContext extends js.Object {
  var nodeType: String
  var propertyName: String
}

object NodeContext {
  @scala.inline
  def apply(nodeType: String, propertyName: String): NodeContext = {
    val __obj = js.Dynamic.literal(nodeType = nodeType, propertyName = propertyName)
  
    __obj.asInstanceOf[NodeContext]
  }
}

