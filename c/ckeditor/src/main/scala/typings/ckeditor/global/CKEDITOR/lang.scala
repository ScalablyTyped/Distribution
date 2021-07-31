package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lang {
  
  @JSGlobal("CKEDITOR.lang")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def detect(defaultLanguage: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(defaultLanguage.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def detect(defaultLanguage: String, probeLanguage: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(defaultLanguage.asInstanceOf[js.Any], probeLanguage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def load(
    languageCode: String,
    defaultLanguage: String,
    callback: js.Function2[/* code */ String, /* entries */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(languageCode.asInstanceOf[js.Any], defaultLanguage.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
