package typings.babylonjs.BABYLON

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspectorOptions extends StObject {
  
  /**
    * Display in embed mode (both panes on the right)
    */
  var embedMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow the panes to be closed by users (default: true)
    */
  var enableClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow the panes to popup (default: true)
    */
  var enablePopup: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional list of extensibility entries
    */
  var explorerExtensibility: js.UndefOr[js.Array[IExplorerExtensibilityGroup]] = js.native
  
  /**
    * HTML element to use as root (the parent of the rendering canvas will be used as default value)
    */
  var globalRoot: js.UndefOr[HTMLElement] = js.native
  
  /**
    * let the Inspector handles resize of the canvas when panes are resized (default to true)
    */
  var handleResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional initial tab (default to DebugLayerTab.Properties)
    */
  var initialTab: js.UndefOr[DebugLayerTab] = js.native
  
  /**
    * Optional URL to get the inspector script from (by default it uses the babylonjs CDN).
    */
  var inspectorURL: js.UndefOr[String] = js.native
  
  /**
    * Display in overlay mode (default: false)
    */
  var overlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Display the Scene explorer
    */
  var showExplorer: js.UndefOr[Boolean] = js.native
  
  /**
    * Display the property inspector
    */
  var showInspector: js.UndefOr[Boolean] = js.native
}
object IInspectorOptions {
  
  @scala.inline
  def apply(): IInspectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInspectorOptions]
  }
  
  @scala.inline
  implicit class IInspectorOptionsMutableBuilder[Self <: IInspectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbedMode(value: Boolean): Self = StObject.set(x, "embedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedModeUndefined: Self = StObject.set(x, "embedMode", js.undefined)
    
    @scala.inline
    def setEnableClose(value: Boolean): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
    
    @scala.inline
    def setEnablePopup(value: Boolean): Self = StObject.set(x, "enablePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePopupUndefined: Self = StObject.set(x, "enablePopup", js.undefined)
    
    @scala.inline
    def setExplorerExtensibility(value: js.Array[IExplorerExtensibilityGroup]): Self = StObject.set(x, "explorerExtensibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplorerExtensibilityUndefined: Self = StObject.set(x, "explorerExtensibility", js.undefined)
    
    @scala.inline
    def setExplorerExtensibilityVarargs(value: IExplorerExtensibilityGroup*): Self = StObject.set(x, "explorerExtensibility", js.Array(value :_*))
    
    @scala.inline
    def setGlobalRoot(value: HTMLElement): Self = StObject.set(x, "globalRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalRootUndefined: Self = StObject.set(x, "globalRoot", js.undefined)
    
    @scala.inline
    def setHandleResize(value: Boolean): Self = StObject.set(x, "handleResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleResizeUndefined: Self = StObject.set(x, "handleResize", js.undefined)
    
    @scala.inline
    def setInitialTab(value: DebugLayerTab): Self = StObject.set(x, "initialTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTabUndefined: Self = StObject.set(x, "initialTab", js.undefined)
    
    @scala.inline
    def setInspectorURL(value: String): Self = StObject.set(x, "inspectorURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectorURLUndefined: Self = StObject.set(x, "inspectorURL", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setShowExplorer(value: Boolean): Self = StObject.set(x, "showExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowExplorerUndefined: Self = StObject.set(x, "showExplorer", js.undefined)
    
    @scala.inline
    def setShowInspector(value: Boolean): Self = StObject.set(x, "showInspector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInspectorUndefined: Self = StObject.set(x, "showInspector", js.undefined)
  }
}
