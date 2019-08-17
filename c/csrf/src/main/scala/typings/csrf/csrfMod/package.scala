package typings.csrf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csrfMod {
  import typings.std.Error

  type SecretCallback = js.Function2[/* err */ Error | Null, /* secret */ String, Unit]
}
