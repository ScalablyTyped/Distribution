package typings.deoxxaContentType.ContentType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var params: js.Any
  var q: js.UndefOr[Double] = js.undefined
  var `type`: String
}

object MediaType {
  @scala.inline
  def apply(params: js.Any, `type`: String, q: Int | Double = null): MediaType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
}

