package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "vnode")
@js.native
object vnodeNs extends js.Object {
  def createEmptyElement(): dekuLib.dekuMod.VirtualElement = js.native
  // function isValidAttribute<A>(value: A): boolean;
  /**
  		 * Create a node path, eg. (23,5,2,4) => '23.5.2.4'
  		 */
  def createPath(paths: (scala.Double | java.lang.String)*): java.lang.String = js.native
  /**
  		 * Text nodes are stored as objects to keep things simple
  		 */
  def createTextElement(text: java.lang.String): dekuLib.dekuMod.VirtualElement = js.native
  /**
  		 * Lazily-rendered virtual nodes
  		 */
  def createThunkElement[P, T, O](
    fn: js.Function1[/* model */ dekuLib.dekuMod.Model, dekuLib.dekuMod.VirtualElement],
    key: java.lang.String,
    props: P,
    children: js.Array[T],
    options: O
  ): dekuLib.dekuMod.VirtualElement = js.native
  def isEmpty(vnode: dekuLib.dekuMod.VirtualElement): scala.Boolean = js.native
  def isSameThunk(prevNode: dekuLib.dekuMod.VirtualElement, nextNode: dekuLib.dekuMod.VirtualElement): scala.Boolean = js.native
  def isText(vnode: dekuLib.dekuMod.VirtualElement): scala.Boolean = js.native
  def isThunk(vnode: dekuLib.dekuMod.VirtualElement): scala.Boolean = js.native
  @js.native
  object create extends js.Object {
    def apply(`type`: dekuLib.dekuMod.Thunk): dekuLib.dekuMod.VirtualElement = js.native
    def apply(`type`: java.lang.String): dekuLib.dekuMod.VirtualElement = js.native
    def apply[A](`type`: dekuLib.dekuMod.Thunk, attributes: A, children: js.Any*): dekuLib.dekuMod.VirtualElement = js.native
    def apply[A](`type`: java.lang.String, attributes: A, children: js.Any*): dekuLib.dekuMod.VirtualElement = js.native
  }
  
}

