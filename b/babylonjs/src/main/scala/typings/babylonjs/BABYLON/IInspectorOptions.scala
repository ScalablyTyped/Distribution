package typings.babylonjs.BABYLON

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspectorOptions extends js.Object {
  
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
  implicit class IInspectorOptionsOps[Self <: IInspectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmbedMode(value: Boolean): Self = this.set("embedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbedMode: Self = this.set("embedMode", js.undefined)
    
    @scala.inline
    def setEnableClose(value: Boolean): Self = this.set("enableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClose: Self = this.set("enableClose", js.undefined)
    
    @scala.inline
    def setEnablePopup(value: Boolean): Self = this.set("enablePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePopup: Self = this.set("enablePopup", js.undefined)
    
    @scala.inline
    def setExplorerExtensibilityVarargs(value: IExplorerExtensibilityGroup*): Self = this.set("explorerExtensibility", js.Array(value :_*))
    
    @scala.inline
    def setExplorerExtensibility(value: js.Array[IExplorerExtensibilityGroup]): Self = this.set("explorerExtensibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplorerExtensibility: Self = this.set("explorerExtensibility", js.undefined)
    
    @scala.inline
    def setGlobalRoot(value: HTMLElement): Self = this.set("globalRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalRoot: Self = this.set("globalRoot", js.undefined)
    
    @scala.inline
    def setHandleResize(value: Boolean): Self = this.set("handleResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleResize: Self = this.set("handleResize", js.undefined)
    
    @scala.inline
    def setInitialTab(value: DebugLayerTab): Self = this.set("initialTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialTab: Self = this.set("initialTab", js.undefined)
    
    @scala.inline
    def setInspectorURL(value: String): Self = this.set("inspectorURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectorURL: Self = this.set("inspectorURL", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setShowExplorer(value: Boolean): Self = this.set("showExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowExplorer: Self = this.set("showExplorer", js.undefined)
    
    @scala.inline
    def setShowInspector(value: Boolean): Self = this.set("showInspector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInspector: Self = this.set("showInspector", js.undefined)
  }
}
