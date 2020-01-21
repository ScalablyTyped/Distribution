package typings.bizcharts.mod

import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps
  extends Props[js.Any] {
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[
    String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
  ] = js.undefined
  var formatter: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double
  ] = js.undefined
  var htmlTemplate: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String
  ] = js.undefined
  var labelEmit: js.UndefOr[Boolean] = js.undefined
  var labelLine: js.UndefOr[
    (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
  ] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[text | (js.Function1[/* t */ js.UndefOr[js.Any], text])] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    content: String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]]) = null,
    formatter: (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double = null,
    htmlTemplate: (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String = null,
    key: Key = null,
    labelEmit: js.UndefOr[Boolean] = js.undefined,
    labelLine: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean = null,
    offset: Int | Double = null,
    ref: LegacyRef[js.Any] = null,
    textStyle: text | (js.Function1[/* t */ js.UndefOr[js.Any], text]) = null
  ): LabelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (htmlTemplate != null) __obj.updateDynamic("htmlTemplate")(htmlTemplate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(labelEmit)) __obj.updateDynamic("labelEmit")(labelEmit.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

