package typings.deku.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "vnode")
@js.native
object vnode extends js.Object {
  def createEmptyElement(): VirtualElement = js.native
  // function isValidAttribute<A>(value: A): boolean;
  /**
  		 * Create a node path, eg. (23,5,2,4) => '23.5.2.4'
  		 */
  def createPath(paths: (Double | String)*): String = js.native
  /**
  		 * Text nodes are stored as objects to keep things simple
  		 */
  def createTextElement(text: String): VirtualElement = js.native
  /**
  		 * Lazily-rendered virtual nodes
  		 */
  def createThunkElement[P, T, O](
    fn: js.Function1[/* model */ Model, VirtualElement],
    key: String,
    props: P,
    children: js.Array[T],
    options: O
  ): VirtualElement = js.native
  def isEmpty(vnode: VirtualElement): Boolean = js.native
  def isSameThunk(prevNode: VirtualElement, nextNode: VirtualElement): Boolean = js.native
  def isText(vnode: VirtualElement): Boolean = js.native
  def isThunk(vnode: VirtualElement): Boolean = js.native
  @js.native
  object create extends js.Object {
    def apply(`type`: String): VirtualElement = js.native
    def apply(`type`: Thunk): VirtualElement = js.native
    def apply[A](`type`: String, attributes: A, children: js.Any*): VirtualElement = js.native
    def apply[A](`type`: Thunk, attributes: A, children: js.Any*): VirtualElement = js.native
  }
  
}

