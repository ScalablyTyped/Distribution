package typings
package atBandagedbdBdapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Alert extends js.Object {
  /**
  	 * Creates an shows an alert modal to the user. A preview of how it may look can be found [here](https://i.zackrauen.com/7qnnNC.png).
  	 */
  def alert(title: java.lang.String, content: java.lang.String): scala.Unit = js.native
  /**
  	 * Removes a style added with [`injectCSS`](#injectcssid-css) below.
  	 */
  def clearCSS(id: java.lang.String): scala.Unit = js.native
  /**
  	 * Deletes some saved data for plugin `pluginName` with key `key`.
  	 */
  def deleteData(pluginName: java.lang.String, key: java.lang.String): scala.Unit = js.native
  /**
  	 * Searches for multiple internal Discord webpack module based on `filter`. It's the same as [`findModule`](#findmodulefilter) but will return all matches
  	 */
  def findAllModules(filter: js.Function0[scala.Unit]): js.Array[_] = js.native
  /**
  	 * Searches for an internal Discord webpack module based on `filter`.
  	 */
  def findModule(filter: js.Function0[scala.Unit]): js.Any = js.native
  /**
  	 * Searches for an internal Discord webpack module that has every property passed.
  	 */
  def findModuleByProps(props: java.lang.String*): js.Any = js.native
  /**
  	 * Returns BandagedBD's instance of the core module. Only use this if you know what you are doing.
  	 */
  def getCore(): js.Any = js.native
  /**
  	 * Alias for [loadData(pluginName, key)](#loaddatapluginname-key)
  	 */
  def getData(pluginName: java.lang.String, key: java.lang.String): js.Any = js.native
  /**
  	 * Gets the internal react instance for a particular node.
  	 */
  def getInternalInstance(node: reactLib.HTMLElement): js.UndefOr[js.Object] = js.native
  /**
  	 * Gets the instance of another plugin with the name `name`.
  	 */
  def getPlugin(name: java.lang.String): js.Object | scala.Null = js.native
  /**
  	 * Adds a block of css to the current document's `head`.
  	 */
  def injectCSS(id: java.lang.String, css: java.lang.String): js.Object | scala.Null = js.native
  /**
  	 * Links some remote JavaScript to be added to the page. Useful for libraries like `Sortable.js`.
  	 */
  def linkJS(id: java.lang.String, url: java.lang.String): scala.Unit = js.native
  /**
  	 * Gets some saved data for plugin `pluginName` with key `key`. Data can be saved with [`saveData`](#savedatapluginname-key-data).
  	 */
  def loadData(pluginName: java.lang.String, key: java.lang.String): js.Any = js.native
  /**
  	 * This function monkey-patches a method on an object. The patching callback may be run before, after or instead of target method.
  	 * - Be careful when monkey-patching. Think not only about original functionality of target method and your changes,
  	 * but also about developers of other plugins, who may also patch this method before or after you.
  	 * Try to change target method behaviour as little as possible, and avoid changing method signatures.
  	 * - Display name of patched method is changed, so you can see if a function has been patched (and how many times) while debugging or in the stack trace.
  	 * Also, patched methods have property `__monkeyPatched` set to `true`, in case you want to check something programmatically.
  	 */
  def monkeyPatch(
    module: js.Object,
    methodName: java.lang.String,
    options: atBandagedbdBdapiLib.atBandagedbdBdapiMod.MonkeyPatchOptions
  ): atBandagedbdBdapiLib.atBandagedbdBdapiMod.CancelPatch = js.native
  /**
  	 * Adds a listener for when the node is removed from the document body.
  	 */
  def onRemoved(node: reactLib.HTMLElement, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  	 * Saved some `data` for plugin `pluginName` under `key` key. Gets saved in the plugins folder under `pluginName.config.json`. Data can be saved with [`loadData`](#loaddatapluginname-key).
  	 */
  def saveData(pluginName: java.lang.String, key: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
  	 * Alias for [saveData(pluginName, key, data)](#savedatapluginname-key-data)
  	 *
  	 */
  def setData(pluginName: java.lang.String, key: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
  	 * Shows a simple toast message similar to on Android. An example of the `success` toast can be seen [here](https://i.zackrauen.com/zIagVa.png).
  	 */
  def showToast(content: java.lang.String): scala.Unit = js.native
  def showToast(content: java.lang.String, options: atBandagedbdBdapiLib.atBandagedbdBdapiMod.ToastOptions): scala.Unit = js.native
  /**
  	 * Wraps a function in a try catch block.
  	 */
  def suppressErrors(method: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def suppressErrors(method: js.Function0[scala.Unit], message: java.lang.String): js.Function0[scala.Unit] = js.native
  /**
  	 * Determines if the input is valid and parseable JSON.
  	 */
  def testJSON(data: java.lang.String): scala.Boolean = js.native
  /**
  	 * Removes some previously linked JS by [`linkJS`](#linkjsid-url).
  	 */
  def unlinkJS(id: java.lang.String): scala.Unit = js.native
}

