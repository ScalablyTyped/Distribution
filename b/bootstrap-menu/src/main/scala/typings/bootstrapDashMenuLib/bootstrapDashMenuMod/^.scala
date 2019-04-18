package typings
package bootstrapDashMenuLib.bootstrapDashMenuMod

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
  def this(selector: java.lang.String, options: BootstrapMenuOptions) = this()
  /**
    * Close the context menu
    */
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /**
    * Close the menu and remove every event listeners
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
}

