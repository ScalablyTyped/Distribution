package typings.c3.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartInternal
  extends /* key */ StringDictionary[js.Any] {
  /** Access the external Chart API. */
  var api: ChartAPI
}

object ChartInternal {
  @scala.inline
  def apply(api: ChartAPI, StringDictionary: /* name */ StringDictionary[js.Any] = null): ChartInternal = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ChartInternal]
  }
}

