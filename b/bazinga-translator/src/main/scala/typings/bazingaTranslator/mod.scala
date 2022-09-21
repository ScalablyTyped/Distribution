package typings.bazingaTranslator

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bazinga-translator", JSImport.Namespace)
  @js.native
  val ^ : BazingaTranslator = js.native
  
  @js.native
  trait BazingaTranslator extends StObject {
    
    /**
      * Adds a translation entry.
      *
      * @param id         The message id
      * @param message    The message to register for the given id
      * @param domain   The domain for the message or null to use the default
      * @param locale   The locale or null to use the default
      */
    def add(id: String, message: String): BazingaTranslator = js.native
    def add(id: String, message: String, domain: String): BazingaTranslator = js.native
    def add(id: String, message: String, domain: String, locale: String): BazingaTranslator = js.native
    def add(id: String, message: String, domain: Unit, locale: String): BazingaTranslator = js.native
    
    /**
      * Default domain.
      */
    var defaultDomain: String = js.native
    
    /**
      * Fallback locale.
      */
    var fallback: String = js.native
    
    /**
      * Loads translations from JSON.
      *
      * @param data     A JSON string or object literal
      */
    def fromJSON(data: String): BazingaTranslator = js.native
    
    /**
      * The current locale.
      */
    var locale: String = js.native
    
    /**
      * Placeholder prefix.
      */
    var placeHolderPrefix: String = js.native
    
    /**
      * Placeholder suffix.
      */
    var placeHolderSuffix: String = js.native
    
    /**
      * Plural separator.
      */
    var pluralSeparator: String = js.native
    
    def reset(): Unit = js.native
    
    /**
      * Translates the given message.
      *
      * @param id               The message id
      * @param parameters     An array of parameters for the message
      * @param domain         The domain for the message or null to guess it
      * @param locale         The locale or null to use the default
      */
    def trans(id: String): String = js.native
    def trans(id: String, parameters: Any): String = js.native
    def trans(id: String, parameters: Any, domain: String): String = js.native
    def trans(id: String, parameters: Any, domain: String, locale: String): String = js.native
    def trans(id: String, parameters: Any, domain: Unit, locale: String): String = js.native
    def trans(id: String, parameters: Unit, domain: String): String = js.native
    def trans(id: String, parameters: Unit, domain: String, locale: String): String = js.native
    def trans(id: String, parameters: Unit, domain: Unit, locale: String): String = js.native
    
    /**
      * Translates the given choice message by choosing a translation according to a number.
      *
      * @param id               The message id
      * @param number           The number to use to find the indice of the message
      * @param parameters     An array of parameters for the message
      * @param domain         The domain for the message or null to guess it
      * @param locale         The locale or null to use the default
      */
    def transChoice(id: String, number: Double): String = js.native
    def transChoice(id: String, number: Double, parameters: Any): String = js.native
    def transChoice(id: String, number: Double, parameters: Any, domain: String): String = js.native
    def transChoice(id: String, number: Double, parameters: Any, domain: String, locale: String): String = js.native
    def transChoice(id: String, number: Double, parameters: Any, domain: Unit, locale: String): String = js.native
    def transChoice(id: String, number: Double, parameters: Unit, domain: String): String = js.native
    def transChoice(id: String, number: Double, parameters: Unit, domain: String, locale: String): String = js.native
    def transChoice(id: String, number: Double, parameters: Unit, domain: Unit, locale: String): String = js.native
  }
  
  type _To = BazingaTranslator
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BazingaTranslator = ^
}
