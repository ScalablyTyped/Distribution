package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserSyncInstance extends js.Object {
  /**
    * A simple true/false flag that you can use to determine if there's a currently-running Browsersync instance.
    */
  var active: scala.Boolean = js.native
  /**
    * The internal Event Emitter used by the running Browsersync instance (if there is one). You can use
    * this to emit your own events, such as changed files, logging etc.
    */
  var emitter: nodeLib.NodeJSNs.EventEmitter = js.native
  /** the name of this instance of browser-sync */
  var name: java.lang.String = js.native
  /**
    * A simple true/false flag to determine if the current instance is paused
    */
  var paused: scala.Boolean = js.native
  /**
    * Instance Cleanup.
    */
  def cleanup(): scala.Unit = js.native
  def cleanup(fn: js.Function2[/* error */ nodeLib.NodeJSNs.ErrnoException, /* bs */ this.type, scala.Unit]): scala.Unit = js.native
  /**
    * This method will close any running server, stop file watching & exit the current process.
    */
  def exit(): scala.Unit = js.native
  /**
    * Callback helper to examine what options have been set.
    * @param {string} name The key to search options map for.
    */
  def getOption(name: java.lang.String): js.Any = js.native
  /**
    * Start the Browsersync service. This will launch a server, proxy or start the snippet mode
    * depending on your use-case.
    */
  def init(): BrowserSyncInstance = js.native
  def init(config: Options): BrowserSyncInstance = js.native
  def init(config: Options, callback: js.Function2[/* err */ stdLib.Error, /* bs */ js.Object, _]): BrowserSyncInstance = js.native
  /**
    * Helper method for browser notifications
    * @param message Can be a simple message such as 'Connected' or HTML
    * @param timeout How long the message will remain in the browser. @since 1.3.0
    */
  def notify(message: java.lang.String): scala.Unit = js.native
  def notify(message: java.lang.String, timeout: scala.Double): scala.Unit = js.native
  /**
    * Method to pause file change events
    */
  def pause(): scala.Unit = js.native
  /**
    * Reload the browser
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(): scala.Unit = js.native
  /**
    * Reload a single file
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(file: java.lang.String): scala.Unit = js.native
  /**
    * Reload multiple files
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(files: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * The reload method will inform all browsers about changed files and will either cause the browser
    * to refresh, or inject the files where possible.
    */
  def reload(options: browserDashSyncLib.Anon_Stream): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
    * Method to resume paused watchers
    */
  def resume(): scala.Unit = js.native
  /**
    * The stream method returns a transform stream and can act once or on many files.
    * @param opts Configuration for the stream method
    */
  def stream(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def stream(opts: StreamOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
    * Register a plugin.
    * Must implement at least a 'plugin' property that returns
    * callable function.
    *
    * @method use
    * @param {object} module The object to be `required`.
    * @param {object} options The
    * @param {any} cb A callback function that will return any errors.
    */
  def use(module: browserDashSyncLib.Anon_Bs): scala.Unit = js.native
  def use(module: browserDashSyncLib.Anon_Bs, options: js.Object): scala.Unit = js.native
  def use(module: browserDashSyncLib.Anon_Bs, options: js.Object, cb: js.Any): scala.Unit = js.native
  /**
    * Stand alone file-watcher. Use this along with Browsersync to create your own, minimal build system
    */
  def watch(patterns: java.lang.String): nodeLib.NodeJSNs.EventEmitter = js.native
  def watch(patterns: java.lang.String, opts: chokidarLib.chokidarMod.WatchOptions): nodeLib.NodeJSNs.EventEmitter = js.native
  def watch(
    patterns: java.lang.String,
    opts: chokidarLib.chokidarMod.WatchOptions,
    fn: js.Function2[/* event */ java.lang.String, /* file */ nodeLib.fsMod.Stats, _]
  ): nodeLib.NodeJSNs.EventEmitter = js.native
}

