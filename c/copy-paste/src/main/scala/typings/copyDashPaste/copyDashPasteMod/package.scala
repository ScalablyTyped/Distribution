package typings.copyDashPaste

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object copyDashPasteMod {
  type CopyCallback = js.Function1[/* err */ Error, Unit]
  type PasteCallback = js.Function2[/* err */ Error, /* content */ String, Unit]
}
