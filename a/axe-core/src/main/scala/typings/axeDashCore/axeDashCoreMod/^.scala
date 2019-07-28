package typings.axeDashCore.axeDashCoreMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	 * Object for axe Results
  	 */
  var AxeResults: typings.axeDashCore.axeDashCoreMod.AxeResults = js.native
  var plugins: js.Any = js.native
  /**
  	 * Source string to use as an injected script in Selenium
  	 */
  var source: String = js.native
  /**
  	 * Function to clean up plugin configuration in document and its subframes
  	 */
  def cleanup(): Unit = js.native
  /**
  	 * Method for configuring the data format used by axe. Helpful for adding new
  	 * rules, which must be registered with the library to execute.
  	 * @param  {Spec}       Spec Object with valid `branding`, `reporter`, `checks` and `rules` data
  	 */
  def configure(spec: Spec): Unit = js.native
  /**
  	 * Searches and returns rules that contain a tag in the list of tags.
  	 * @param  {Array}  tags  Optional array of tags
  	 * @return {Array}  Array of rules
  	 */
  def getRules(): js.Array[js.Object] = js.native
  def getRules(tags: js.Array[String]): js.Array[js.Object] = js.native
  /**
  	 * Function to register a plugin configuration in document and its subframes
  	 * @param  {Object}    plugin    A plugin configuration object
  	 */
  def registerPlugin(plugin: AxePlugin): Unit = js.native
  /**
  	 * Restores the default axe configuration
  	 */
  def reset(): Unit = js.native
  /**
  	 * Runs a number of rules against the provided HTML page and returns the resulting issue list
  	 *
  	 * @param   {ElementContext} context  Optional The `Context` specification object @see Context
  	 * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  	 * @param   {RunCallback}    callback Optional The function to invoke when analysis is complete.
  	 * @returns {Promise<AxeResults>|void} If the callback was not defined, axe will return a Promise.
  	 */
  def run(): js.Promise[AxeResults] = js.native
  def run(callback: js.Function2[/* error */ Error, /* results */ AxeResults, Unit]): Unit = js.native
  def run(context: ElementContext): js.Promise[AxeResults] = js.native
  def run(context: ElementContext, callback: RunCallback): Unit = js.native
  def run(context: ElementContext, options: RunOptions): js.Promise[AxeResults] = js.native
  def run(context: ElementContext, options: RunOptions, callback: RunCallback): Unit = js.native
  def run(options: RunOptions): js.Promise[AxeResults] = js.native
  def run(options: RunOptions, callback: RunCallback): Unit = js.native
}

