package typings.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.treeNodeMod.ITreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "TreeNode")
@js.native
class TreeNode[T] protected ()
  extends typings.blueprintjsCore.componentsMod.TreeNode[T] {
  def this(props: ITreeNodeProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ITreeNodeProps[T], context: js.Any) = this()
}
/* static members */
object TreeNode {
  
  @JSImport("@blueprintjs/core", "TreeNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "TreeNode.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def ofType[U](): Instantiable1[/* props */ ITreeNodeProps[U], typings.blueprintjsCore.treeNodeMod.TreeNode[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ITreeNodeProps[U], typings.blueprintjsCore.treeNodeMod.TreeNode[U]]]
}
