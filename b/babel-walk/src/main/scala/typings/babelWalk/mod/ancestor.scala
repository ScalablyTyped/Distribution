package typings.babelWalk.mod

import typings.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-walk/lib", "ancestor")
@js.native
object ancestor extends js.Object {
  
  def apply[TState](visitors: AncestorVisitor[TState]): js.Function2[/* node */ Node, /* state */ TState, Unit] = js.native
}
