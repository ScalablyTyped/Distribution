package typings.codemirrorLangRust

import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-rust", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Rust language support
  */
  inline def rust(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("rust")().asInstanceOf[LanguageSupport]
  
  /**
  A syntax provider based on the [Lezer Rust
  parser](https://github.com/lezer-parser/rust), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-rust", "rustLanguage")
  @js.native
  val rustLanguage: LRLanguage = js.native
}
