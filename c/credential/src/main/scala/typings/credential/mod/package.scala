package typings.credential

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HashCallback = js.Function2[/* err */ typings.std.Error, /* hash */ java.lang.String, scala.Unit]
  type VerifyCallback = js.Function2[/* err */ typings.std.Error, /* isValid */ scala.Boolean, scala.Unit]
}
