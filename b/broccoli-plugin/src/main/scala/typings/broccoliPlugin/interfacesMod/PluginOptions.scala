package typings.broccoliPlugin.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  /**
    * A descriptive annotation. Useful for debugging, to tell multiple instances of the same plugin apart.
    */
  var annotation: js.UndefOr[String] = js.undefined
  /**
    * The name of this plugin class. Defaults to this.constructor.name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * If true, a cache directory is created automatically and the path is set at cachePath.
    * If false, a cache directory is not created and this.cachePath is undefined. Defaults to true
    */
  var needsCache: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the output directory is not automatically emptied between builds.
    */
  var persistentOutput: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, a change object will be passed to the build method which contains
    * information about which input has changed since the last build. Defaults to false.
    */
  var trackInputChanges: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, memoization will not be applied and the build method will always be called regardless if the inputNodes have changed. Defaults to false.
    */
  var volatile: js.UndefOr[Boolean] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    annotation: String = null,
    name: String = null,
    needsCache: js.UndefOr[Boolean] = js.undefined,
    persistentOutput: js.UndefOr[Boolean] = js.undefined,
    trackInputChanges: js.UndefOr[Boolean] = js.undefined,
    volatile: js.UndefOr[Boolean] = js.undefined
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(needsCache)) __obj.updateDynamic("needsCache")(needsCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentOutput)) __obj.updateDynamic("persistentOutput")(persistentOutput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackInputChanges)) __obj.updateDynamic("trackInputChanges")(trackInputChanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volatile)) __obj.updateDynamic("volatile")(volatile.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}

