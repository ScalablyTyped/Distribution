package typings
package atBlueprintjsCoreLib.libEsmComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", "Tree")
@js.native
class Tree[T] ()
  extends atBlueprintjsCoreLib.libEsmComponentsTreeTreeMod.Tree[T]

@JSImport("@blueprintjs/core/lib/esm/components", "Tree")
@js.native
object Tree extends js.Object {
  var displayName: java.lang.String = js.native
  def nodeFromPath(
    path: js.Array[scala.Double],
    treeNodes: js.Array[atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod.ITreeNode[js.Object]]
  ): atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod.ITreeNode[js.Object] = js.native
  def ofType[T](): org.scalablytyped.runtime.Instantiable1[
    /* props */ atBlueprintjsCoreLib.libEsmComponentsTreeTreeMod.ITreeProps[T], 
    atBlueprintjsCoreLib.libEsmComponentsTreeTreeMod.Tree[T]
  ] = js.native
}

