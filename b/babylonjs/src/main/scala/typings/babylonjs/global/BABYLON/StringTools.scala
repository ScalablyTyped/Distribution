package typings.babylonjs.global.BABYLON

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint16Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StringTools")
@js.native
class StringTools ()
  extends StObject
     with typings.babylonjs.BABYLON.StringTools
/* static members */
object StringTools {
  
  @JSGlobal("BABYLON.StringTools")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Decode(buffer: Uint16Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Decodes a buffer into a string
    * @param buffer The buffer to decode
    * @returns The decoded string
    */
  inline def Decode(buffer: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Encode a buffer to a base64 string
    * @param buffer defines the buffer to encode
    * @returns the encoded string
    */
  inline def EncodeArrayBufferToBase64(buffer: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def EncodeArrayBufferToBase64(buffer: ArrayBufferView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Checks for a matching suffix at the end of a string (for ES5 and lower)
    * @param str Source string
    * @param suffix Suffix to search for in the source string
    * @returns Boolean indicating whether the suffix was found (true) or not (false)
    */
  inline def EndsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("EndsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Converts a number to string and pads with preceeding zeroes until it is of specified length.
    * @param num the number to convert and pad
    * @param length the expected length of the string
    * @returns the padded string
    */
  inline def PadNumber(num: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("PadNumber")(num.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Checks for a matching suffix at the beginning of a string (for ES5 and lower)
    * @param str Source string
    * @param suffix Suffix to search for in the source string
    * @returns Boolean indicating whether the suffix was found (true) or not (false)
    */
  inline def StartsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("StartsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
