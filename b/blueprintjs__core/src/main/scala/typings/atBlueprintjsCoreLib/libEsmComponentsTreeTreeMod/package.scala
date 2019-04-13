package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmComponentsTreeTreeMod {
  type TreeEventHandler[T] = js.Function3[
    /* node */ atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod.ITreeNode[T], 
    /* nodePath */ js.Array[scala.Double], 
    /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
}
