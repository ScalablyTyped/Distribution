package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A facet is a labeled value that is associated with an editor
state. It takes inputs from any number of extensions, and combines
those into a single output value.
Examples of uses of facets are the [tab
size](https://codemirror.net/6/docs/ref/#state.EditorState^tabSize), [editor
attributes](https://codemirror.net/6/docs/ref/#view.EditorView^editorAttributes), and [update
listeners](https://codemirror.net/6/docs/ref/#view.EditorView^updateListener).
*/
@JSImport("@codemirror/state", "Facet")
@js.native
/* private */ open class Facet[Input, Output] () extends StObject {
  
  /**
    Create an extension that computes a value for the facet from a
    state. You must take care to declare the parts of the state that
    this value depends on, since your function is only called again
    for a new state when one of those parts changed.
    
    In cases where your value depends only on a single field, you'll
    want to use the [`from`](https://codemirror.net/6/docs/ref/#state.Facet.from) method instead.
    */
  def compute(deps: js.Array[Slot[Any]], get: js.Function1[/* state */ EditorState, Input]): Extension = js.native
  
  /**
    Create an extension that computes zero or more values for this
    facet from a state.
    */
  def computeN(deps: js.Array[Slot[Any]], get: js.Function1[/* state */ EditorState, js.Array[Input]]): Extension = js.native
  
  /**
    Shorthand method for registering a facet source with a state
    field as input. If the field's type corresponds to this facet's
    input type, the getter function can be omitted. If given, it
    will be used to retrieve the input from the field value.
    */
  def from[T /* <: Input */](field: StateField[T]): Extension = js.native
  def from[T](field: StateField[T], get: js.Function1[/* value */ T, Input]): Extension = js.native
  
  /* private */ var isStatic: Any = js.native
  
  /**
    Returns an extension that adds the given value to this facet.
    */
  def of(value: Input): Extension = js.native
}
object Facet {
  
  @JSImport("@codemirror/state", "Facet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Define a new facet.
    */
  /* static member */
  inline def define[Input, Output](): Facet[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[Facet[Input, Output]]
  inline def define[Input, Output](config: FacetConfig[Input, Output]): Facet[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(config.asInstanceOf[js.Any]).asInstanceOf[Facet[Input, Output]]
}
