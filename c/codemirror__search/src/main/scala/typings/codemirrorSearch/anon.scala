package typings.codemirrorSearch

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CaseSensitive extends StObject {
    
    /**
      Controls whether the search should be case-sensitive.
      */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      By default, string search will replace `\n`, `\r`, and `\t` in
      the query with newline, return, and tab characters. When this
      is set to true, that behavior is disabled.
      */
    var literal: js.UndefOr[Boolean] = js.undefined
    
    /**
      When true, interpret the search string as a regular expression.
      */
    var regexp: js.UndefOr[Boolean] = js.undefined
    
    /**
      The replace text.
      */
    var replace: js.UndefOr[String] = js.undefined
    
    /**
      The search string.
      */
    var search: String
    
    /**
      Enable whole-word matching.
      */
    var wholeWord: js.UndefOr[Boolean] = js.undefined
  }
  object CaseSensitive {
    
    inline def apply(search: String): CaseSensitive = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaseSensitive]
    }
    
    extension [Self <: CaseSensitive](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      inline def setRegexp(value: Boolean): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setWholeWord(value: Boolean): Self = StObject.set(x, "wholeWord", value.asInstanceOf[js.Any])
      
      inline def setWholeWordUndefined: Self = StObject.set(x, "wholeWord", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var `match`: RegExpExecArray
    
    var to: Double
  }
  object From {
    
    inline def apply(from: Double, `match`: RegExpExecArray, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
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
    
    extension [Self <: To](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
