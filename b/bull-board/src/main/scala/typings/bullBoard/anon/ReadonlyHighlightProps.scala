package typings.bullBoard.anon

import typings.bullBoard.bullBoardStrings.json
import typings.bullBoard.bullBoardStrings.stacktrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bull-board.bull-board/dist/ui/components/Highlight/Highlight.HighlightProps> */
trait ReadonlyHighlightProps extends StObject {
  
  val children: js.UndefOr[String | Null] = js.undefined
  
  val language: json | stacktrace
}
object ReadonlyHighlightProps {
  
  inline def apply(language: json | stacktrace): ReadonlyHighlightProps = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHighlightProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyHighlightProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLanguage(value: json | stacktrace): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
