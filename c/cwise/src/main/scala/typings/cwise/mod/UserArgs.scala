package typings.cwise.mod

import typings.cwiseCompiler.mod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserArgs extends js.Object {
  var args: js.Array[ArgType] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var funcName: js.UndefOr[String] = js.native
  var post: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.native
  var pre: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.native
  var printCode: js.UndefOr[Boolean] = js.native
  def body(a: Double, args: js.Any*): Unit = js.native
}

object UserArgs {
  @scala.inline
  def apply(args: js.Array[ArgType], body: (Double, /* repeated */ js.Any) => Unit): UserArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = js.Any.fromFunction2(body))
    __obj.asInstanceOf[UserArgs]
  }
  @scala.inline
  implicit class UserArgsOps[Self <: UserArgs] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: ArgType*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[ArgType]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: (Double, /* repeated */ js.Any) => Unit): Self = this.set("body", js.Any.fromFunction2(value))
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    @scala.inline
    def setFuncName(value: String): Self = this.set("funcName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuncName: Self = this.set("funcName", js.undefined)
    @scala.inline
    def setPost(value: (/* a */ Double, /* repeated */ js.Any) => Unit): Self = this.set("post", js.Any.fromFunction2(value))
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    @scala.inline
    def setPre(value: (/* a */ Double, /* repeated */ js.Any) => Unit): Self = this.set("pre", js.Any.fromFunction2(value))
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    @scala.inline
    def setPrintCode(value: Boolean): Self = this.set("printCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintCode: Self = this.set("printCode", js.undefined)
  }
  
}

