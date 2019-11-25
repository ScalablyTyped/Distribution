package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chance {
  import typings.std.Partial

  type AtLeastOneKey[T, U] = Partial[T] with (/* import warning: importer.ImportType#apply Failed type conversion: U[keyof U] */ js.Any)
}
