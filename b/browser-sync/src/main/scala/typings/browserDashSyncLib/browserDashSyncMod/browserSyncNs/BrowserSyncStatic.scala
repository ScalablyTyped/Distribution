package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserSyncStatic extends BrowserSyncInstance {
  /**
    *
    */
  var instances: js.Array[BrowserSyncInstance] = js.native
  /**
    * Start the Browsersync service. This will launch a server, proxy or start the snippet mode
    * depending on your use-case.
    */
  def apply(): BrowserSyncInstance = js.native
  def apply(config: Options): BrowserSyncInstance = js.native
  def apply(config: Options, callback: js.Function2[/* err */ nodeLib.Error, /* bs */ js.Object, _]): BrowserSyncInstance = js.native
  /**
    * Create a Browsersync instance
    * @param name an identifier that can used for retrieval later
    */
  def create(): BrowserSyncInstance = js.native
  def create(name: java.lang.String): BrowserSyncInstance = js.native
  def create(name: java.lang.String, emitter: nodeLib.NodeJSNs.EventEmitter): BrowserSyncInstance = js.native
  /**
    * Get a single instance by name. This is useful if you have your build scripts in separate files
    * @param name the identifier used for retrieval
    */
  def get(name: java.lang.String): BrowserSyncInstance = js.native
  /**
    * Check if an instance has been created.
    * @param name the name of the instance
    */
  def has(name: java.lang.String): scala.Boolean = js.native
  /**
    * Reset the state of the module.
    * (should only be needed for test environments)
    */
  def reset(): scala.Unit = js.native
}

