package typings.codemirrorLangPython

import typings.codemirrorAutocomplete.mod.CompletionContext
import typings.codemirrorAutocomplete.mod.CompletionResult
import typings.codemirrorAutocomplete.mod.CompletionSource
import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-python", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Autocompletion for built-in Python globals and keywords.
  */
  @JSImport("@codemirror/lang-python", "globalCompletion")
  @js.native
  val globalCompletion: CompletionSource = js.native
  
  /**
  Completion source that looks up locally defined names in
  Python code.
  */
  inline def localCompletionSource(context: CompletionContext): CompletionResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("localCompletionSource")(context.asInstanceOf[js.Any]).asInstanceOf[CompletionResult | Null]
  
  /**
  Python language support.
  */
  inline def python(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("python")().asInstanceOf[LanguageSupport]
  
  /**
  A language provider based on the [Lezer Python
  parser](https://github.com/lezer-parser/python), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-python", "pythonLanguage")
  @js.native
  val pythonLanguage: LRLanguage = js.native
}
