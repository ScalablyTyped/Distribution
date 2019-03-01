package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used by SceneLoader plugins to define supported file extensions
  */
trait ISceneLoaderPluginExtensions
  extends /**
  * Defines the list of supported extensions
  */
/* extension */ org.scalablytyped.runtime.StringDictionary[babylonjsLib.Anon_IsBinary]

object ISceneLoaderPluginExtensions {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Defines the list of supported extensions
    */
  /* extension */ org.scalablytyped.runtime.StringDictionary[babylonjsLib.Anon_IsBinary] = null
  ): ISceneLoaderPluginExtensions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ISceneLoaderPluginExtensions]
  }
}

