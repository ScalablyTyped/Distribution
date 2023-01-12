package typings.bullBoard

import typings.bullBoard.anon.ReadonlyHighlightProps
import typings.bullBoard.bullBoardStrings.json
import typings.bullBoard.bullBoardStrings.stacktrace
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsHighlightHighlightMod {
  
  @JSImport("bull-board/dist/ui/components/Highlight/Highlight", "Highlight")
  @js.native
  open class Highlight protected ()
    extends Component[HighlightProps, js.Object, Any] {
    def this(props: HighlightProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HighlightProps, context: Any) = this()
    
    /* private */ var codeRef: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MHighlight(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHighlight(): Unit = js.native
    
    /* private */ var highlightCode: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MHighlight(nextProps: ReadonlyHighlightProps): Boolean = js.native
  }
  
  trait HighlightProps extends StObject {
    
    var children: String | Null
    
    var language: json | stacktrace
  }
  object HighlightProps {
    
    inline def apply(language: json | stacktrace): HighlightProps = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[HighlightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setLanguage(value: json | stacktrace): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
}
