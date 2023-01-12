package typings.codemirrorAutocomplete

import typings.codemirrorAutocomplete.mod.Completion
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Transaction
import typings.lezerCommon.mod.NodeType
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispatch extends StObject {
    
    def dispatch(tr: Transaction): Unit
    
    var state: EditorState
  }
  object Dispatch {
    
    inline def apply(dispatch: Transaction => Unit, state: EditorState): Dispatch = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dispatch] (val x: Self) extends AnyVal {
      
      inline def setDispatch(value: Transaction => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var text: String
    
    var to: Double
    
    var `type`: NodeType
  }
  object From {
    
    inline def apply(from: Double, text: String, to: Double, `type`: NodeType): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var position: Double
    
    def render(completion: Completion, state: EditorState): Node | Null
  }
  object Position {
    
    inline def apply(position: Double, render: (Completion, EditorState) => Node | Null): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (Completion, EditorState) => Node | Null): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  trait Text extends StObject {
    
    var from: Double
    
    var text: String
    
    var to: Double
  }
  object Text {
    
    inline def apply(from: Double, text: String, to: Double): Text = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
