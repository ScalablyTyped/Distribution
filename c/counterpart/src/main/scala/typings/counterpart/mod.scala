package typings.counterpart

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("counterpart", JSImport.Namespace)
  @js.native
  val ^ : Counterpart = js.native
  
  @js.native
  trait Counterpart extends StObject {
    
    def apply(key: String): String = js.native
    def apply(key: String, options: js.Object): String = js.native
    def apply(key: js.Array[String]): String = js.native
    def apply(key: js.Array[String], options: js.Object): String = js.native
    
    def Instance(key: String): String = js.native
    def Instance(key: String, options: js.Object): String = js.native
    def Instance(key: js.Array[String]): String = js.native
    def Instance(key: js.Array[String], options: js.Object): String = js.native
    @JSName("Instance")
    var Instance_Original: Counterpart = js.native
    
    def Translator(key: String): String = js.native
    def Translator(key: String, options: js.Object): String = js.native
    def Translator(key: js.Array[String]): String = js.native
    def Translator(key: js.Array[String], options: js.Object): String = js.native
    @JSName("Translator")
    var Translator_Original: Counterpart = js.native
    
    def getLocale(): String = js.native
    
    def localize(date: js.Date, options: js.Object): String = js.native
    
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
  
  type LocaleChangeHandler = js.Function2[/* newLocale */ String, /* oldLocale */ String, Unit]
  
  type NotFoundHandler = js.Function4[/* locale */ String, /* key */ String, /* fallback */ String, /* scope */ String, Unit]
  
  type _To = Counterpart
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Counterpart = ^
}
