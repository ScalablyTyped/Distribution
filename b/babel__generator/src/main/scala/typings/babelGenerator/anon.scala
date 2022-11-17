package typings.babelGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compact extends StObject {
    
    /**
      * The compact option takes a boolean value (true or false), and defaults to true (enabled). When enabled,
      * the output for arrays and objects is as compact as possible; it’s not formatted nicely.
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The es6 option takes a boolean value (true or false), and defaults to false (disabled). When enabled, any
      * astral Unicode symbols in the input are escaped using ECMAScript 6 Unicode code point escape sequences
      * instead of using separate escape sequences for each surrogate half. If backwards compatibility with ES5
      * environments is a concern, don’t enable this setting. If the json setting is enabled, the value for the es6
      * setting is ignored (as if it was false).
      */
    var es6: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The escapeEverything option takes a boolean value (true or false), and defaults to false (disabled). When
      * enabled, all the symbols in the output are escaped — even printable ASCII symbols.
      */
    var escapeEverything: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The indent option takes a string value, and defaults to '\t'. When the compact setting is enabled (true),
      * the value of the indent option is used to format the output for arrays and objects.
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * The indentLevel option takes a numeric value, and defaults to 0. It represents the current indentation level,
      * i.e. the number of times the value of the indent option is repeated.
      */
    var indentLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * The isScriptContext option takes a boolean value (true or false), and defaults to false (disabled). When
      * enabled, occurrences of </script and </style in the output are escaped as <\/script and <\/style, and <!--
      * is escaped as \x3C!-- (or \\u003C!-- when the json option is enabled). This setting is useful when jsesc’s
      * output ends up as part of a <script> or <style> element in an HTML document.
      */
    var isScriptContext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The json option takes a boolean value (true or false), and defaults to false (disabled). When enabled, the
      * output is valid JSON. Hexadecimal character escape sequences and the \v or \0 escape sequences are not used.
      * Setting json: true implies quotes: 'double', wrap: true, es6: false, although these values can still be
      * overridden if needed — but in such cases, the output won’t be valid JSON anymore.
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The lowercaseHex option takes a boolean value (true or false), and defaults to false (disabled). When enabled,
      * any alphabetical hexadecimal digits in escape sequences as well as any hexadecimal integer literals (see the
      * numbers option) in the output are in lowercase.
      */
    var lowercaseHex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The minimal option takes a boolean value (true or false), and defaults to false (disabled). When enabled,
      * only a limited set of symbols in the output are escaped: \0, \b, \t, \n, \f, \r, \\, \\u2028, \\u2029.
      */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the numbers option is 'decimal'. This means that any numeric values are represented
      * using decimal integer literals. Other valid options are binary, octal, and hexadecimal, which result in
      * binary integer literals, octal integer literals, and hexadecimal integer literals, respectively.
      */
    var numbers: js.UndefOr["binary" | "octal" | "decimal" | "hexadecimal"] = js.undefined
    
    /**
      * The default value for the quotes option is 'single'. This means that any occurrences of ' in the input
      * string are escaped as \', so that the output can be used in a string literal wrapped in single quotes.
      */
    var quotes: js.UndefOr["single" | "double" | "backtick"] = js.undefined
    
    /**
      * The wrap option takes a boolean value (true or false), and defaults to false (disabled). When enabled, the
      * output is a valid JavaScript string literal wrapped in quotes. The type of quotes can be specified through
      * the quotes setting.
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object Compact {
    
    inline def apply(): Compact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compact]
    }
    
    extension [Self <: Compact](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setEs6(value: Boolean): Self = StObject.set(x, "es6", value.asInstanceOf[js.Any])
      
      inline def setEs6Undefined: Self = StObject.set(x, "es6", js.undefined)
      
      inline def setEscapeEverything(value: Boolean): Self = StObject.set(x, "escapeEverything", value.asInstanceOf[js.Any])
      
      inline def setEscapeEverythingUndefined: Self = StObject.set(x, "escapeEverything", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
      
      inline def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIsScriptContext(value: Boolean): Self = StObject.set(x, "isScriptContext", value.asInstanceOf[js.Any])
      
      inline def setIsScriptContextUndefined: Self = StObject.set(x, "isScriptContext", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setLowercaseHex(value: Boolean): Self = StObject.set(x, "lowercaseHex", value.asInstanceOf[js.Any])
      
      inline def setLowercaseHexUndefined: Self = StObject.set(x, "lowercaseHex", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setNumbers(value: "binary" | "octal" | "decimal" | "hexadecimal"): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
      
      inline def setQuotes(value: "single" | "double" | "backtick"): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait File extends StObject {
    
    var file: String
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: Double
  }
  object File {
    
    inline def apply(
      file: String,
      mappings: String,
      names: js.Array[String],
      sources: js.Array[String],
      version: Double
    ): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
