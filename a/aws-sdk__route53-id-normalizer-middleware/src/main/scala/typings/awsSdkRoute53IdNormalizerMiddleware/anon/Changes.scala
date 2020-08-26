package typings.awsSdkRoute53IdNormalizerMiddleware.anon

import typings.awsSdkRoute53IdNormalizerMiddleware.mod.Change
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changes extends js.Object {
  var Changes: Iterable[Change] = js.native
}

object Changes {
  @scala.inline
  def apply(Changes: Iterable[Change]): Changes = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
  @scala.inline
  implicit class ChangesOps[Self <: Changes] (val x: Self) extends AnyVal {
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
    def setChanges(value: Iterable[Change]): Self = this.set("Changes", value.asInstanceOf[js.Any])
  }
  
}

