package typings.cwiseCompiler.mod

import typings.cwiseParser.mod.CompiledRoutine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Procedure extends js.Object {
  var argTypes: js.Array[ArgType] = js.native
  var arrayArgs: js.Array[Double] = js.native
  var arrayBlockIndices: js.Array[Double] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var body: CompiledRoutine = js.native
  var debug: Boolean = js.native
  var funcName: String = js.native
  var indexArgs: js.Array[Double] = js.native
  var offsetArgIndex: js.Array[Double] = js.native
  var offsetArgs: js.Array[OffsetArg] = js.native
  var post: CompiledRoutine = js.native
  var pre: CompiledRoutine = js.native
  var scalarArgs: js.Array[Double] = js.native
  var shapeArgs: js.Array[Double] = js.native
  var shimArgs: js.Array[String] = js.native
}

object Procedure {
  @scala.inline
  def apply(
    argTypes: js.Array[ArgType],
    arrayArgs: js.Array[Double],
    arrayBlockIndices: js.Array[Double],
    body: CompiledRoutine,
    debug: Boolean,
    funcName: String,
    indexArgs: js.Array[Double],
    offsetArgIndex: js.Array[Double],
    offsetArgs: js.Array[OffsetArg],
    post: CompiledRoutine,
    pre: CompiledRoutine,
    scalarArgs: js.Array[Double],
    shapeArgs: js.Array[Double],
    shimArgs: js.Array[String]
  ): Procedure = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], arrayArgs = arrayArgs.asInstanceOf[js.Any], arrayBlockIndices = arrayBlockIndices.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], indexArgs = indexArgs.asInstanceOf[js.Any], offsetArgIndex = offsetArgIndex.asInstanceOf[js.Any], offsetArgs = offsetArgs.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], scalarArgs = scalarArgs.asInstanceOf[js.Any], shapeArgs = shapeArgs.asInstanceOf[js.Any], shimArgs = shimArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  @scala.inline
  implicit class ProcedureOps[Self <: Procedure] (val x: Self) extends AnyVal {
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
    def setArgTypesVarargs(value: ArgType*): Self = this.set("argTypes", js.Array(value :_*))
    @scala.inline
    def setArgTypes(value: js.Array[ArgType]): Self = this.set("argTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrayArgsVarargs(value: Double*): Self = this.set("arrayArgs", js.Array(value :_*))
    @scala.inline
    def setArrayArgs(value: js.Array[Double]): Self = this.set("arrayArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrayBlockIndicesVarargs(value: Double*): Self = this.set("arrayBlockIndices", js.Array(value :_*))
    @scala.inline
    def setArrayBlockIndices(value: js.Array[Double]): Self = this.set("arrayBlockIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: CompiledRoutine): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setFuncName(value: String): Self = this.set("funcName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexArgsVarargs(value: Double*): Self = this.set("indexArgs", js.Array(value :_*))
    @scala.inline
    def setIndexArgs(value: js.Array[Double]): Self = this.set("indexArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetArgIndexVarargs(value: Double*): Self = this.set("offsetArgIndex", js.Array(value :_*))
    @scala.inline
    def setOffsetArgIndex(value: js.Array[Double]): Self = this.set("offsetArgIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetArgsVarargs(value: OffsetArg*): Self = this.set("offsetArgs", js.Array(value :_*))
    @scala.inline
    def setOffsetArgs(value: js.Array[OffsetArg]): Self = this.set("offsetArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPost(value: CompiledRoutine): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def setPre(value: CompiledRoutine): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalarArgsVarargs(value: Double*): Self = this.set("scalarArgs", js.Array(value :_*))
    @scala.inline
    def setScalarArgs(value: js.Array[Double]): Self = this.set("scalarArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeArgsVarargs(value: Double*): Self = this.set("shapeArgs", js.Array(value :_*))
    @scala.inline
    def setShapeArgs(value: js.Array[Double]): Self = this.set("shapeArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setShimArgsVarargs(value: String*): Self = this.set("shimArgs", js.Array(value :_*))
    @scala.inline
    def setShimArgs(value: js.Array[String]): Self = this.set("shimArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
  }
  
}

