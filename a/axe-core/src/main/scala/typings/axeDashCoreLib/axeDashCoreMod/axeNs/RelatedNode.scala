package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedNode extends js.Object {
  var html: java.lang.String
  var target: js.Array[java.lang.String]
}

object RelatedNode {
  @scala.inline
  def apply(html: java.lang.String, target: js.Array[java.lang.String]): RelatedNode = {
    val __obj = js.Dynamic.literal(html = html, target = target)
  
    __obj.asInstanceOf[RelatedNode]
  }
}

