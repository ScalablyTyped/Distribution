package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container[TLayout, TItemLayout] extends Component {
  /**
    * A copy of the child items array. This cannot be added to directly -
    * components must be created using the create methods instead
    */
  val items: js.Array[Component] = js.native
  /**
    * Creates a child component and adds it to this container.
    * Adding component to multiple containers is not supported
    *
    * @param component the component to be added
    * @param [itemLayout] Optional layout for this child item
    */
  def addItem(component: Component): Unit = js.native
  def addItem(component: Component, itemLayout: TItemLayout): Unit = js.native
  /**
    * Creates a collection of child components and adds them all to this container
    *
    * @param itemConfigs the definitions
    * @param [itemLayout] Optional layout for the child items
    */
  def addItems(itemConfigs: js.Array[Component]): Unit = js.native
  def addItems(itemConfigs: js.Array[Component], itemLayout: TItemLayout): Unit = js.native
  /**
    * Removes all child items from this container
    */
  def clearItems(): Unit = js.native
  /**
    * Creates a child component and inserts it to this container. Returns error given invalid index
    * Adding component to multiple containers is not supported
    * @param component the component to be added
    * @param index the index to insert the component to
    * @param [itemLayout] Optional layout for this child item
    */
  def insertItem(component: Component, index: Double): Unit = js.native
  def insertItem(component: Component, index: Double, itemLayout: TItemLayout): Unit = js.native
  /**
    *
    * @param component Removes a component from this container
    */
  def removeItem(component: Component): Boolean = js.native
  /**
    * Defines the layout for this container
    *
    * @param layout object
    */
  def setLayout(layout: TLayout): Unit = js.native
}

