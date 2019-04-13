package typings
package checkDashSumLib.checkDashSumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("check-sum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    path: java.lang.String,
    hashes: Hashes,
    callback: js.Function1[/* error */ js.UndefOr[ChecksumError | stdLib.Error], scala.Unit]
  ): js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    hashes: Hashes,
    callback: js.Function1[/* error */ ChecksumError | js.Any, scala.Unit]
  ): js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = js.native
}

