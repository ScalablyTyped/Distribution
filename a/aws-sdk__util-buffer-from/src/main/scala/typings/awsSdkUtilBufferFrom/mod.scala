package typings.awsSdkUtilBufferFrom

import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii
import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64
import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary
import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex
import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1
import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2
import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le
import typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8
import typings.buffer.mod.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: ArrayBuffer): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: ArrayBuffer, offset: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: ArrayBuffer, offset: Double): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: ArrayBuffer, offset: Double, length: Double): Buffer = js.native
  
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString(input: String): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_ascii(input: String, encoding: ascii): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_base64(input: String, encoding: base64): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_binary(input: String, encoding: binary): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_hex(input: String, encoding: hex): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_latin1(input: String, encoding: latin1): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_ucs2(input: String, encoding: ucs2): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_utf16le(input: String, encoding: utf16le): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_utf8(input: String, encoding: utf8): Buffer = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary
    - typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex
  */
  trait StringEncoding extends StObject
  object StringEncoding {
    
    @scala.inline
    def ascii: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii = "ascii".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii]
    
    @scala.inline
    def base64: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64 = "base64".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64]
    
    @scala.inline
    def binary: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary = "binary".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary]
    
    @scala.inline
    def hex: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex = "hex".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex]
    
    @scala.inline
    def latin1: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1 = "latin1".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1]
    
    @scala.inline
    def ucs2: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2 = "ucs2".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2]
    
    @scala.inline
    def utf16le: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le = "utf16le".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le]
    
    @scala.inline
    def utf8: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8 = "utf8".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8]
  }
}
