package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootNodeName extends js.Object {
  var componentProperty: String
  var rootNodeName: String
  var states: js.Array[String]
}

object RootNodeName {
  @scala.inline
  def apply(componentProperty: String, rootNodeName: String, states: js.Array[String]): RootNodeName = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeName]
  }
}

