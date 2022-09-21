package typings.awsSdkUtilBufferFrom

import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-buffer-from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def fromString(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def fromString(input: String, encoding: StringEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
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
    
    inline def ascii: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii = "ascii".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii]
    
    inline def base64: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64 = "base64".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64]
    
    inline def binary: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary = "binary".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary]
    
    inline def hex: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex = "hex".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex]
    
    inline def latin1: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1 = "latin1".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1]
    
    inline def ucs2: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2 = "ucs2".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2]
    
    inline def utf16le: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le = "utf16le".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le]
    
    inline def utf8: typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8 = "utf8".asInstanceOf[typings.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8]
  }
}
