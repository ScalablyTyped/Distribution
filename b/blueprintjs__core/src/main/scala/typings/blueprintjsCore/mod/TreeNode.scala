package typings.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "TreeNode")
@js.native
open class TreeNode[T] protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.TreeNode[T] {
  def this(props: ITreeNodeProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ITreeNodeProps[T], context: Any) = this()
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
  
  /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
  inline def ofType[U](): Instantiable1[
    /* props */ ITreeNodeProps[U], 
    typings.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[U]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
    /* props */ ITreeNodeProps[U], 
    typings.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[U]
  ]]
}
