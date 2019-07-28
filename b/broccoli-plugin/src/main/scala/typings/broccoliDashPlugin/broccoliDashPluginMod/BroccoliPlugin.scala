package typings.broccoliDashPlugin.broccoliDashPluginMod

import typings.broccoliDashPlugin.Anon_Build
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroccoliPlugin extends js.Object {
  /**
    * The path on disk to an auxiliary cache directory. Use this to store
    * files that you want preserved between builds. This directory will
    * only be deleted when Broccoli exits. If a cache directory is not
    * needed, set `needsCache` to false when calling `broccoli-plugin`
    * constructor.
    */
  val cachePath: js.UndefOr[String] = js.undefined
  /**
    * An array of paths on disk corresponding to each node in `inputNodes`.
    * Your plugin will read files from these paths.
    */
  val inputPaths: js.Array[String]
  /**
    * The path on disk corresponding to this plugin instance (this node).
    * Your plugin will write files to this path. This directory is emptied by
    * Broccoli before each build, unless the `persistentOutput` options is
    * `true`.
    */
  val outputPath: String
  /**
    * Override this method in your subclass. It will be called on each
    * (re-)build. All paths stay the same between builds.
    * To perform asynchronous work, return a promise.
    */
  def build(): Unit | js.Promise[_]
  /**
    * Advanced usage only.
    * Return the object on which Broccoli will call `obj.build()`. Called
    * once after instantiation. By default, returns `this`.
    */
  def getCallbackObject(): Anon_Build
}

object BroccoliPlugin {
  @scala.inline
  def apply(
    build: () => Unit | js.Promise[_],
    getCallbackObject: () => Anon_Build,
    inputPaths: js.Array[String],
    outputPath: String,
    cachePath: String = null
  ): BroccoliPlugin = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), getCallbackObject = js.Any.fromFunction0(getCallbackObject), inputPaths = inputPaths, outputPath = outputPath)
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath)
    __obj.asInstanceOf[BroccoliPlugin]
  }
}

