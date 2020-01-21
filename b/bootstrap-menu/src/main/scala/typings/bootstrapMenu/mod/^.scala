package typings.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bootstrap-menu", JSImport.Namespace)
@js.native
class ^ protected () extends BootstrapMenu {
  /**
    * @param selector Css selector of the element to attach the Menu to
    * @param options Options to configure the menu
    */
  def this(selector: String, options: BootstrapMenuOptions) = this()
  /**
    * Close the context menu
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Close the menu and remove every event listeners
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

