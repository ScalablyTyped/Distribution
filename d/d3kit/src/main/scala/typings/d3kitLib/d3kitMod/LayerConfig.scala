package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerConfig
  extends /* layerName */ org.scalablytyped.runtime.StringDictionary[
      java.lang.String | js.Array[java.lang.String] | LayerConfig | js.Array[LayerConfig]
    ]

object LayerConfig {
  @scala.inline
  def apply(
    StringDictionary: /* layerName */ org.scalablytyped.runtime.StringDictionary[
      java.lang.String | js.Array[java.lang.String] | LayerConfig | js.Array[LayerConfig]
    ] = null
  ): LayerConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LayerConfig]
  }
}

