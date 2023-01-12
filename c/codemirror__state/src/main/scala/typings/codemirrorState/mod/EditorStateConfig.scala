package typings.codemirrorState.mod

import typings.codemirrorState.anon.Anchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Options passed when [creating](https://codemirror.net/6/docs/ref/#state.EditorState^create) an
editor state.
*/
trait EditorStateConfig extends StObject {
  
  /**
    The initial document. Defaults to an empty document. Can be
    provided either as a plain string (which will be split into
    lines according to the value of the [`lineSeparator`
    facet](https://codemirror.net/6/docs/ref/#state.EditorState^lineSeparator)), or an instance of
    the [`Text`](https://codemirror.net/6/docs/ref/#state.Text) class (which is what the state will use
    to represent the document).
    */
  var doc: js.UndefOr[String | Text] = js.undefined
  
  /**
    [Extension(s)](https://codemirror.net/6/docs/ref/#state.Extension) to associate with this state.
    */
  var extensions: js.UndefOr[Extension] = js.undefined
  
  /**
    The starting selection. Defaults to a cursor at the very start
    of the document.
    */
  var selection: js.UndefOr[EditorSelection | Anchor] = js.undefined
}
object EditorStateConfig {
  
  inline def apply(): EditorStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorStateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorStateConfig] (val x: Self) extends AnyVal {
    
    inline def setDoc(value: String | Text): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setExtensions(value: Extension): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Any*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setSelection(value: EditorSelection | Anchor): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
