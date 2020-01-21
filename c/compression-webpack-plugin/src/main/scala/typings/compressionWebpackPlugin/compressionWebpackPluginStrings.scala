package typings.compressionWebpackPlugin

import typings.compressionWebpackPlugin.mod.ZlibAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object compressionWebpackPluginStrings {
  @js.native
  sealed trait brotliCompress extends ZlibAlgorithm
  
  @js.native
  sealed trait deflate extends ZlibAlgorithm
  
  @js.native
  sealed trait deflateRaw extends ZlibAlgorithm
  
  @js.native
  sealed trait gzip extends ZlibAlgorithm
  
  @scala.inline
  def brotliCompress: brotliCompress = "brotliCompress".asInstanceOf[brotliCompress]
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def deflateRaw: deflateRaw = "deflateRaw".asInstanceOf[deflateRaw]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
}

