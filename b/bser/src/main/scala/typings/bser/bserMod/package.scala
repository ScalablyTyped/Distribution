package typings.bser

import typings.node.Buffer
import typings.node.NodeJSNs.TypedArray
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bserMod {
  type AnyWrapper = Boolean | IntWrapper | Null | String | js.Object
  type InputWrapper = Buffer | String | TypedArray | DataView | ArrayBuffer | SharedArrayBuffer
  type IntWrapper = Double | typings.nodeDashInt64.nodeDashInt64Mod.^ 
}
