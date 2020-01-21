package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "objectMethod")
@js.native
object objectMethod_set extends js.Object {
  def apply(
    kind: set,
    key: js.Any,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_
  ): ObjectMethod_ = js.native
  def apply(
    kind: set,
    key: js.Any,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    computed: Boolean
  ): ObjectMethod_ = js.native
  def apply(
    kind: set,
    key: js.Any,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean
  ): ObjectMethod_ = js.native
  def apply(
    kind: set,
    key: js.Any,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    async: Boolean
  ): ObjectMethod_ = js.native
}

