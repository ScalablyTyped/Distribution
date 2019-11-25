package typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: These are the async compression algorithms on the zlib object.
/* Rewritten from type alias, can be one of: 
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflate
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflateRaw
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.gzip
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.brotliCompress
*/
trait ZlibAlgorithm extends js.Object

object ZlibAlgorithm {
  @scala.inline
  def brotliCompress: typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.brotliCompress = this.cast("brotliCompress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflate = this.cast("deflate")
  @scala.inline
  def deflateRaw: typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflateRaw = this.cast("deflateRaw")
  @scala.inline
  def gzip: typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.gzip = this.cast("gzip")
}

