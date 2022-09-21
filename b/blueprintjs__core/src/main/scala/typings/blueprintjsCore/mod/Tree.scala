package typings.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.treeMod.TreeProps
import typings.blueprintjsCore.treeNodeMod.TreeNodeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tree")
@js.native
open class Tree[T] protected ()
  extends typings.blueprintjsCore.componentsMod.Tree[T] {
  def this(props: TreeProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TreeProps[T], context: Any) = this()
}
/* static members */
object Tree {
  
  @JSImport("@blueprintjs/core", "Tree")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Tree.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def nodeFromPath[U](path: js.Array[Double]): TreeNodeInfo[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[TreeNodeInfo[U]]
  inline def nodeFromPath[U](path: js.Array[Double], treeNodes: js.Array[TreeNodeInfo[U]]): TreeNodeInfo[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any], treeNodes.asInstanceOf[js.Any])).asInstanceOf[TreeNodeInfo[U]]
  
  inline def ofType[U](): Instantiable1[/* props */ TreeProps[U], typings.blueprintjsCore.treeMod.Tree[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ TreeProps[U], typings.blueprintjsCore.treeMod.Tree[U]]]
}
