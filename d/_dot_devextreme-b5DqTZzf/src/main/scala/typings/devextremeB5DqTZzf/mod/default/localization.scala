package typings.devextremeB5DqTZzf.mod.default

import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localization {
  
  @JSImport(".devextreme-b5DqTZzf", "default.localization")
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDate(value: js.Date, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMessage(key: String, values: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(List(key.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def formatNumber(value: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def loadMessages(messages: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadMessages")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  inline def locale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseDate(text: String, format: Format): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def parseNumber(text: String, format: Format): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
}
