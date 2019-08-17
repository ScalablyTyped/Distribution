package typings.credential

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object credentialMod {
  import typings.std.Error

  type HashCallback = js.Function2[/* err */ Error, /* hash */ String, Unit]
  type VerifyCallback = js.Function2[/* err */ Error, /* isValid */ Boolean, Unit]
}
