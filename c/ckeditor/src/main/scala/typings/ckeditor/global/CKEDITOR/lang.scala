package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lang {
  
  @JSGlobal("CKEDITOR.lang.detect")
  @js.native
  def detect(defaultLanguage: String): String = js.native
  @JSGlobal("CKEDITOR.lang.detect")
  @js.native
  def detect(defaultLanguage: String, probeLanguage: String): String = js.native
  
  @JSGlobal("CKEDITOR.lang.load")
  @js.native
  def load(
    languageCode: String,
    defaultLanguage: String,
    callback: js.Function2[/* code */ String, /* entries */ js.Any, Unit]
  ): Unit = js.native
}
