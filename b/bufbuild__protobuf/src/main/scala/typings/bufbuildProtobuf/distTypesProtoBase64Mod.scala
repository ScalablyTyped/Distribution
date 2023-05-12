package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtoBase64Mod {
  
  object protoBase64 {
    
    @JSImport("@bufbuild/protobuf/dist/types/proto-base64", "protoBase64")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decodes a base64 string to a byte array.
      *
      * - ignores white-space, including line breaks and tabs
      * - allows inner padding (can decode concatenated base64 strings)
      * - does not require padding
      * - understands base64url encoding:
      *   "-" instead of "+",
      *   "_" instead of "/",
      *   no padding
      */
    inline def dec(base64Str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("dec")(base64Str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Decodes a base64 string to a byte array.
      *
      * - ignores white-space, including line breaks and tabs
      * - allows inner padding (can decode concatenated base64 strings)
      * - does not require padding
      * - understands base64url encoding:
      *   "-" instead of "+",
      *   "_" instead of "/",
      *   no padding
      */
    inline def enc(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("enc")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
