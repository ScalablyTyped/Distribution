package typings
package builderDashUtilLib.outFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", "CopyFileTransformer")
@js.native
class CopyFileTransformer protected () extends js.Object {
  def this(afterCopyTransformer: AfterCopyFileTransformer) = this()
  def afterCopyTransformer(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}

