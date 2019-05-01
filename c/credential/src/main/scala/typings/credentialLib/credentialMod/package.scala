package typings
package credentialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object credentialMod {
  type HashCallback = js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, scala.Unit]
  type VerifyCallback = js.Function2[/* err */ stdLib.Error, /* isValid */ scala.Boolean, scala.Unit]
}
