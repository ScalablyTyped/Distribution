package typings.azureMsalNode

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsEncodingUtilsMod {
  
  @JSImport("@azure/msal-node/dist/utils/EncodingUtils", "EncodingUtils")
  @js.native
  open class EncodingUtils () extends StObject
  /* static members */
  object EncodingUtils {
    
    @JSImport("@azure/msal-node/dist/utils/EncodingUtils", "EncodingUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 'utf8': Multibyte encoded Unicode characters. Many web pages and other document formats use UTF-8.
      * 'base64': Base64 encoding.
      *
      * @param base64Str Base64 encoded text
      */
    inline def base64Decode(base64Str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(base64Str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * @param base64Str Base64 encoded Url
      */
    inline def base64DecodeUrl(base64Str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64DecodeUrl")(base64Str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * 'utf8': Multibyte encoded Unicode characters. Many web pages and other document formats use UTF-8.
      * 'base64': Base64 encoding.
      *
      * @param str text
      */
    inline def base64Encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def base64Encode(str: String, encoding: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * encode a URL
      * @param str
      */
    inline def base64EncodeUrl(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64EncodeUrl")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def base64EncodeUrl(str: String, encoding: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64EncodeUrl")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
