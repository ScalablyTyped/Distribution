package typings.bizcharts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bizcharts.AnonX
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewProps
  extends Props[js.Any] {
  var animate: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var end: js.UndefOr[AnonX] = js.undefined
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var start: js.UndefOr[AnonX] = js.undefined
}

object ViewProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    data: js.Any = null,
    end: AnonX = null,
    filter: js.Array[_] = null,
    id: String = null,
    key: Key = null,
    ref: LegacyRef[js.Any] = null,
    scale: StringDictionary[js.Any] = null,
    start: AnonX = null
  ): ViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewProps]
  }
}

