package typings.csrf

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csrfMod {
  type SecretCallback = js.Function2[/* err */ Error | Null, /* secret */ String, Unit]
}
