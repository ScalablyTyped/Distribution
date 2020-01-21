package typings.blobToBuffer

import typings.node.Buffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blob-to-buffer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(blob: Blob, callback: js.Function2[/* error */ js.Any, /* buffer */ Buffer, Unit]): Unit = js.native
}

