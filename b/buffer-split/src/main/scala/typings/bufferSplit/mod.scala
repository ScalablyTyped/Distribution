package typings.bufferSplit

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(buf: Buffer, splitBuf: Buffer): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], splitBuf.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  @scala.inline
  def apply(buf: Buffer, splitBuf: Buffer, includeDelim: Boolean): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], splitBuf.asInstanceOf[js.Any], includeDelim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  @JSImport("buffer-split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
