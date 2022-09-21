package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Extension compartments can be used to make a configuration
dynamic. By [wrapping](https://codemirror.net/6/docs/ref/#state.Compartment.of) part of your
configuration in a compartment, you can later
[replace](https://codemirror.net/6/docs/ref/#state.Compartment.reconfigure) that part through a
transaction.
*/
@JSImport("@codemirror/state", "Compartment")
@js.native
open class Compartment () extends StObject {
  
  /**
    Get the current content of the compartment in the state, or
    `undefined` if it isn't present.
    */
  def get(state: EditorState): js.UndefOr[Extension] = js.native
  
  /**
    Create an instance of this compartment to add to your [state
    configuration](https://codemirror.net/6/docs/ref/#state.EditorStateConfig.extensions).
    */
  def of(ext: Extension): Extension = js.native
  
  /**
    Create an [effect](https://codemirror.net/6/docs/ref/#state.TransactionSpec.effects) that
    reconfigures this compartment.
    */
  def reconfigure(content: Extension): StateEffect[Any] = js.native
}
