package typings
package colorDashNamerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorDashNamerMod {
  type Colors[T /* <: Palette */] = stdLib.Record[T, js.Array[Color]]
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
}
