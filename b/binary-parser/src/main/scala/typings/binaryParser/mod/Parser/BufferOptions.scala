package typings.binaryParser.mod.Parser

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferOptions extends Options {
  @JSName("clone")
  var clone_FBufferOptions: js.UndefOr[Boolean] = js.native
  var length: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typings.binaryParser.mod.Parser[_], Double])
  ] = js.native
  var readUntil: js.UndefOr[String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])] = js.native
}

object BufferOptions {
  @scala.inline
  def apply(): BufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferOptions]
  }
  @scala.inline
  implicit class BufferOptionsOps[Self <: BufferOptions] (val x: Self) extends AnyVal {
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setLength(value: Double | String | (js.ThisFunction0[/* this */ typings.binaryParser.mod.Parser[_], Double])): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setReadUntilFunction2(value: (/* item */ Double, /* buffer */ Buffer) => Boolean): Self = this.set("readUntil", js.Any.fromFunction2(value))
    @scala.inline
    def setReadUntil(value: String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])): Self = this.set("readUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadUntil: Self = this.set("readUntil", js.undefined)
  }
  
}

