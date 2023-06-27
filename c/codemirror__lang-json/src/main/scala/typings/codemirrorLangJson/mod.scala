package typings.codemirrorLangJson

import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.codemirrorLint.mod.Diagnostic
import typings.codemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  JSON language support.
  */
  inline def json(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("json")().asInstanceOf[LanguageSupport]
  
  /**
  A language provider that provides JSON parsing.
  */
  @JSImport("@codemirror/lang-json", "jsonLanguage")
  @js.native
  val jsonLanguage: LRLanguage = js.native
  
  /**
  Calls
  [`JSON.parse`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse)
  on the document and, if that throws an error, reports it as a
  single diagnostic.
  */
  inline def jsonParseLinter(): js.Function1[/* view */ EditorView, js.Array[Diagnostic]] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonParseLinter")().asInstanceOf[js.Function1[/* view */ EditorView, js.Array[Diagnostic]]]
}
