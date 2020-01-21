package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chance {
  type AtLeastOneKey[T, U] = typings.std.Partial[T] with (/* import warning: importer.ImportType#apply Failed type conversion: U[keyof U] */ js.Any)
}
