package typings.atBlueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmComponentsTreeTreeMod {
  import typings.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNode
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.std.HTMLElement

  type TreeEventHandler[T] = js.Function3[
    /* node */ ITreeNode[T], 
    /* nodePath */ js.Array[Double], 
    /* e */ MouseEvent[HTMLElement, NativeMouseEvent], 
    Unit
  ]
}
