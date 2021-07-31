package typings.bitwiseXor

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(a: String, b: String): Buffer = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(a: String, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(a: Buffer, b: String): Buffer = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  /**
    * Bitwise XOR between two Buffers or Strings, returns a Buffer
    */
  @scala.inline
  def apply(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("bitwise-xor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
