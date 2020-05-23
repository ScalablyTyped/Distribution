package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsReorderable extends js.Object {
  var isReorderable: Boolean
  var isResizable: Boolean
  var loading: Boolean
}

object IsReorderable {
  @scala.inline
  def apply(isReorderable: Boolean, isResizable: Boolean, loading: Boolean): IsReorderable = {
    val __obj = js.Dynamic.literal(isReorderable = isReorderable.asInstanceOf[js.Any], isResizable = isResizable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReorderable]
  }
}

