package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  var atrule: js.UndefOr[String] = js.undefined
  
  var column: js.UndefOr[Double] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var onParseError: js.UndefOr[js.Function2[/* error */ SyntaxParseError, /* fallbackNode */ CssNode, Unit]] = js.undefined
  
  var parseAtrulePrelude: js.UndefOr[Boolean] = js.undefined
  
  var parseCustomProperty: js.UndefOr[Boolean] = js.undefined
  
  var parseRulePrelude: js.UndefOr[Boolean] = js.undefined
  
  var parseValue: js.UndefOr[Boolean] = js.undefined
  
  var positions: js.UndefOr[Boolean] = js.undefined
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtrule(value: String): Self = StObject.set(x, "atrule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtruleUndefined: Self = StObject.set(x, "atrule", js.undefined)
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnParseError(value: (/* error */ SyntaxParseError, /* fallbackNode */ CssNode) => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
    
    @scala.inline
    def setParseAtrulePrelude(value: Boolean): Self = StObject.set(x, "parseAtrulePrelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseAtrulePreludeUndefined: Self = StObject.set(x, "parseAtrulePrelude", js.undefined)
    
    @scala.inline
    def setParseCustomProperty(value: Boolean): Self = StObject.set(x, "parseCustomProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseCustomPropertyUndefined: Self = StObject.set(x, "parseCustomProperty", js.undefined)
    
    @scala.inline
    def setParseRulePrelude(value: Boolean): Self = StObject.set(x, "parseRulePrelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseRulePreludeUndefined: Self = StObject.set(x, "parseRulePrelude", js.undefined)
    
    @scala.inline
    def setParseValue(value: Boolean): Self = StObject.set(x, "parseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseValueUndefined: Self = StObject.set(x, "parseValue", js.undefined)
    
    @scala.inline
    def setPositions(value: Boolean): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
  }
}
