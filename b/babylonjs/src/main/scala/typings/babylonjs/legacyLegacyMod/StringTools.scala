package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StringTools {
  
  @JSImport("babylonjs/Legacy/legacy", "StringTools")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Decode(buffer: js.typedarray.Uint16Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def Decode(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def DecodeBase64ToBinary(base64Data: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64ToBinary")(base64Data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def DecodeBase64ToString(base64Data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64ToString")(base64Data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBufferView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def EndsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("EndsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def PadNumber(num: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("PadNumber")(num.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def StartsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("StartsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
