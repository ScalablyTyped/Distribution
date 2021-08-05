package typings.base64topdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64topdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64Decode(base64str: String, file: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(base64str.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def base64Encode(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def base64ToStr(base64Str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64ToStr")(base64Str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rtfToText(rtfStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rtfToText")(rtfStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def strToBase64(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strToBase64")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def textToRtf(textStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textToRtf")(textStr.asInstanceOf[js.Any]).asInstanceOf[String]
}
