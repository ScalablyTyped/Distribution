package typings.bufferFrom

import typings.node.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(arrayBuffer: ArrayBuffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def apply(arrayBuffer: ArrayBuffer, byteOffset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(arrayBuffer: ArrayBuffer, byteOffset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(arrayBuffer: ArrayBuffer, byteOffset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def apply(data: js.Array[js.Any]): Buffer = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def apply(data: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def apply(str: String): Buffer = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def apply(str: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("buffer-from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
