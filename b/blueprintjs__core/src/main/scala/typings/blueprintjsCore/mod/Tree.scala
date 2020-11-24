package typings.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.treeMod.ITreeProps
import typings.blueprintjsCore.treeNodeMod.ITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tree")
@js.native
class Tree[T] ()
  extends typings.blueprintjsCore.componentsMod.Tree[T]
/* static members */
@JSImport("@blueprintjs/core", "Tree")
@js.native
object Tree extends js.Object {
  
  var displayName: String = js.native
  
  def nodeFromPath[U](path: js.Array[Double]): ITreeNode[U] = js.native
  def nodeFromPath[U](path: js.Array[Double], treeNodes: js.Array[ITreeNode[U]]): ITreeNode[U] = js.native
  
  def ofType[U](): Instantiable1[/* props */ ITreeProps[U], typings.blueprintjsCore.treeMod.Tree[U]] = js.native
}
