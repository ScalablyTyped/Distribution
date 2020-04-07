package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISceneLoaderPluginFactory extends js.Object {
  /**
    * The callback that returns true if the data can be directly loaded.
    * @param data string containing the file data
    * @returns if the data can be loaded directly
    */
  var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.undefined
  /**
    * Defines the name of the factory
    */
  var name: String
  /**
    * Function called to create a new plugin
    * @return the new plugin
    */
  def createPlugin(): ISceneLoaderPlugin | ISceneLoaderPluginAsync
}

object ISceneLoaderPluginFactory {
  @scala.inline
  def apply(
    createPlugin: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync,
    name: String,
    canDirectLoad: /* data */ String => Boolean = null
  ): ISceneLoaderPluginFactory = {
    val __obj = js.Dynamic.literal(createPlugin = js.Any.fromFunction0(createPlugin), name = name.asInstanceOf[js.Any])
    if (canDirectLoad != null) __obj.updateDynamic("canDirectLoad")(js.Any.fromFunction1(canDirectLoad))
    __obj.asInstanceOf[ISceneLoaderPluginFactory]
  }
}

