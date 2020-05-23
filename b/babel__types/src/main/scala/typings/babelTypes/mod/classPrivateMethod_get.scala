package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "classPrivateMethod")
@js.native
object classPrivateMethod_get extends js.Object {
  def apply(
    kind: js.UndefOr[get],
    key: PrivateName_,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_
  ): ClassPrivateMethod_ = js.native
  def apply(
    kind: js.UndefOr[get],
    key: PrivateName_,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    _static: Boolean
  ): ClassPrivateMethod_ = js.native
}

