package typings.blueprintjsCore.componentsMod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.treeMod.ITreeProps
import typings.blueprintjsCore.treeNodeMod.ITreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Tree")
@js.native
class Tree[T] protected ()
  extends typings.blueprintjsCore.treeMod.Tree[T] {
  def this(props: ITreeProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ITreeProps[T], context: js.Any) = this()
}
/* static members */
object Tree {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tree")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tree.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def nodeFromPath[U](path: js.Array[Double]): ITreeNode[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[ITreeNode[U]]
  inline def nodeFromPath[U](path: js.Array[Double], treeNodes: js.Array[ITreeNode[U]]): ITreeNode[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any], treeNodes.asInstanceOf[js.Any])).asInstanceOf[ITreeNode[U]]
  
  inline def ofType[U](): Instantiable1[/* props */ ITreeProps[U], typings.blueprintjsCore.treeMod.Tree[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ITreeProps[U], typings.blueprintjsCore.treeMod.Tree[U]]]
}
