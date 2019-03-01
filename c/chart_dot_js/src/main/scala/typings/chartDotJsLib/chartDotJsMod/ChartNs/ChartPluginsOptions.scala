package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: declare plugin options as interface instead of inline '{ [plugin: string]: any }'
// to allow module augmentation in case some plugins want to strictly type their options.
trait ChartPluginsOptions
  extends /* pluginId */ org.scalablytyped.runtime.StringDictionary[js.Any]

object ChartPluginsOptions {
  @scala.inline
  def apply(StringDictionary: /* pluginId */ org.scalablytyped.runtime.StringDictionary[js.Any] = null): ChartPluginsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ChartPluginsOptions]
  }
}

