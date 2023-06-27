package typings.chrome.anon

import typings.chrome.chrome.sidePanel.GetPanelOptions
import typings.chrome.chrome.sidePanel.PanelBehavior
import typings.chrome.chrome.sidePanel.PanelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsidePanel extends StObject {
  
  def getOptions(options: GetPanelOptions): js.Promise[PanelOptions] = js.native
  def getOptions(options: GetPanelOptions, callback: js.Function1[/* options */ PanelOptions, Unit]): js.Promise[PanelOptions] = js.native
  
  def getPanelBehavior(): js.Promise[PanelBehavior] = js.native
  def getPanelBehavior(callback: js.Function1[/* behavior */ PanelBehavior, Unit]): js.Promise[PanelBehavior] = js.native
  
  def setOptions(options: PanelOptions): js.Promise[Unit] = js.native
  def setOptions(options: PanelOptions, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def setPanelBehavior(behavior: PanelBehavior): js.Promise[Unit] = js.native
  def setPanelBehavior(behavior: PanelBehavior, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
}
