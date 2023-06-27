package typings.codemirrorLangCss

import typings.codemirrorAutocomplete.mod.CompletionSource
import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.lezerCommon.distTreeMod.SyntaxNodeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Language support for CSS.
  */
  inline def css(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("css")().asInstanceOf[LanguageSupport]
  
  /**
  CSS property, variable, and value keyword completion source.
  */
  @JSImport("@codemirror/lang-css", "cssCompletionSource")
  @js.native
  val cssCompletionSource: CompletionSource = js.native
  
  /**
  A language provider based on the [Lezer CSS
  parser](https://github.com/lezer-parser/css), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-css", "cssLanguage")
  @js.native
  val cssLanguage: LRLanguage = js.native
  
  /**
  Create a completion source for a CSS dialect, providing a
  predicate for determining what kind of syntax node can act as a
  completable variable. This is used by language modes like Sass and
  Less to reuse this package's completion logic.
  */
  inline def defineCSSCompletionSource(isVariable: js.Function1[/* node */ SyntaxNodeRef, Boolean]): CompletionSource = ^.asInstanceOf[js.Dynamic].applyDynamic("defineCSSCompletionSource")(isVariable.asInstanceOf[js.Any]).asInstanceOf[CompletionSource]
}
