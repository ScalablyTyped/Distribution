package typings.clownface.clownfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithSingleValue extends js.Object {
  var value: String
}

object WithSingleValue {
  @scala.inline
  def apply(value: String): WithSingleValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithSingleValue]
  }
}

