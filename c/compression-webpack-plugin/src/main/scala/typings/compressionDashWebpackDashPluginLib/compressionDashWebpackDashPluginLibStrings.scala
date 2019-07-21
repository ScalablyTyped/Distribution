package typings
package compressionDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object compressionDashWebpackDashPluginLibStrings {
  @js.native
  sealed trait brotliCompress
    extends compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.ZlibAlgorithm
  
  @js.native
  sealed trait deflate
    extends compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.ZlibAlgorithm
  
  @js.native
  sealed trait deflateRaw
    extends compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.ZlibAlgorithm
  
  @js.native
  sealed trait gzip
    extends compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.ZlibAlgorithm
  
  @scala.inline
  def brotliCompress: brotliCompress = "brotliCompress".asInstanceOf[brotliCompress]
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def deflateRaw: deflateRaw = "deflateRaw".asInstanceOf[deflateRaw]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
}

