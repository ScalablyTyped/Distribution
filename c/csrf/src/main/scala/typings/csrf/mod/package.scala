package typings.csrf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SecretCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* secret */ java.lang.String, scala.Unit]
}
