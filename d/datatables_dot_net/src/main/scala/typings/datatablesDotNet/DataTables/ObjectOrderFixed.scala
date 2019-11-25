package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOrderFixed extends js.Object {
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var post: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var pre: js.UndefOr[js.Array[_]] = js.undefined
}

object ObjectOrderFixed {
  @scala.inline
  def apply(post: js.Array[_] = null, pre: js.Array[_] = null): ObjectOrderFixed = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOrderFixed]
  }
}

