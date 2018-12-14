package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.lang")
@js.native
object langNs extends js.Object {
  def detect(defaultLanguage: java.lang.String): java.lang.String = js.native
  def detect(defaultLanguage: java.lang.String, probeLanguage: java.lang.String): java.lang.String = js.native
  def load(
    languageCode: java.lang.String,
    defaultLanguage: java.lang.String,
    callback: js.Function2[/* code */ java.lang.String, /* entries */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @js.native
  object languages
    extends /* code */ org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  @js.native
  object rtl
    extends /* code */ org.scalablytyped.runtime.StringDictionary[scala.Double]
  
}

