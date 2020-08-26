package typings.d3Quadtree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadtreeLeaf[T] extends js.Object {
  /**
    * The data associated with this point, as passed to quadtree.add.
    */
  var data: T = js.native
  /**
    * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
    */
  var length: js.UndefOr[scala.Nothing] = js.native
  /**
    * The next datum in this leaf, if any.
    */
  var next: js.UndefOr[QuadtreeLeaf[T]] = js.native
}

object QuadtreeLeaf {
  @scala.inline
  def apply[T](data: T): QuadtreeLeaf[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadtreeLeaf[T]]
  }
  @scala.inline
  implicit class QuadtreeLeafOps[Self <: QuadtreeLeaf[_], T] (val x: Self with QuadtreeLeaf[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: QuadtreeLeaf[T]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

