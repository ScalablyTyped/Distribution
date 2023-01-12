package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateFieldSpec[Value] extends StObject {
  
  /**
    Compare two values of the field, returning `true` when they are
    the same. This is used to avoid recomputing facets that depend
    on the field when its value did not change. Defaults to using
    `===`.
    */
  var compare: js.UndefOr[js.Function2[/* a */ Value, /* b */ Value, Boolean]] = js.undefined
  
  /**
    Creates the initial value for the field when a state is created.
    */
  def create(state: EditorState): Value
  
  /**
    A function that deserializes the JSON representation of this
    field's content.
    */
  var fromJSON: js.UndefOr[js.Function2[/* json */ Any, /* state */ EditorState, Value]] = js.undefined
  
  /**
    Provide extensions based on this field. The given function will
    be called once with the initialized field. It will usually want
    to call some facet's [`from`](https://codemirror.net/6/docs/ref/#state.Facet.from) method to
    create facet inputs from this field, but can also return other
    extensions that should be enabled when the field is present in a
    configuration.
    */
  var provide: js.UndefOr[js.Function1[/* field */ StateField[Value], Extension]] = js.undefined
  
  /**
    A function used to serialize this field's content to JSON. Only
    necessary when this field is included in the argument to
    [`EditorState.toJSON`](https://codemirror.net/6/docs/ref/#state.EditorState.toJSON).
    */
  var toJSON: js.UndefOr[js.Function2[/* value */ Value, /* state */ EditorState, Any]] = js.undefined
  
  /**
    Compute a new value from the field's previous value and a
    [transaction](https://codemirror.net/6/docs/ref/#state.Transaction).
    */
  def update(value: Value, transaction: Transaction): Value
}
object StateFieldSpec {
  
  inline def apply[Value](create: EditorState => Value, update: (Value, Transaction) => Value): StateFieldSpec[Value] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[StateFieldSpec[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateFieldSpec[?], Value] (val x: Self & StateFieldSpec[Value]) extends AnyVal {
    
    inline def setCompare(value: (/* a */ Value, /* b */ Value) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setCreate(value: EditorState => Value): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setFromJSON(value: (/* json */ Any, /* state */ EditorState) => Value): Self = StObject.set(x, "fromJSON", js.Any.fromFunction2(value))
    
    inline def setFromJSONUndefined: Self = StObject.set(x, "fromJSON", js.undefined)
    
    inline def setProvide(value: /* field */ StateField[Value] => Extension): Self = StObject.set(x, "provide", js.Any.fromFunction1(value))
    
    inline def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
    
    inline def setToJSON(value: (/* value */ Value, /* state */ EditorState) => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction2(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setUpdate(value: (Value, Transaction) => Value): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
