package typings.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: These are the async compression algorithms on the zlib object.
/* Rewritten from type alias, can be one of: 
  - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate
  - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw
  - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip
  - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress
*/
trait ZlibAlgorithm extends js.Object

object ZlibAlgorithm {
  @scala.inline
  def brotliCompress: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress = this.cast("brotliCompress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate = this.cast("deflate")
  @scala.inline
  def deflateRaw: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw = this.cast("deflateRaw")
  @scala.inline
  def gzip: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip = this.cast("gzip")
}

