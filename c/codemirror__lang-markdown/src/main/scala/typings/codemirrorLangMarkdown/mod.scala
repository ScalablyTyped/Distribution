package typings.codemirrorLangMarkdown

import typings.codemirrorLangMarkdown.anon.AddKeymap
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.codemirrorLanguage.mod.Language_
import typings.codemirrorState.mod.StateCommand
import typings.codemirrorView.mod.KeyBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Language support for strict CommonMark.
  */
  @JSImport("@codemirror/lang-markdown", "commonmarkLanguage")
  @js.native
  val commonmarkLanguage: Language_ = js.native
  
  /**
  This command will, when invoked in a Markdown context with the
  cursor directly after list or blockquote markup, delete one level
  of markup. When the markup is for a list, it will be replaced by
  spaces on the first invocation (a further invocation will delete
  the spaces), to make it easy to continue a list.
  When not after Markdown block markup, this command will return
  false, so it is intended to be bound alongside other deletion
  commands, with a higher precedence than the more generic commands.
  */
  @JSImport("@codemirror/lang-markdown", "deleteMarkupBackward")
  @js.native
  val deleteMarkupBackward: StateCommand = js.native
  
  /**
  This command, when invoked in Markdown context with cursor
  selection(s), will create a new line with the markup for
  blockquotes and lists that were active on the old line. If the
  cursor was directly after the end of the markup for the old line,
  trailing whitespace and list markers are removed from that line.
  The command does nothing in non-Markdown context, so it should
  not be used as the only binding for Enter (even in a Markdown
  document, HTML and code regions might use a different language).
  */
  @JSImport("@codemirror/lang-markdown", "insertNewlineContinueMarkup")
  @js.native
  val insertNewlineContinueMarkup: StateCommand = js.native
  
  /**
  Markdown language support.
  */
  inline def markdown(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")().asInstanceOf[LanguageSupport]
  inline def markdown(config: AddKeymap): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(config.asInstanceOf[js.Any]).asInstanceOf[LanguageSupport]
  
  /**
  A small keymap with Markdown-specific bindings. Binds Enter to
  [`insertNewlineContinueMarkup`](https://codemirror.net/6/docs/ref/#lang-markdown.insertNewlineContinueMarkup)
  and Backspace to
  [`deleteMarkupBackward`](https://codemirror.net/6/docs/ref/#lang-markdown.deleteMarkupBackward).
  */
  @JSImport("@codemirror/lang-markdown", "markdownKeymap")
  @js.native
  val markdownKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Language support for [GFM](https://github.github.com/gfm/) plus
  subscript, superscript, and emoji syntax.
  */
  @JSImport("@codemirror/lang-markdown", "markdownLanguage")
  @js.native
  val markdownLanguage: Language_ = js.native
}
