package typings.conventionalChangelogWriter.anon

import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Raw[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  var raw: T = js.native
}

object Raw {
  @scala.inline
  def apply[/* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */ T](raw: T): Raw[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw[T]]
  }
  @scala.inline
  implicit class RawOps[Self <: Raw[_], /* <: typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */ T] (val x: Self with Raw[T]) extends AnyVal {
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
    def setRaw(value: T): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}

