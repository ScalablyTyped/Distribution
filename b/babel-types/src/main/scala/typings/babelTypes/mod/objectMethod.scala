package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "objectMethod")
@js.native
object objectMethod extends js.Object {
  def apply(
    kind: js.UndefOr[get | set | method],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement_],
    computed: js.UndefOr[Boolean]
  ): ObjectMethod_ = js.native
}

