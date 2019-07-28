package typings.axeDashCore.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedNode extends js.Object {
  var html: String
  var target: js.Array[String]
}

object RelatedNode {
  @scala.inline
  def apply(html: String, target: js.Array[String]): RelatedNode = {
    val __obj = js.Dynamic.literal(html = html, target = target)
  
    __obj.asInstanceOf[RelatedNode]
  }
}

