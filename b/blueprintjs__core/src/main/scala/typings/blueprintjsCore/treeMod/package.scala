package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeMod {
  type TreeEventHandler[T] = js.Function3[
    /* node */ typings.blueprintjsCore.treeNodeMod.ITreeNode[T], 
    /* nodePath */ js.Array[scala.Double], 
    /* e */ typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
}
