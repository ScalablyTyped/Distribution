package typings.bandagedbdBdapi.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bandagedbd/bdapi", "BdApi")
@js.native
object BdApi extends js.Object {
  
  /**
    * Creates an shows an alert modal to the user. A preview of how it may look can be found [here](https://i.zackrauen.com/7qnnNC.png).
    * @param title The title to show on the modal.
    * @param content Content to show in the modal (can be html string).
    */
  def alert(title: String, content: String): Unit = js.native
  
  /**
    * Removes a style added with `injectCSS` below.
    * @param id ID of the node to remove.
    */
  def clearCSS(id: String): Unit = js.native
  
  /**
    * Deletes some saved data for plugin `pluginName` with key `key`.
    * @param pluginName Which plugin this is being used for.
    * @param key Key for which data should be deleted.
    */
  def deleteData(pluginName: String, key: String): Unit = js.native
  
  /**
    * Disables a BBD setting by id.
    * @param id Id for the setting.
    */
  def disableSetting(id: String): Unit = js.native
  
  /**
    * Gives access to BBD's internal emotes object and is therefore subject to change.
    */
  val emotes: js.Any = js.native
  
  /**
    * Enables a BBD setting by id.
    * @param id Id for the setting.
    */
  def enableSetting(id: String): Unit = js.native
  
  /**
    * Searches for multiple internal Discord webpack module based on `filter`. It's the same as `findModule` but will return all matches.
    * @param filter A function to use to filter modules.
    * @returns The modules found or null if none were found.
    */
  def findAllModules(filter: js.Function0[Unit]): js.Array[_] = js.native
  
  /**
    * Searches for an internal Discord webpack module based on `filter`.
    * @param filter A function to use to filter modules.
    * @returns The modules found or null if none were found.
    */
  def findModule(filter: js.Function0[Unit]): js.Any = js.native
  
  /**
    * Searches for an internal Discord webpack module with a specific `displayName` value.
    * @param name The `displayName` to look for.
    * @returns The modules found or null if none were found.
    */
  def findModuleByDisplayName(name: String): js.Any = js.native
  
  /**
    * Searches for an internal Discord webpack module that has every property passed.
    * @param props A series of properties to check for.
    * @returns The modules found or null if none were found.
    */
  def findModuleByProps(props: String*): js.Any = js.native
  
  /**
    * Searches for an internal Discord webpack module that has every property passed on its prototype.
    * @param props A series of prototype properties to check for
    * @returns The modules found or null if none were found..
    */
  def findModuleByPrototypes(props: String*): js.Any = js.native
  
  /**
    * Returns BandagedBD's instance of the core module. Only use this if you know what you are doing.
    * @deprecated since 2020.3.27
    * @returns BBD's instantiated core module.
    */
  def getCore(): js.Any = js.native
  
  // Not worth it in my opinion because it's deprecated (commit caf3406e0a22a24dc5ad76d9c51edb3330d379b7)
  /**
    * Alias for loadData(pluginName, key)
    * @param pluginName Which plugin this is being used for.
    * @param key Key for which data should be returned.
    * @returns The information that was saved previously, or null otherwise.
    */
  def getData(pluginName: String, key: String): js.Any = js.native
  
  /**
    * Gets the internal react instance for a particular node.
    * @param node jQuery
    * @returns The instance if found or undefined otherwise.
    */
  def getInternalInstance(node: HTMLElement): js.UndefOr[js.Object] = js.native
  
  /**
    * Gets the instance of another plugin with the name `name`.
    * @deprecated since unknown
    * @param name Name of the plugin to retreive.
    * @returns The plugin if found or null otherwise.
    */
  def getPlugin(name: String): js.Object | Null = js.native
  
  /**
    * Adds a block of css to the current document's `head`.
    * @param id Identifier for the node to be added. Can be used later with `clearCSS` from above.
    * @param css String of css to be added.
    * @returns The plugin if found or null otherwise.
    */
  def injectCSS(id: String, css: String): js.Object | Null = js.native
  
  /**
    * Links some remote JavaScript to be added to the page. Useful for libraries like `Sortable.js`.
    * @param id Identifier for the node to be added. Can be used later with `unlinkJS` below.
    * @param url URL of the js.
    */
  def linkJS(id: String, url: String): Unit = js.native
  
  /**
    * Gets some saved data for plugin `pluginName` with key `key`. Data can be saved with `saveData`.
    * @param pluginName Which plugin this is being used for.
    * @param key Key for which data should be returned.
    * @returns The information that was saved previously, or null otherwise.
    */
  def loadData(pluginName: String, key: String): js.Any = js.native
  
  /**
    * This function monkey-patches a method on an object. The patching callback may be run before, after or instead of target method.
    * - Be careful when monkey-patching. Think not only about original functionality of target method and your changes,
    * but also about developers of other plugins, who may also patch this method before or after you.
    * Try to change target method behaviour as little as possible, and avoid changing method signatures.
    * - Display name of patched method is changed, so you can see if a function has been patched (and how many times) while debugging or in the stack trace.
    * Also, patched methods have property `__monkeyPatched` set to `true`, in case you want to check something programmatically.
    * @param module Object to be patched. You can can also pass class prototypes to patch all class instances.
    * @param methodName The name of the target message to be patched.
    * @param options Options object. You should provide at least one of `before`, `after` or `instead` parameters. Other parameters are optional.
    * @param options.once Set to `true` if you want to automatically unpatch method after first call.
    * @param options.silent Set to `true` if you want to suppress log messages about patching and unpatching.
    * Useful to avoid clogging the console in case of frequent conditional patching/unpatching, for example from another monkeyPatch callback.
    * @param options.displayName You can provide meaningful name for class/object provided in `what` param for logging purposes.
    * By default, this function will try to determine name automatically.
    * @param options.before Callback that will be called before original target method call. You can modify arguments here, so it will be passed to original method.Can be combined with `after`.
    * @param options.after Callback that will be called after original target method call. You can modify return value here, so it will be passed to external code which calls target method.
    * Can be combined with `before`.
    * @param options.instead Callback that will be called instead of original target method call.
    * You can get access to original method using `originalMethod` parameter if you want to call it, but you do not have to.
    * Can't be combined with `before` and `after`.
    * @returns A cancel function which allows you to undo the patch.
    */
  def monkeyPatch(module: js.Object, methodName: String, options: MonkeyPatchOptions): CancelPatch = js.native
  
  /**
    * Adds a listener for when the node is removed from the document body.
    * @param node Node to wait for.
    * @param callback Function to be performed on event.
    */
  def onRemoved(node: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Saved some `data` for plugin `pluginName` under `key` key. Gets saved in the plugins folder under `pluginName.config.json`. Data can be saved with `loadData`.
    * @param pluginName Which plugin this is being used for.
    * @param key Key for the data should be saved under.
    * @param data Data to save.
    */
  def saveData(pluginName: String, key: String, data: js.Any): Unit = js.native
  
  /**
    * Yields the total active height of the application.
    */
  val screenHeight: Double = js.native
  
  /**
    * Yields the total active width of the application.
    */
  val screenWidth: Double = js.native
  
  /**
    * Alias for saveData(pluginName, key, data)
    * @param pluginName Which plugin this is being used for.
    * @param key Key for the data should be saved under.
    * @param data Data to save.
    */
  def setData(pluginName: String, key: String, data: js.Any): Unit = js.native
  
  /**
    * Gives access to BBD's internal settings object and is therefore subject to change.
    */
  val settings: js.Any = js.native
  
  /**
    * Shows a generic but very customizable confirmation modal with optional confirm and cancel callbacks.
    * @param title Title of the modal.
    * @param content A single or mixed array of react elements and strings. Everything is wrapped in Discord's `TextElement` component so strings will show and render properly.
    * @param options Options to modify the modal.
    * @param options.danger Whether the main button should be red or not.
    * @param options.confirmText Text for the confirmation/submit button.
    * @param options.canceltext Text for the cancel button.
    * @param options.onConfirm Callback to occur when clicking the submit button.
    * @param options.onCancel Callback to occur when clicking the cancel button.
    */
  def showConfirmationModal(title: String, content: String): Unit = js.native
  def showConfirmationModal(title: String, content: String, options: ConfirmationModalOptions): Unit = js.native
  
  /**
    * Shows a simple toast message similar to on Android. An example of the `success` toast can be seen [here](https://i.zackrauen.com/zIagVa.png).
    * @param content Content to show inside the toast.
    * @param options Options for the toast.
    * @param options.type Changes the type of the toast stylistically and semantically. Choices: "", "info", "success", "danger"/"error", "warning"/"warn". Default: ""
    * @param options.icon Determines whether the icon should show corresponding to the type. A toast without type will always have no icon. Default: true
    * @param options.timeout Adjusts the time (in ms) the toast should be shown for before disappearing automatically. Default: 3000
    */
  def showToast(content: String): Unit = js.native
  def showToast(content: String, options: ToastOptions): Unit = js.native
  
  /**
    * Wraps a function in a try catch block.
    * @param method Function to wrap.
    * @param message Additional info for any errors.
    */
  def suppressErrors(method: js.Function0[Unit]): js.Function0[Unit] = js.native
  def suppressErrors(method: js.Function0[Unit], message: String): js.Function0[Unit] = js.native
  
  /**
    * Determines if the input is valid and parseable JSON.
    * @param data Data to test.
    * @returns True if the data is valid, false otherwise.
    */
  def testJSON(data: String): Boolean = js.native
  
  /**
    * Toggles a BBD setting by id.
    * @param id Id for the setting.
    */
  def toggleOption(id: String): Unit = js.native
  
  /**
    * Removes some previously linked JS by `linkJS`.
    * @param id ID of the node to remove.
    */
  def unlinkJS(id: String): Unit = js.native
}
