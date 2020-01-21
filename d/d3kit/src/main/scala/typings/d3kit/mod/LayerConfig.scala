package typings.d3kit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerConfig
  extends /* layerName */ StringDictionary[String | (js.Array[LayerConfig | String]) | LayerConfig]

object LayerConfig {
  @scala.inline
  def apply(
    StringDictionary: /* layerName */ StringDictionary[String | (js.Array[LayerConfig | String]) | LayerConfig] = null
  ): LayerConfig = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LayerConfig]
  }
}

