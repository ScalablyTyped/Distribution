package typings
package copyDashPasteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object copyDashPasteMod {
  type CopyCallback = js.Function1[/* err */ stdLib.Error, scala.Unit]
  type PasteCallback = js.Function2[/* err */ stdLib.Error, /* content */ java.lang.String, scala.Unit]
}
