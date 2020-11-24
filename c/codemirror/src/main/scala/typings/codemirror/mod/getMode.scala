package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "getMode")
@js.native
object getMode extends js.Object {
  
  /**
    * The first argument is a configuration object as passed to the mode constructor function, and the second argument
    * is a mode specification as in the EditorConfiguration mode option.
    */
  def apply[T](config: EditorConfiguration, mode: js.Any): Mode[T] = js.native
}
