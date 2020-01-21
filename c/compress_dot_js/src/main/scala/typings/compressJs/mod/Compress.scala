package typings.compressJs.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compress extends js.Object {
  def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]]
  def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]]
}

object Compress {
  @scala.inline
  def apply(
    attach: (String, CompressOptions) => js.Promise[js.Array[CompressResult]],
    compress: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]
  ): Compress = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction2(attach), compress = js.Any.fromFunction2(compress))
  
    __obj.asInstanceOf[Compress]
  }
}

