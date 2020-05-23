package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.lang")
@js.native
object lang extends js.Object {
  def detect(defaultLanguage: String): String = js.native
  def detect(defaultLanguage: String, probeLanguage: String): String = js.native
  def load(
    languageCode: String,
    defaultLanguage: String,
    callback: js.Function2[/* code */ String, /* entries */ js.Any, Unit]
  ): Unit = js.native
  @js.native
  object languages extends /* pri */ StringDictionary[Double]
  
  @js.native
  object rtl extends /* pri */ StringDictionary[Double]
  
}

