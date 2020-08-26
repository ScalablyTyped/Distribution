package typings.cwiseCompiler.mod

import typings.cwiseParser.mod.CompiledRoutine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserArgs extends js.Object {
  var args: js.Array[ArgType] = js.native
  var blockSize: Double = js.native
  var body: CompiledRoutine = js.native
  var debug: Boolean = js.native
  var funcName: String = js.native
  var post: CompiledRoutine = js.native
  var pre: CompiledRoutine = js.native
  var printCode: js.UndefOr[Boolean] = js.native
}

object UserArgs {
  @scala.inline
  def apply(
    args: js.Array[ArgType],
    blockSize: Double,
    body: CompiledRoutine,
    debug: Boolean,
    funcName: String,
    post: CompiledRoutine,
    pre: CompiledRoutine
  ): UserArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], blockSize = blockSize.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
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
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: CompiledRoutine): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setFuncName(value: String): Self = this.set("funcName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPost(value: CompiledRoutine): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def setPre(value: CompiledRoutine): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintCode(value: Boolean): Self = this.set("printCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintCode: Self = this.set("printCode", js.undefined)
  }
  
}

