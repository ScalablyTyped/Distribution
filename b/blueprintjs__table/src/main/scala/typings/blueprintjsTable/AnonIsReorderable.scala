package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsReorderable extends js.Object {
  var isReorderable: Boolean
  var isResizable: Boolean
  var loading: Boolean
}

object AnonIsReorderable {
  @scala.inline
  def apply(isReorderable: Boolean, isResizable: Boolean, loading: Boolean): AnonIsReorderable = {
    val __obj = js.Dynamic.literal(isReorderable = isReorderable.asInstanceOf[js.Any], isResizable = isResizable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsReorderable]
  }
}

