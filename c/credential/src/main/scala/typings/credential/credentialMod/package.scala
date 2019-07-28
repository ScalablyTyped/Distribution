package typings.credential

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object credentialMod {
  type HashCallback = js.Function2[/* err */ Error, /* hash */ String, Unit]
  type VerifyCallback = js.Function2[/* err */ Error, /* isValid */ Boolean, Unit]
}
