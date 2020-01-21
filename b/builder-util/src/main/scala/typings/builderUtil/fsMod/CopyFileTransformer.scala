package typings.builderUtil.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", "CopyFileTransformer")
@js.native
class CopyFileTransformer protected () extends js.Object {
  def this(afterCopyTransformer: AfterCopyFileTransformer) = this()
  def afterCopyTransformer(file: String): js.Promise[Unit] = js.native
}

