package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  /**
    * Creates and initializes a slide out menu. Possible options: {dynamic: true, callback: function() { alert("Woohoo!");}}
    *
    * @return void
    */
  def apply(): js.Any = js.native
  def apply(options: Dynamic): js.Any = js.native
  
  /**
    * Populates a slideout menu.
    *
    * @return void
    */
  def populate(array: js.Array[js.Object]): Unit = js.native
}
