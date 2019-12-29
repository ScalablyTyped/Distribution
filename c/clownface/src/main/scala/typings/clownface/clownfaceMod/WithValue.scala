package typings.clownface.clownfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithValue extends js.Object {
  var value: String | js.Array[String]
}

object WithValue {
  @scala.inline
  def apply(value: String | js.Array[String]): WithValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithValue]
  }
}

