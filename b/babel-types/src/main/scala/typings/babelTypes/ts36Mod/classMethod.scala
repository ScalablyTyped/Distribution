package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-types/ts3.6", "classMethod")
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
