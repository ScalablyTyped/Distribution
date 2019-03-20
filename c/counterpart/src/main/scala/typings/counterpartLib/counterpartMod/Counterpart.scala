package typings
package counterpartLib.counterpartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Counterpart extends js.Object {
  @JSName("Instance")
  var Instance_Original: Counterpart = js.native
  @JSName("Translator")
  var Translator_Original: Counterpart = js.native
  def apply(key: java.lang.String): java.lang.String = js.native
  def apply(key: java.lang.String, options: js.Object): java.lang.String = js.native
  def apply(key: js.Array[java.lang.String]): java.lang.String = js.native
  def apply(key: js.Array[java.lang.String], options: js.Object): java.lang.String = js.native
  def Instance(key: java.lang.String): java.lang.String = js.native
  def Instance(key: java.lang.String, options: js.Object): java.lang.String = js.native
  def Instance(key: js.Array[java.lang.String]): java.lang.String = js.native
  def Instance(key: js.Array[java.lang.String], options: js.Object): java.lang.String = js.native
  def Translator(key: java.lang.String): java.lang.String = js.native
  def Translator(key: java.lang.String, options: js.Object): java.lang.String = js.native
  def Translator(key: js.Array[java.lang.String]): java.lang.String = js.native
  def Translator(key: js.Array[java.lang.String], options: js.Object): java.lang.String = js.native
  def getLocale(): java.lang.String = js.native
  def localize(date: stdLib.Date, options: js.Object): java.lang.String = js.native
  def offLocaleChange(callback: counterpartLib.LocaleChangeHandler): scala.Unit = js.native
  def offTranslationNotFound(callback: counterpartLib.NotFoundHandler): scala.Unit = js.native
  def onLocaleChange(callback: counterpartLib.LocaleChangeHandler): scala.Unit = js.native
  def onTranslationNotFound(callback: counterpartLib.NotFoundHandler): scala.Unit = js.native
  def registerInterpolations(data: js.Object): scala.Unit = js.native
  def registerTranslations(locale: java.lang.String, data: js.Object): scala.Unit = js.native
  def setFallbackLocale(value: java.lang.String): scala.Unit = js.native
  def setFallbackLocale(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setKeyTransformer(callback: js.Function2[/* value */ java.lang.String, /* options */ js.Object, java.lang.String]): java.lang.String = js.native
  def setLocale(value: java.lang.String): java.lang.String = js.native
  def setMissingEntryGenerator(callback: js.Function1[/* value */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setSeparator(value: java.lang.String): java.lang.String = js.native
  def translate(key: java.lang.String): java.lang.String = js.native
  def translate(key: java.lang.String, options: js.Object): java.lang.String = js.native
  def translate(key: js.Array[java.lang.String]): java.lang.String = js.native
  def translate(key: js.Array[java.lang.String], options: js.Object): java.lang.String = js.native
}

