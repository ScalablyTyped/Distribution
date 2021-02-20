package typings.base64topdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64topdf", "base64Decode")
  @js.native
  def base64Decode(base64str: String, file: String): Unit = js.native
  
  @JSImport("base64topdf", "base64Encode")
  @js.native
  def base64Encode(file: String): Unit = js.native
  
  @JSImport("base64topdf", "base64ToStr")
  @js.native
  def base64ToStr(base64Str: String): String = js.native
  
  @JSImport("base64topdf", "rtfToText")
  @js.native
  def rtfToText(rtfStr: String): String = js.native
  
  @JSImport("base64topdf", "strToBase64")
  @js.native
  def strToBase64(str: String): String = js.native
  
  @JSImport("base64topdf", "textToRtf")
  @js.native
  def textToRtf(textStr: String): String = js.native
}
