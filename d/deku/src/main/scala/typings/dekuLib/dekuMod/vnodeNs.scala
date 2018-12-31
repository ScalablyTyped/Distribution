package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "vnode")
@js.native
object vnodeNs extends js.Object {
  var create: dekuLib.Anon_Type = js.native
  def createEmptyElement(): dekuLib.dekuMod.dekuNs.VirtualElement = js.native
  // function isValidAttribute<A>(value: A): boolean;
  /**
  		 * Create a node path, eg. (23,5,2,4) => '23.5.2.4'
  		 */
  def createPath(paths: (scala.Double | java.lang.String)*): java.lang.String = js.native
  /**
  		 * Text nodes are stored as objects to keep things simple
  		 */
  def createTextElement(text: java.lang.String): dekuLib.dekuMod.dekuNs.VirtualElement = js.native
  /**
  		 * Lazily-rendered virtual nodes
  		 */
  def createThunkElement[P, T, O](
    fn: js.Function1[/* model */ dekuLib.dekuMod.Model, dekuLib.dekuMod.dekuNs.VirtualElement],
    key: java.lang.String,
    props: P,
    children: js.Array[T],
    options: O
  ): dekuLib.dekuMod.dekuNs.VirtualElement = js.native
  def isEmpty(vnode: dekuLib.dekuMod.dekuNs.VirtualElement): scala.Boolean = js.native
  def isSameThunk(prevNode: dekuLib.dekuMod.dekuNs.VirtualElement, nextNode: dekuLib.dekuMod.dekuNs.VirtualElement): scala.Boolean = js.native
  def isText(vnode: dekuLib.dekuMod.dekuNs.VirtualElement): scala.Boolean = js.native
  def isThunk(vnode: dekuLib.dekuMod.dekuNs.VirtualElement): scala.Boolean = js.native
}

