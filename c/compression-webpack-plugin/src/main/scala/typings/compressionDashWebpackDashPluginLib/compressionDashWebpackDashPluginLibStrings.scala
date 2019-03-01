package typings
package compressionDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object compressionDashWebpackDashPluginLibStrings {
  @js.native
  sealed trait deflate
    extends compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.CompressionPluginNs.ZlibAlgorithm
  
  @js.native
  sealed trait deflateRaw
    extends compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.CompressionPluginNs.ZlibAlgorithm
  
  @js.native
  sealed trait gzip
    extends compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.CompressionPluginNs.ZlibAlgorithm
  
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def deflateRaw: deflateRaw = "deflateRaw".asInstanceOf[deflateRaw]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
}

