package typings
package bserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bserMod {
  type AnyWrapper = scala.Boolean | IntWrapper | scala.Null | java.lang.String | js.Object
  type InputWrapper = nodeLib.Buffer | java.lang.String | nodeLib.NodeJSNs.TypedArray | stdLib.DataView | stdLib.ArrayBuffer | stdLib.SharedArrayBuffer
  type IntWrapper = scala.Double | nodeDashInt64Lib.nodeDashInt64Mod.^ 
}
