package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "classMethod")
@js.native
object classMethod_method extends js.Object {
  def apply(
    kind: js.UndefOr[method],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement],
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean]
  ): ClassMethod = js.native
}

