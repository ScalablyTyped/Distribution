package typings.base64util

import typings.base64util.mod.BASE64.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("base64util", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  inline def atob(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_atob")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bindProto(proto: Prototype): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindProto")(proto.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def btoa(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_btoa")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def byteDecode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("byteDecode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def byteEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("byteEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def byteUrlDecode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("byteUrlDecode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def byteUrlEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("byteUrlEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mb2utf8(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mb2utf8")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mbDecode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mbDecode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mbEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mbEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mbUrlDecode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mbUrlDecode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mbUrlEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mbUrlEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def polyfill(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlDecode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlDecode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def utf82mb(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utf82mb")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object BASE64 {
    
    type Prototype = Any
  }
}
