package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeContext extends js.Object {
  var nodeType: java.lang.String
  var propertyName: java.lang.String
}

object NodeContext {
  @scala.inline
  def apply(nodeType: java.lang.String, propertyName: java.lang.String): NodeContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("propertyName")(propertyName)
    __obj.asInstanceOf[NodeContext]
  }
}

