package typings.babylonjs.BABYLON

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInspectorOptions extends js.Object {
  /**
    * Display in embed mode (both panes on the right)
    */
  var embedMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow the panes to be closed by users (default: true)
    */
  var enableClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow the panes to popup (default: true)
    */
  var enablePopup: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional list of extensibility entries
    */
  var explorerExtensibility: js.UndefOr[js.Array[IExplorerExtensibilityGroup]] = js.undefined
  /**
    * HTML element to use as root (the parent of the rendering canvas will be used as default value)
    */
  var globalRoot: js.UndefOr[HTMLElement] = js.undefined
  /**
    * let the Inspector handles resize of the canvas when panes are resized (default to true)
    */
  var handleResize: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional initial tab (default to DebugLayerTab.Properties)
    */
  var initialTab: js.UndefOr[DebugLayerTab] = js.undefined
  /**
    * Optional URL to get the inspector script from (by default it uses the babylonjs CDN).
    */
  var inspectorURL: js.UndefOr[String] = js.undefined
  /**
    * Display in overlay mode (default: false)
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Display the Scene explorer
    */
  var showExplorer: js.UndefOr[Boolean] = js.undefined
  /**
    * Display the property inspector
    */
  var showInspector: js.UndefOr[Boolean] = js.undefined
}

object IInspectorOptions {
  @scala.inline
  def apply(
    embedMode: js.UndefOr[Boolean] = js.undefined,
    enableClose: js.UndefOr[Boolean] = js.undefined,
    enablePopup: js.UndefOr[Boolean] = js.undefined,
    explorerExtensibility: js.Array[IExplorerExtensibilityGroup] = null,
    globalRoot: HTMLElement = null,
    handleResize: js.UndefOr[Boolean] = js.undefined,
    initialTab: DebugLayerTab = null,
    inspectorURL: String = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    showExplorer: js.UndefOr[Boolean] = js.undefined,
    showInspector: js.UndefOr[Boolean] = js.undefined
  ): IInspectorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(embedMode)) __obj.updateDynamic("embedMode")(embedMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enableClose)) __obj.updateDynamic("enableClose")(enableClose.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePopup)) __obj.updateDynamic("enablePopup")(enablePopup.asInstanceOf[js.Any])
    if (explorerExtensibility != null) __obj.updateDynamic("explorerExtensibility")(explorerExtensibility.asInstanceOf[js.Any])
    if (globalRoot != null) __obj.updateDynamic("globalRoot")(globalRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(handleResize)) __obj.updateDynamic("handleResize")(handleResize.asInstanceOf[js.Any])
    if (initialTab != null) __obj.updateDynamic("initialTab")(initialTab.asInstanceOf[js.Any])
    if (inspectorURL != null) __obj.updateDynamic("inspectorURL")(inspectorURL.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(showExplorer)) __obj.updateDynamic("showExplorer")(showExplorer.asInstanceOf[js.Any])
    if (!js.isUndefined(showInspector)) __obj.updateDynamic("showInspector")(showInspector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectorOptions]
  }
}

