package typings.chance.Chance

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  comparator :(array : std.Array<T>, value : T): boolean | undefined} & chance.Chance.Options */
@js.native
trait UniqueOptions[T]
  extends /* id */ StringDictionary[js.Any] {
  var comparator: js.UndefOr[js.Function2[/* array */ js.Array[T], /* value */ T, Boolean]] = js.native
}

object UniqueOptions {
  @scala.inline
  def apply[T](): UniqueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueOptions[T]]
  }
  @scala.inline
  implicit class UniqueOptionsOps[Self <: UniqueOptions[_], T] (val x: Self with UniqueOptions[T]) extends AnyVal {
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
    def setComparator(value: (/* array */ js.Array[T], /* value */ T) => Boolean): Self = this.set("comparator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
  }
  
}

