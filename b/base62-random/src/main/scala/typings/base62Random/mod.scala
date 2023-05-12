package typings.base62Random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate random [base62 strings] (https://helloacm.com/base62/) with better
    * [statistical dispersion](https://en.wikipedia.org/wiki/Statistical_dispersion)
    * than `Math.random()` unless Math.random is all that's available.
    *
    * @example
    * import base62 = require('base62-random');
    *
    * base62(12); // 'KsykHbcCzUSL'
    */
  inline def apply(length: Double): String = ^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("base62-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateBase62Browser(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBase62Browser")().asInstanceOf[String]
  
  inline def generateBase62Math(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBase62Math")().asInstanceOf[String]
  
  inline def generateBase62Node(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBase62Node")().asInstanceOf[String]
  
  inline def initBrowser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initBrowser")().asInstanceOf[Unit]
  
  inline def initMath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initMath")().asInstanceOf[Unit]
  
  inline def initNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initNode")().asInstanceOf[Unit]
  
  /**
    * Check whether a string is a base62 string.
    *
    * @example
    * import base62 = require('base62-random');
    *
    * base62.test('5HXx8Eznu0'); // true
    * base62.test('P-f6cA4e'); // false
    */
  inline def test(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
}
