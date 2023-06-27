package typings.babelCore.mod

import typings.babelTraverse.anon.Container
import typings.babelTraverse.anon.Hub
import typings.babelTraverse.mod.HubInterface
import typings.babelTraverse.mod.NodeKeyOfArrays
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/core", "NodePath")
@js.native
open class NodePath[T] protected ()
  extends typings.babelTraverse.mod.NodePath[T] {
  def this(hub: HubInterface, parent: typings.babelTypes.mod.Node) = this()
}
/* static members */
object NodePath {
  
  @JSImport("@babel/core", "NodePath")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get[C /* <: typings.babelTypes.mod.Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typings.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ]]
  inline def get[C /* <: typings.babelTypes.mod.Node */, L /* <: NodeKeyOfArrays[C] */](opts: Hub[C, L]): /* import warning: importer.ImportType#apply Failed type conversion: C[L] extends std.Array<@babel/types.@babel/types.Node | null | undefined> ? @babel/traverse.@babel/traverse.NodePath<C[L][number]> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(opts.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C[L] extends std.Array<@babel/types.@babel/types.Node | null | undefined> ? @babel/traverse.@babel/traverse.NodePath<C[L][number]> : never */ js.Any]
}
