package typings.cliDashColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object columnsMod {
  import typings.std.ArrayLike
  import typings.std.Iterable

  type Data = Iterable[Row] | ArrayLike[Row]
  type Row = Iterable[js.Any] | ArrayLike[js.Any]
}
