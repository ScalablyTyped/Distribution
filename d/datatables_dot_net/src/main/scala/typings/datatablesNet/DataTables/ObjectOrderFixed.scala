package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectOrderFixed extends js.Object {
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var post: js.UndefOr[js.Array[_]] = js.native
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var pre: js.UndefOr[js.Array[_]] = js.native
}

object ObjectOrderFixed {
  @scala.inline
  def apply(): ObjectOrderFixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOrderFixed]
  }
  @scala.inline
  implicit class ObjectOrderFixedOps[Self <: ObjectOrderFixed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPostVarargs(value: js.Any*): Self = this.set("post", js.Array(value :_*))
    @scala.inline
    def setPost(value: js.Array[_]): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    @scala.inline
    def setPreVarargs(value: js.Any*): Self = this.set("pre", js.Array(value :_*))
    @scala.inline
    def setPre(value: js.Array[_]): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
  }
  
}

