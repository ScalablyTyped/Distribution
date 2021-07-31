package typings.compressionWebpackPlugin

import typings.compressionWebpackPlugin.mod.ZlibAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressionWebpackPluginStrings {
  
  @js.native
  sealed trait brotliCompress
    extends StObject
       with ZlibAlgorithm
  @scala.inline
  def brotliCompress: brotliCompress = "brotliCompress".asInstanceOf[brotliCompress]
  
  @js.native
  sealed trait deflate
    extends StObject
       with ZlibAlgorithm
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  
  @js.native
  sealed trait deflateRaw
    extends StObject
       with ZlibAlgorithm
  @scala.inline
  def deflateRaw: deflateRaw = "deflateRaw".asInstanceOf[deflateRaw]
  
  @js.native
  sealed trait gzip
    extends StObject
       with ZlibAlgorithm
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
}
