package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var targetType: String
  var value: String
}

object AnonName {
  @scala.inline
  def apply(name: String, targetType: String, value: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

