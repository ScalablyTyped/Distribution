package typings.checkSum.mod

import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("check-sum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    path: String,
    hashes: Hashes,
    callback: js.Function1[/* error */ js.UndefOr[ChecksumError | Error], Unit]
  ): js.Function1[/* fn */ js.Function0[Unit], Unit] = js.native
  def apply(stream: Readable, hashes: Hashes, callback: js.Function1[/* error */ ChecksumError | js.Any, Unit]): js.Function1[/* fn */ js.Function0[Unit], Unit] = js.native
}
