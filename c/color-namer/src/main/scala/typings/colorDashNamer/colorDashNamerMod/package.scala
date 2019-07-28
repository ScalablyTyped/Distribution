package typings.colorDashNamer

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorDashNamerMod {
  type Colors[T /* <: Palette */] = Record[T, js.Array[Color]]
  type Diff[T /* <: String */, U /* <: String */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
}
