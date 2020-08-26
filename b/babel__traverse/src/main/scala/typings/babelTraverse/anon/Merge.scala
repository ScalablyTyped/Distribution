package typings.babelTraverse.anon

import typings.babelTraverse.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Merge extends js.Object {
  def merge(visitors: js.Array[Visitor[js.Object]]): Visitor[js.Object] = js.native
}

object Merge {
  @scala.inline
  def apply(merge: js.Array[Visitor[js.Object]] => Visitor[js.Object]): Merge = {
    val __obj = js.Dynamic.literal(merge = js.Any.fromFunction1(merge))
    __obj.asInstanceOf[Merge]
  }
  @scala.inline
  implicit class MergeOps[Self <: Merge] (val x: Self) extends AnyVal {
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
    def setMerge(value: js.Array[Visitor[js.Object]] => Visitor[js.Object]): Self = this.set("merge", js.Any.fromFunction1(value))
  }
  
}

