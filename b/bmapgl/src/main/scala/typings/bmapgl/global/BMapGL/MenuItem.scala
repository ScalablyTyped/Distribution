package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.MenuItemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.MenuItem")
@js.native
open class MenuItem protected ()
  extends StObject
     with typings.bmapgl.BMapGL.MenuItem {
  def this(text: String, callback: js.Function1[/* point */ typings.bmapgl.BMapGL.Point, Unit]) = this()
  def this(
    text: String,
    callback: js.Function1[/* point */ typings.bmapgl.BMapGL.Point, Unit],
    opts: MenuItemOptions
  ) = this()
  
  /* CompleteClass */
  override def disable(): Unit = js.native
  
  /* CompleteClass */
  override def enable(): Unit = js.native
  
  /* CompleteClass */
  override def setIcon(iconUrl: String): Unit = js.native
  
  /* CompleteClass */
  override def setText(text: String): Unit = js.native
}
