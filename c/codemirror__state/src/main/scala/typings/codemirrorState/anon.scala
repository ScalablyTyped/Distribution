package typings.codemirrorState

import typings.codemirrorState.mod.ChangeSet
import typings.codemirrorState.mod.ChangeSpec
import typings.codemirrorState.mod.EditorSelection
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.SelectionRange
import typings.codemirrorState.mod.StateEffect
import typings.codemirrorState.mod.Text
import typings.codemirrorState.mod.Transaction
import typings.codemirrorState.mod._ChangeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Anchor extends StObject {
    
    var anchor: Double
    
    var head: js.UndefOr[Double] = js.undefined
  }
  object Anchor {
    
    inline def apply(anchor: Double): Anchor = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    extension [Self <: Anchor](x: Self) {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    }
  }
  
  trait Changes extends StObject {
    
    var changes: js.UndefOr[ChangeSpec] = js.undefined
    
    var effects: js.UndefOr[StateEffect[Any] | js.Array[StateEffect[Any]]] = js.undefined
    
    var range: SelectionRange
  }
  object Changes {
    
    inline def apply(range: SelectionRange): Changes = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changes]
    }
    
    extension [Self <: Changes](x: Self) {
      
      inline def setChanges(value: ChangeSpec): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
      
      inline def setChangesVarargs(value: Any*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setEffects(value: StateEffect[Any] | js.Array[StateEffect[Any]]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setEffectsVarargs(value: StateEffect[Any]*): Self = StObject.set(x, "effects", js.Array(value*))
      
      inline def setRange(value: SelectionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dispatch extends StObject {
    
    def dispatch(transaction: Transaction): Unit
    
    var state: EditorState
  }
  object Dispatch {
    
    inline def apply(dispatch: Transaction => Unit, state: EditorState): Dispatch = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch]
    }
    
    extension [Self <: Dispatch](x: Self) {
      
      inline def setDispatch(value: Transaction => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Effects extends StObject {
    
    var changes: ChangeSet
    
    var effects: js.Array[StateEffect[Any]]
    
    var selection: EditorSelection
  }
  object Effects {
    
    inline def apply(changes: ChangeSet, effects: js.Array[StateEffect[Any]], selection: EditorSelection): Effects = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Effects]
    }
    
    extension [Self <: Effects](x: Self) {
      
      inline def setChanges(value: ChangeSet): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: js.Array[StateEffect[Any]]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsVarargs(value: StateEffect[Any]*): Self = StObject.set(x, "effects", js.Array(value*))
      
      inline def setSelection(value: EditorSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extension extends StObject {
    
    var `extension`: Any
  }
  object Extension {
    
    inline def apply(`extension`: Any): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setExtension(value: Any): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    }
  }
  
  trait From
    extends StObject
       with _ChangeSpec {
    
    var from: Double
    
    var insert: js.UndefOr[String | Text] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object From {
    
    inline def apply(from: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: String | Text): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
