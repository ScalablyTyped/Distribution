package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparseObject extends js.Object {
  var data: String | js.Array[_]
  var fields: js.Array[_]
}

object UnparseObject {
  @scala.inline
  def apply(data: String | js.Array[_], fields: js.Array[_]): UnparseObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparseObject]
  }
}

