package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "diff")
@js.native
object diffNs extends js.Object {
  @js.native
  class Actions () extends js.Object {
    var _keys: js.Array[java.lang.String] = js.native
    var _name: java.lang.String = js.native
  }
  
  /**
  		 * Compare two virtual nodes and return an array of changes to turn the left into the right.
  		 */
  def diffNode(prevNode: dekuLib.dekuMod.VirtualElement, nextNode: dekuLib.dekuMod.VirtualElement): js.Array[_] = js.native
  /* static members */
  @js.native
  object Actions extends js.Object {
    def `case`(pat: js.Any, action: dekuLib.dekuMod.diffNs.Actions): js.Any = js.native
    def insertBefore(a: scala.Double): dekuLib.dekuMod.diffNs.Actions = js.native
    def insertChild(a: js.Any, b: scala.Double, c: java.lang.String): dekuLib.dekuMod.diffNs.Actions = js.native
    def removeAttribute(a: java.lang.String, b: js.Any): dekuLib.dekuMod.diffNs.Actions = js.native
    def removeChild(a: scala.Double): dekuLib.dekuMod.diffNs.Actions = js.native
    def removeNode(a: js.Any): dekuLib.dekuMod.diffNs.Actions = js.native
    def replaceNode(a: js.Any, b: js.Any, c: java.lang.String): dekuLib.dekuMod.diffNs.Actions = js.native
    def sameNode(): dekuLib.dekuMod.diffNs.Actions = js.native
    def setAttribute(a: java.lang.String, b: js.Any, c: js.Any): dekuLib.dekuMod.diffNs.Actions = js.native
    def updateChild(a: scala.Double, b: js.Array[_]): dekuLib.dekuMod.diffNs.Actions = js.native
    def updateChildren(a: js.Array[_]): dekuLib.dekuMod.diffNs.Actions = js.native
    def updateThunk(a: js.Any, b: js.Any, c: java.lang.String): dekuLib.dekuMod.diffNs.Actions = js.native
  }
  
}

