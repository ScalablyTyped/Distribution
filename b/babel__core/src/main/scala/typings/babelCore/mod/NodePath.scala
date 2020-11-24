package typings.babelCore.mod

import typings.babelTraverse.anon.Container
import typings.babelTraverse.mod.Hub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/core", "NodePath")
@js.native
class NodePath[T] protected ()
  extends typings.babelTraverse.mod.NodePath[T] {
  def this(hub: Hub, parent: typings.babelTypes.mod.Node) = this()
}
/* static members */
@JSImport("@babel/core", "NodePath")
@js.native
object NodePath extends js.Object {
  
  def get[C /* <: typings.babelTypes.mod.Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typings.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ] = js.native
}
