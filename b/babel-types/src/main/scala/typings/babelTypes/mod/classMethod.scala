package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "classMethod")
@js.native
object classMethod extends js.Object {
  def apply(
    kind: js.UndefOr[constructor | method | get | set],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement_],
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean]
  ): ClassMethod_ = js.native
}

