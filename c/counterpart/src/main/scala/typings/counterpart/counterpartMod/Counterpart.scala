package typings.counterpart.counterpartMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Counterpart extends js.Object {
  @JSName("Instance")
  var Instance_Original: Counterpart = js.native
  @JSName("Translator")
  var Translator_Original: Counterpart = js.native
  def apply(key: String): String = js.native
  def apply(key: String, options: js.Object): String = js.native
  def apply(key: js.Array[String]): String = js.native
  def apply(key: js.Array[String], options: js.Object): String = js.native
  def Instance(key: String): String = js.native
  def Instance(key: String, options: js.Object): String = js.native
  def Instance(key: js.Array[String]): String = js.native
  def Instance(key: js.Array[String], options: js.Object): String = js.native
  def Translator(key: String): String = js.native
  def Translator(key: String, options: js.Object): String = js.native
  def Translator(key: js.Array[String]): String = js.native
  def Translator(key: js.Array[String], options: js.Object): String = js.native
  def getLocale(): String = js.native
  def localize(date: Date, options: js.Object): String = js.native
  def offLocaleChange(callback: LocaleChangeHandler): Unit = js.native
  def offTranslationNotFound(callback: NotFoundHandler): Unit = js.native
  def onLocaleChange(callback: LocaleChangeHandler): Unit = js.native
  def onTranslationNotFound(callback: NotFoundHandler): Unit = js.native
  def registerInterpolations(data: js.Object): Unit = js.native
  def registerTranslations(locale: String, data: js.Object): Unit = js.native
  def setFallbackLocale(value: String): Unit = js.native
  def setFallbackLocale(value: js.Array[String]): Unit = js.native
  def setKeyTransformer(callback: js.Function2[/* value */ String, /* options */ js.Object, String]): String = js.native
  def setLocale(value: String): String = js.native
  def setMissingEntryGenerator(callback: js.Function1[/* value */ String, Unit]): Unit = js.native
  def setSeparator(value: String): String = js.native
  def translate(key: String): String = js.native
  def translate(key: String, options: js.Object): String = js.native
  def translate(key: js.Array[String]): String = js.native
  def translate(key: js.Array[String], options: js.Object): String = js.native
}

