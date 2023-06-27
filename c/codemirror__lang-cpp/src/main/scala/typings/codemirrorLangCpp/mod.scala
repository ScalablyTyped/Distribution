package typings.codemirrorLangCpp

import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-cpp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Language support for C++.
  */
  inline def cpp(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("cpp")().asInstanceOf[LanguageSupport]
  
  /**
  A language provider based on the [Lezer C++
  parser](https://github.com/lezer-parser/cpp), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-cpp", "cppLanguage")
  @js.native
  val cppLanguage: LRLanguage = js.native
}
