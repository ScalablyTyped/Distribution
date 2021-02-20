package typings.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.treeMod.ITreeProps
import typings.blueprintjsCore.treeNodeMod.ITreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tree")
@js.native
class Tree[T] protected ()
  extends typings.blueprintjsCore.componentsMod.Tree[T] {
  def this(props: ITreeProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ITreeProps[T], context: js.Any) = this()
}
/* static members */
object Tree {
  
  @JSImport("@blueprintjs/core", "Tree")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Tree.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Tree.nodeFromPath")
  @js.native
  def nodeFromPath[U](path: js.Array[Double]): ITreeNode[U] = js.native
  @JSImport("@blueprintjs/core", "Tree.nodeFromPath")
  @js.native
  def nodeFromPath[U](path: js.Array[Double], treeNodes: js.Array[ITreeNode[U]]): ITreeNode[U] = js.native
  
  @JSImport("@blueprintjs/core", "Tree.ofType")
  @js.native
  def ofType[U](): Instantiable1[/* props */ ITreeProps[U], typings.blueprintjsCore.treeMod.Tree[U]] = js.native
}
