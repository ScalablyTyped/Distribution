package typings.chrome.anon

import typings.chrome.chrome.contextMenus.CreateProperties
import typings.chrome.chrome.contextMenus.MenuClickedEvent
import typings.chrome.chrome.contextMenus.UpdateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofcontextMenus extends StObject {
  
  var ACTION_MENU_TOP_LEVEL_LIMIT: Double = js.native
  
  def create(createProperties: CreateProperties): Double | String = js.native
  def create(createProperties: CreateProperties, callback: js.Function0[Unit]): Double | String = js.native
  
  var onClicked: MenuClickedEvent = js.native
  
  def remove(menuItemId: String): Unit = js.native
  def remove(menuItemId: String, callback: js.Function0[Unit]): Unit = js.native
  def remove(menuItemId: Double): Unit = js.native
  def remove(menuItemId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function0[Unit]): Unit = js.native
  
  def update(id: String, updateProperties: UpdateProperties): Unit = js.native
  def update(id: String, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
  def update(id: Double, updateProperties: UpdateProperties): Unit = js.native
  def update(id: Double, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
}
