package typings.codemirrorLanguage

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorLanguage.codemirrorLanguageStrings.dark
import typings.codemirrorLanguage.codemirrorLanguageStrings.light
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.codemirrorLanguage.mod.Language_
import typings.lezerCommon.mod.NodeType
import typings.lezerLr.mod.LRParser
import typings.styleMod.mod.StyleSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alias extends StObject {
    
    /**
      An optional array of alternative names.
      */
    var alias: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      An optional array of filename extensions associated with this
      language.
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      An optional filename pattern associated with this language.
      */
    var filename: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      A function that will asynchronously load the language.
      */
    var load: js.UndefOr[js.Function0[js.Promise[LanguageSupport]]] = js.undefined
    
    /**
      The language's name.
      */
    var name: String
    
    /**
      Alternatively to `load`, you can provide an already loaded
      support object. Either this or `load` should be provided.
      */
    var support: js.UndefOr[LanguageSupport] = js.undefined
  }
  object Alias {
    
    inline def apply(name: String): Alias = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilename(value: js.RegExp): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLoad(value: () => js.Promise[LanguageSupport]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSupport(value: LanguageSupport): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    }
  }
  
  trait Align extends StObject {
    
    var align: js.UndefOr[Boolean] = js.undefined
    
    var closing: String
    
    var units: js.UndefOr[Double] = js.undefined
  }
  object Align {
    
    inline def apply(closing: String): Align = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: Boolean): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setClosing(value: String): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  trait All extends StObject {
    
    /**
      Add a style to _all_ content. Probably only useful in
      combination with `scope`.
      */
    var all: js.UndefOr[String | StyleSpec] = js.undefined
    
    /**
      By default, highlighters apply to the entire document. You can
      scope them to a single language by providing the language
      object or a language's top node type here.
      */
    var scope: js.UndefOr[Language_ | NodeType] = js.undefined
    
    /**
      Specify that this highlight style should only be active then
      the theme is dark or light. By default, it is active
      regardless of theme.
      */
    var themeType: js.UndefOr[dark | light] = js.undefined
  }
  object All {
    
    inline def apply(): All = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      inline def setAll(value: String | StyleSpec): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setScope(value: Language_ | NodeType): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setThemeType(value: dark | light): Self = StObject.set(x, "themeType", value.asInstanceOf[js.Any])
      
      inline def setThemeTypeUndefined: Self = StObject.set(x, "themeType", js.undefined)
    }
  }
  
  trait Except extends StObject {
    
    var except: js.UndefOr[js.RegExp] = js.undefined
    
    var units: js.UndefOr[Double] = js.undefined
  }
  object Except {
    
    inline def apply(): Except = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Except]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Except] (val x: Self) extends AnyVal {
      
      inline def setExcept(value: js.RegExp): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  trait Fallback extends StObject {
    
    /**
      When enabled, this marks the highlighter as a fallback, which
      only takes effect if no other highlighters are registered.
      */
    var fallback: Boolean
  }
  object Fallback {
    
    inline def apply(fallback: Boolean): Fallback = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fallback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fallback] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var text: String
  }
  object From {
    
    inline def apply(from: Double, text: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait LanguageData extends StObject {
    
    /**
      [Language data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt)
      to register for this language.
      */
    var languageData: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      The parser to use. Should already have added editor-relevant
      node props (and optionally things like dialect and top rule)
      configured.
      */
    var parser: LRParser
  }
  object LanguageData {
    
    inline def apply(parser: LRParser): LanguageData = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageData] (val x: Self) extends AnyVal {
      
      inline def setLanguageData(value: StringDictionary[Any]): Self = StObject.set(x, "languageData", value.asInstanceOf[js.Any])
      
      inline def setLanguageDataUndefined: Self = StObject.set(x, "languageData", js.undefined)
      
      inline def setParser(value: LRParser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverrideIndentation extends StObject {
    
    /**
      Override line indentations provided to the indentation
      helper function, which is useful when implementing region
      indentation, where indentation for later lines needs to refer
      to previous lines, which may have been reindented compared to
      the original start state. If given, this function should
      return -1 for lines (given by start position) that didn't
      change, and an updated indentation otherwise.
      */
    var overrideIndentation: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.undefined
    
    /**
      Make it look, to the indent logic, like a line break was
      added at the given position (which is mostly just useful for
      implementing something like
      [`insertNewlineAndIndent`](https://codemirror.net/6/docs/ref/#commands.insertNewlineAndIndent)).
      */
    var simulateBreak: js.UndefOr[Double] = js.undefined
    
    /**
      When `simulateBreak` is given, this can be used to make the
      simulate break behave like a double line break.
      */
    var simulateDoubleBreak: js.UndefOr[Boolean] = js.undefined
  }
  object OverrideIndentation {
    
    inline def apply(): OverrideIndentation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideIndentation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverrideIndentation] (val x: Self) extends AnyVal {
      
      inline def setOverrideIndentation(value: /* pos */ Double => Double): Self = StObject.set(x, "overrideIndentation", js.Any.fromFunction1(value))
      
      inline def setOverrideIndentationUndefined: Self = StObject.set(x, "overrideIndentation", js.undefined)
      
      inline def setSimulateBreak(value: Double): Self = StObject.set(x, "simulateBreak", value.asInstanceOf[js.Any])
      
      inline def setSimulateBreakUndefined: Self = StObject.set(x, "simulateBreak", js.undefined)
      
      inline def setSimulateDoubleBreak(value: Boolean): Self = StObject.set(x, "simulateDoubleBreak", value.asInstanceOf[js.Any])
      
      inline def setSimulateDoubleBreakUndefined: Self = StObject.set(x, "simulateDoubleBreak", js.undefined)
    }
  }
  
  trait To extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object To {
    
    inline def apply(from: Double, to: Double): To = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[To]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: To] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
