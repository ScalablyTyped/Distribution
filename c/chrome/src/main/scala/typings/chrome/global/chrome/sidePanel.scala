package typings.chrome.global.chrome

import typings.chrome.chrome.sidePanel.GetPanelOptions
import typings.chrome.chrome.sidePanel.PanelBehavior
import typings.chrome.chrome.sidePanel.PanelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// SidePanel
////////////////////
/**
  * Availability: @since Chrome 114. Manifest v3.
  * https://developer.chrome.com/docs/extensions/reference/sidePanel/
  * Permissions: "sidePanel"
  */
object sidePanel {
  
  @JSGlobal("chrome.sidePanel")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptions(options: GetPanelOptions): js.Promise[PanelOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PanelOptions]]
  inline def getOptions(options: GetPanelOptions, callback: js.Function1[/* options */ PanelOptions, Unit]): js.Promise[PanelOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PanelOptions]]
  
  inline def getPanelBehavior(): js.Promise[PanelBehavior] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPanelBehavior")().asInstanceOf[js.Promise[PanelBehavior]]
  inline def getPanelBehavior(callback: js.Function1[/* behavior */ PanelBehavior, Unit]): js.Promise[PanelBehavior] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPanelBehavior")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PanelBehavior]]
  
  inline def setOptions(options: PanelOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setOptions(options: PanelOptions, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPanelBehavior(behavior: PanelBehavior): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPanelBehavior")(behavior.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPanelBehavior(behavior: PanelBehavior, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPanelBehavior")(behavior.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
