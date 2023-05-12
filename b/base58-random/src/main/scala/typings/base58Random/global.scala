package typings.base58Random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object base58 {
    
    /**
      * Generate random [base58 strings](https://en.wikipedia.org/wiki/Binary-to-text_encoding#Base58)
      * quickly with better [statistical dispersion](https://en.wikipedia.org/wiki/Statistical_dispersion)
      * than `Math.random()` unless Math.random is all that's available.
      *
      * @example
      * import base58 = require('base58-random');
      * base58(12); // 'KsykHbcCzUSL'
      */
    inline def apply(length: Double): String = ^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("base58")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generateBase58Browser(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBase58Browser")().asInstanceOf[String]
    
    inline def generateBase58Math(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBase58Math")().asInstanceOf[String]
    
    inline def generateBase58Node(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBase58Node")().asInstanceOf[String]
    
    inline def initBrowser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initBrowser")().asInstanceOf[Unit]
    
    inline def initMath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initMath")().asInstanceOf[Unit]
    
    inline def initNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initNode")().asInstanceOf[Unit]
    
    /**
      * Check whether a string is a base58 string.
      *
      * @example
      * import base58 = require('base58-random');
      *
      * base58.test('4rhdLsp32qn'); // true
      * base58.test('5HXx8Eznu0'); // false
      * base58.test('P-f6cA4e'); // false
      */
    inline def test(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
}
