package typings.deku.dekuMod

import typings.deku.dekuMod.diffNs.Actions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "diff")
@js.native
object diffNs extends js.Object {
  @js.native
  class Actions () extends js.Object {
    var _keys: js.Array[String] = js.native
    var _name: String = js.native
  }
  
  /**
  		 * Compare two virtual nodes and return an array of changes to turn the left into the right.
  		 */
  def diffNode(prevNode: VirtualElement, nextNode: VirtualElement): js.Array[_] = js.native
  /* static members */
  @js.native
  object Actions extends js.Object {
    def `case`(pat: js.Any, action: Actions): js.Any = js.native
    def insertBefore(a: Double): Actions = js.native
    def insertChild(a: js.Any, b: Double, c: String): Actions = js.native
    def removeAttribute(a: String, b: js.Any): Actions = js.native
    def removeChild(a: Double): Actions = js.native
    def removeNode(a: js.Any): Actions = js.native
    def replaceNode(a: js.Any, b: js.Any, c: String): Actions = js.native
    def sameNode(): Actions = js.native
    def setAttribute(a: String, b: js.Any, c: js.Any): Actions = js.native
    def updateChild(a: Double, b: js.Array[_]): Actions = js.native
    def updateChildren(a: js.Array[_]): Actions = js.native
    def updateThunk(a: js.Any, b: js.Any, c: String): Actions = js.native
  }
  
}

