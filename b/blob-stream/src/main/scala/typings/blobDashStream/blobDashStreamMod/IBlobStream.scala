package typings.blobDashStream.blobDashStreamMod

import typings.node.NodeJSNs.WritableStream
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlobStream extends WritableStream {
  def toBlob(): Blob = js.native
  def toBlob(`type`: String): Blob = js.native
  def toBlobURL(): String = js.native
  def toBlobURL(`type`: String): String = js.native
}

