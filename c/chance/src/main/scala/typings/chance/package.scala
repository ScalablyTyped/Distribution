package typings

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chance {
  type AtLeastOneKey[T, U] = Partial[T] with (/* import warning: ImportType.apply Failed type conversion: U[keyof U] */ js.Any)
}
