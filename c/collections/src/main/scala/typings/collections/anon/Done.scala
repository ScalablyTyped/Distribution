package typings.collections.anon

import typings.collections.collectionsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done[T] extends js.Object {
  var done: `true`
  var value: js.UndefOr[T | Null] = js.undefined
}

object Done {
  @scala.inline
  def apply[T](done: `true`, value: js.UndefOr[Null | T] = js.undefined): Done[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[T]]
  }
}

