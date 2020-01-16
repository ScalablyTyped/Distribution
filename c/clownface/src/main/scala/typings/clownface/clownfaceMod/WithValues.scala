package typings.clownface.clownfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithValues extends js.Object {
  var value: js.Array[String]
}

object WithValues {
  @scala.inline
  def apply(value: js.Array[String]): WithValues = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithValues]
  }
}

