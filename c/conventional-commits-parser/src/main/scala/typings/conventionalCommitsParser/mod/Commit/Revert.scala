package typings.conventionalCommitsParser.mod.Commit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Revert
  extends /* field */ StringDictionary[js.UndefOr[Field]] {
  var hash: js.UndefOr[Field] = js.native
  var header: js.UndefOr[Field] = js.native
}

object Revert {
  @scala.inline
  def apply(): Revert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Revert]
  }
  @scala.inline
  implicit class RevertOps[Self <: Revert] (val x: Self) extends AnyVal {
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
    def setHash(value: Field): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setHashNull: Self = this.set("hash", null)
    @scala.inline
    def setHeader(value: Field): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
  }
  
}

