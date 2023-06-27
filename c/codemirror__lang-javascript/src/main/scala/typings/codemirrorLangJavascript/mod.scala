package typings.codemirrorLangJavascript

import typings.codemirrorAutocomplete.mod.Completion
import typings.codemirrorAutocomplete.mod.CompletionContext
import typings.codemirrorAutocomplete.mod.CompletionResult
import typings.codemirrorAutocomplete.mod.CompletionSource
import typings.codemirrorLangJavascript.anon.Jsx
import typings.codemirrorLangJavascript.anon.Name
import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.codemirrorLint.mod.Diagnostic
import typings.codemirrorState.mod.Extension
import typings.codemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-javascript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Extension that will automatically insert JSX close tags when a `>` or
  `/` is typed.
  */
  @JSImport("@codemirror/lang-javascript", "autoCloseTags")
  @js.native
  val autoCloseTags: Extension = js.native
  
  /**
  Helper function for defining JavaScript completion sources. It
  returns the completable name and object path for a completion
  context, or null if no name/property completion should happen at
  that position. For example, when completing after `a.b.c` it will
  return `{path: ["a", "b"], name: "c"}`. When completing after `x`
  it will return `{path: [], name: "x"}`. When not in a property or
  name, it will return null if `context.explicit` is false, and
  `{path: [], name: ""}` otherwise.
  */
  inline def completionPath(context: CompletionContext): Name | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("completionPath")(context.asInstanceOf[js.Any]).asInstanceOf[Name | Null]
  
  /**
  Connects an [ESLint](https://eslint.org/) linter to CodeMirror's
  [lint](https://codemirror.net/6/docs/ref/#lint) integration. `eslint` should be an instance of the
  [`Linter`](https://eslint.org/docs/developer-guide/nodejs-api#linter)
  class, and `config` an optional ESLint configuration. The return
  value of this function can be passed to [`linter`](https://codemirror.net/6/docs/ref/#lint.linter)
  to create a JavaScript linting extension.
  Note that ESLint targets node, and is tricky to run in the
  browser. The
  [eslint-linter-browserify](https://github.com/UziTech/eslint-linter-browserify)
  package may help with that (see
  [example](https://github.com/UziTech/eslint-linter-browserify/blob/master/example/script.js)).
  */
  inline def esLint(eslint: Any): js.Function1[/* view */ EditorView, js.Array[Diagnostic]] = ^.asInstanceOf[js.Dynamic].applyDynamic("esLint")(eslint.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* view */ EditorView, js.Array[Diagnostic]]]
  inline def esLint(eslint: Any, config: Any): js.Function1[/* view */ EditorView, js.Array[Diagnostic]] = (^.asInstanceOf[js.Dynamic].applyDynamic("esLint")(eslint.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* view */ EditorView, js.Array[Diagnostic]]]
  
  /**
  JavaScript support. Includes [snippet](https://codemirror.net/6/docs/ref/#lang-javascript.snippets)
  completion.
  */
  inline def javascript(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("javascript")().asInstanceOf[LanguageSupport]
  inline def javascript(config: Jsx): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("javascript")(config.asInstanceOf[js.Any]).asInstanceOf[LanguageSupport]
  
  /**
  A language provider based on the [Lezer JavaScript
  parser](https://github.com/lezer-parser/javascript), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-javascript", "javascriptLanguage")
  @js.native
  val javascriptLanguage: LRLanguage = js.native
  
  /**
  Language provider for JSX.
  */
  @JSImport("@codemirror/lang-javascript", "jsxLanguage")
  @js.native
  val jsxLanguage: LRLanguage = js.native
  
  /**
  Completion source that looks up locally defined names in
  JavaScript code.
  */
  inline def localCompletionSource(context: CompletionContext): CompletionResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("localCompletionSource")(context.asInstanceOf[js.Any]).asInstanceOf[CompletionResult | Null]
  
  /**
  Defines a [completion source](https://codemirror.net/6/docs/ref/#autocomplete.CompletionSource) that
  completes from the given scope object (for example `globalThis`).
  Will enter properties of the object when completing properties on
  a directly-named path.
  */
  inline def scopeCompletionSource(scope: Any): CompletionSource = ^.asInstanceOf[js.Dynamic].applyDynamic("scopeCompletionSource")(scope.asInstanceOf[js.Any]).asInstanceOf[CompletionSource]
  
  /**
  A collection of JavaScript-related
  [snippets](https://codemirror.net/6/docs/ref/#autocomplete.snippet).
  */
  @JSImport("@codemirror/lang-javascript", "snippets")
  @js.native
  val snippets: js.Array[Completion] = js.native
  
  /**
  Language provider for JSX + TypeScript.
  */
  @JSImport("@codemirror/lang-javascript", "tsxLanguage")
  @js.native
  val tsxLanguage: LRLanguage = js.native
  
  /**
  A language provider for TypeScript.
  */
  @JSImport("@codemirror/lang-javascript", "typescriptLanguage")
  @js.native
  val typescriptLanguage: LRLanguage = js.native
}
