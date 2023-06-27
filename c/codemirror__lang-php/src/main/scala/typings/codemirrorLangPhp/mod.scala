package typings.codemirrorLangPhp

import typings.codemirrorLangPhp.anon.BaseLanguage
import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-php", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  PHP language support.
  */
  inline def php(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("php")().asInstanceOf[LanguageSupport]
  inline def php(config: BaseLanguage): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("php")(config.asInstanceOf[js.Any]).asInstanceOf[LanguageSupport]
  
  /**
  A language provider based on the [Lezer PHP
  parser](https://github.com/lezer-parser/php), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-php", "phpLanguage")
  @js.native
  val phpLanguage: LRLanguage = js.native
}
