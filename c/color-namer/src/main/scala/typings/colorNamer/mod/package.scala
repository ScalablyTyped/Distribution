package typings.colorNamer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Colors[T /* <: typings.colorNamer.mod.Palette */] = typings.std.Record[T, js.Array[typings.colorNamer.mod.Color]]
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
}
