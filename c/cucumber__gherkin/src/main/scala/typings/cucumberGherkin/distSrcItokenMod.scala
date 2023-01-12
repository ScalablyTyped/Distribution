package typings.cucumberGherkin

import typings.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType
import typings.cucumberMessages.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcItokenMod {
  
  trait IGherkinLine extends StObject {
    
    def getLineText(number: Double): String
    
    def getRestTrimmed(length: Double): String
    
    def getTableCells(): js.Array[Item]
    
    val indent: js.UndefOr[Double] = js.undefined
    
    val isEmpty: Boolean
    
    val lineNumber: Double
    
    def startsWith(prefix: String): Boolean
    
    def startsWithTitleKeyword(keyword: String): Boolean
    
    val trimmedLineText: String
  }
  object IGherkinLine {
    
    inline def apply(
      getLineText: Double => String,
      getRestTrimmed: Double => String,
      getTableCells: () => js.Array[Item],
      isEmpty: Boolean,
      lineNumber: Double,
      startsWith: String => Boolean,
      startsWithTitleKeyword: String => Boolean,
      trimmedLineText: String
    ): IGherkinLine = {
      val __obj = js.Dynamic.literal(getLineText = js.Any.fromFunction1(getLineText), getRestTrimmed = js.Any.fromFunction1(getRestTrimmed), getTableCells = js.Any.fromFunction0(getTableCells), isEmpty = isEmpty.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], startsWith = js.Any.fromFunction1(startsWith), startsWithTitleKeyword = js.Any.fromFunction1(startsWithTitleKeyword), trimmedLineText = trimmedLineText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGherkinLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGherkinLine] (val x: Self) extends AnyVal {
      
      inline def setGetLineText(value: Double => String): Self = StObject.set(x, "getLineText", js.Any.fromFunction1(value))
      
      inline def setGetRestTrimmed(value: Double => String): Self = StObject.set(x, "getRestTrimmed", js.Any.fromFunction1(value))
      
      inline def setGetTableCells(value: () => js.Array[Item]): Self = StObject.set(x, "getTableCells", js.Any.fromFunction0(value))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setStartsWith(value: String => Boolean): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
      
      inline def setStartsWithTitleKeyword(value: String => Boolean): Self = StObject.set(x, "startsWithTitleKeyword", js.Any.fromFunction1(value))
      
      inline def setTrimmedLineText(value: String): Self = StObject.set(x, "trimmedLineText", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToken[TokenType] extends StObject {
    
    def detach(): Unit
    
    def getTokenValue(): String
    
    var isEof: Boolean
    
    var line: IGherkinLine
    
    var location: Location
    
    var matchedGherkinDialect: String
    
    var matchedIndent: Double
    
    var matchedItems: js.Array[Item]
    
    var matchedKeyword: String
    
    var matchedKeywordType: StepKeywordType
    
    var matchedText: js.UndefOr[String] = js.undefined
    
    var matchedType: TokenType
  }
  object IToken {
    
    inline def apply[TokenType](
      detach: () => Unit,
      getTokenValue: () => String,
      isEof: Boolean,
      line: IGherkinLine,
      location: Location,
      matchedGherkinDialect: String,
      matchedIndent: Double,
      matchedItems: js.Array[Item],
      matchedKeyword: String,
      matchedKeywordType: StepKeywordType,
      matchedType: TokenType
    ): IToken[TokenType] = {
      val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getTokenValue = js.Any.fromFunction0(getTokenValue), isEof = isEof.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchedGherkinDialect = matchedGherkinDialect.asInstanceOf[js.Any], matchedIndent = matchedIndent.asInstanceOf[js.Any], matchedItems = matchedItems.asInstanceOf[js.Any], matchedKeyword = matchedKeyword.asInstanceOf[js.Any], matchedKeywordType = matchedKeywordType.asInstanceOf[js.Any], matchedType = matchedType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToken[TokenType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IToken[?], TokenType] (val x: Self & IToken[TokenType]) extends AnyVal {
      
      inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      inline def setGetTokenValue(value: () => String): Self = StObject.set(x, "getTokenValue", js.Any.fromFunction0(value))
      
      inline def setIsEof(value: Boolean): Self = StObject.set(x, "isEof", value.asInstanceOf[js.Any])
      
      inline def setLine(value: IGherkinLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatchedGherkinDialect(value: String): Self = StObject.set(x, "matchedGherkinDialect", value.asInstanceOf[js.Any])
      
      inline def setMatchedIndent(value: Double): Self = StObject.set(x, "matchedIndent", value.asInstanceOf[js.Any])
      
      inline def setMatchedItems(value: js.Array[Item]): Self = StObject.set(x, "matchedItems", value.asInstanceOf[js.Any])
      
      inline def setMatchedItemsVarargs(value: Item*): Self = StObject.set(x, "matchedItems", js.Array(value*))
      
      inline def setMatchedKeyword(value: String): Self = StObject.set(x, "matchedKeyword", value.asInstanceOf[js.Any])
      
      inline def setMatchedKeywordType(value: StepKeywordType): Self = StObject.set(x, "matchedKeywordType", value.asInstanceOf[js.Any])
      
      inline def setMatchedText(value: String): Self = StObject.set(x, "matchedText", value.asInstanceOf[js.Any])
      
      inline def setMatchedTextUndefined: Self = StObject.set(x, "matchedText", js.undefined)
      
      inline def setMatchedType(value: TokenType): Self = StObject.set(x, "matchedType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item extends StObject {
    
    var column: Double
    
    var text: String
  }
  object Item {
    
    inline def apply(column: Double, text: String): Item = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
