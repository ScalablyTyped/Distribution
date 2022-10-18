package typings.cucumberGherkin

import typings.cucumberGherkin.distSrcItokenMod.IGherkinLine
import typings.cucumberGherkin.distSrcItokenMod.Item
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGherkinLineMod {
  
  @JSImport("@cucumber/gherkin/dist/src/GherkinLine", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with GherkinLine {
    def this(lineText: String, lineNumber: Double) = this()
    
    /* CompleteClass */
    var column: Double = js.native
    
    /* CompleteClass */
    override def getLineText(number: Double): String = js.native
    
    /* CompleteClass */
    override def getRestTrimmed(length: Double): String = js.native
    
    /* CompleteClass */
    override def getTableCells(): js.Array[Item] = js.native
    
    /* CompleteClass */
    @JSName("indent")
    override val indent_GherkinLine: Double = js.native
    
    /* CompleteClass */
    override val isEmpty: Boolean = js.native
    
    /* CompleteClass */
    override val lineNumber: Double = js.native
    
    /* CompleteClass */
    override val lineText: String = js.native
    
    /* CompleteClass */
    override def `match`(regexp: js.RegExp): RegExpMatchArray = js.native
    
    /* CompleteClass */
    override def startsWith(prefix: String): Boolean = js.native
    
    /* CompleteClass */
    override def startsWithTitleKeyword(keyword: String): Boolean = js.native
    
    /* CompleteClass */
    var text: String = js.native
    
    /* CompleteClass */
    override val trimmedLineText: String = js.native
  }
  
  trait GherkinLine
    extends StObject
       with IGherkinLine {
    
    var column: Double
    
    @JSName("indent")
    val indent_GherkinLine: Double
    
    val lineText: String
    
    def `match`(regexp: js.RegExp): RegExpMatchArray
    
    var text: String
  }
  object GherkinLine {
    
    inline def apply(
      column: Double,
      getLineText: Double => String,
      getRestTrimmed: Double => String,
      getTableCells: () => js.Array[Item],
      indent: Double,
      isEmpty: Boolean,
      lineNumber: Double,
      lineText: String,
      `match`: js.RegExp => RegExpMatchArray,
      startsWith: String => Boolean,
      startsWithTitleKeyword: String => Boolean,
      text: String,
      trimmedLineText: String
    ): GherkinLine = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], getLineText = js.Any.fromFunction1(getLineText), getRestTrimmed = js.Any.fromFunction1(getRestTrimmed), getTableCells = js.Any.fromFunction0(getTableCells), indent = indent.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], startsWith = js.Any.fromFunction1(startsWith), startsWithTitleKeyword = js.Any.fromFunction1(startsWithTitleKeyword), text = text.asInstanceOf[js.Any], trimmedLineText = trimmedLineText.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[GherkinLine]
    }
    
    extension [Self <: GherkinLine](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: js.RegExp => RegExpMatchArray): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
