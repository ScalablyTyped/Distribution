package typings.atBlueprintjsCore

import typings.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNode
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmComponentsTreeTreeMod {
  type TreeEventHandler[T] = js.Function3[
    /* node */ ITreeNode[T], 
    /* nodePath */ js.Array[Double], 
    /* e */ MouseEvent[HTMLElement, NativeMouseEvent], 
    Unit
  ]
}
