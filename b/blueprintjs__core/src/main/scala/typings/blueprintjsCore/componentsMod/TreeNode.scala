package typings.blueprintjsCore.componentsMod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.treeNodeMod.ITreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "TreeNode")
@js.native
class TreeNode[T] protected ()
  extends typings.blueprintjsCore.treeNodeMod.TreeNode[T] {
  def this(props: ITreeNodeProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ITreeNodeProps[T], context: js.Any) = this()
}
/* static members */
object TreeNode {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "TreeNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "TreeNode.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "TreeNode.ofType")
  @js.native
  def ofType[U](): Instantiable1[/* props */ ITreeNodeProps[U], typings.blueprintjsCore.treeNodeMod.TreeNode[U]] = js.native
}
