package typings.bizcharts.bizchartsMod

import typings.atAntvG2.atAntvG2Mod.Styles.line
import typings.bizcharts.Anon_DodgeBy
import typings.bizcharts.Anon_Name
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeomProps
  extends Props[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  var adjust: js.UndefOr[String | (js.Array[Anon_DodgeBy | String])] = js.undefined
   // 图形激活交互开关
  var animate: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[
    String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String])
  ] = js.undefined
  var line: js.UndefOr[typings.atAntvG2.atAntvG2Mod.Styles.line | Boolean] = js.undefined
  var opacity: js.UndefOr[
    String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]])
  ] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[Boolean | (js.Tuple2[Boolean, _])] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[
    String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])])
  ] = js.undefined
  var size: js.UndefOr[
    Double | String | (js.Tuple2[
      String, 
      (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
    ])
  ] = js.undefined
  var style: js.UndefOr[js.Object | (js.Tuple2[String, js.Object])] = js.undefined
  var tooltip: js.UndefOr[
    Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, Anon_Name]])
  ] = js.undefined
  var `type`: js.UndefOr[GeomType] = js.undefined
}

object GeomProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    adjust: String | (js.Array[Anon_DodgeBy | String]) = null,
    animate: js.Any = null,
    children: ReactNode = null,
    color: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String]) = null,
    key: Key = null,
    line: line | Boolean = null,
    opacity: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]]) = null,
    position: String = null,
    ref: LegacyRef[js.Any] = null,
    select: Boolean | (js.Tuple2[Boolean, _]) = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    shape: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])]) = null,
    size: Double | String | (js.Tuple2[
      String, 
      (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
    ]) = null,
    style: js.Object | (js.Tuple2[String, js.Object]) = null,
    tooltip: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, Anon_Name]]) = null,
    `type`: GeomType = null
  ): GeomProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (adjust != null) __obj.updateDynamic("adjust")(adjust.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeomProps]
  }
}

