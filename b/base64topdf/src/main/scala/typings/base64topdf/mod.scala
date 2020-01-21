package typings.base64topdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64topdf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def base64Decode(base64str: String, file: String): Unit = js.native
  def base64Encode(file: String): Unit = js.native
  def base64ToStr(base64Str: String): String = js.native
  def rtfToText(rtfStr: String): String = js.native
  def strToBase64(str: String): String = js.native
  def textToRtf(textStr: String): String = js.native
}

