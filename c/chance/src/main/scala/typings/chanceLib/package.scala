package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chanceLib {
  type AtLeastOneKey[T, U] = stdLib.Partial[T] with (/* import warning: ImportType.apply Failed type conversion: U[keyof U] */ js.Any)
}
