package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "defineMode")
@js.native
object defineMode extends js.Object {
  /**
    * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
    * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
    */
  def apply(id: String, modefactory: ModeFactory[_]): Unit = js.native
}

